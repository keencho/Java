package sycho.java.algorithm.hackerrank.easy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// https://www.hackerrank.com/challenges/between-two-sets/problem
class BetweenTwoSetsResult {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        return (int) IntStream
                .range(0, (b.stream().min(Integer::compare).orElse(0) + 1))
                .mapToObj(idx -> b
                        .stream()
                        .map(integer -> {
                            if (idx != 0 && integer % idx == 0) {
                                return idx;
                            }
                            return 0;
                        })
                        .filter(integer -> integer != 0)
                        .collect(Collectors.toList())
                )
                .filter(list -> list.size() == b.size())
                .map(list -> list.stream().findAny().orElse(0))
                .collect(Collectors.toList())
                // 위까지 공약수 구하는 코드, 아래부터는 (공약수 % a의 요소 == 0) 인것들 추출하는 코드.
                .stream()
                .map(integer -> a
                        .stream()
                        .map(integer2 -> {
                            if (integer % integer2 == 0) {
                                return integer;
                            }
                            return 0;
                        })
                        .filter(integer2 -> integer2 != 0)
                        .collect(Collectors.toList())
                )
                .filter(list -> list.size() == a.size())
                .map(list -> list.stream().findAny().orElse(0)).count();
    }
}

public class BetweenTwoSets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int total = BetweenTwoSetsResult.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
