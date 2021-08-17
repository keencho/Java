package sycho.java.algorithm.hackerrank.easy;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// https://www.hackerrank.com/challenges/birthday-cake-candles/problem?h_r=next-challenge&h_v=zen
class BirthdayCakeCandlesResult {
    public static int birthdayCakeCandles(List<Integer> candles) {

        Integer max = candles.stream().max(Integer::compare).orElse(0);

        return (int) candles.stream().filter(integer -> integer.equals(max)).count();
    }
}

public class BirthdayCakeCandles {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = BirthdayCakeCandlesResult.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
