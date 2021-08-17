package sycho.java.algorithm.hackerrank.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

// https://www.hackerrank.com/challenges/mini-max-sum/problem
class MiniMaxSumResult {

    public static void miniMaxSum(List<Integer> arr) {

        List<Long> sumList = LongStream.
                range(0, arr.size())
                .map(
                        idx1 -> LongStream
                                .range(0, arr.size())
                                .map(idx2 -> idx1 == idx2 ? 0 : arr.get((int) idx2))
                                .sum()
                )
                // boxed() 를 통해 원시타입을 참조타입으로 변경하여 Collect 가능하도록 함
                .boxed()
                .collect(Collectors.toList());

        long max = sumList.stream().max(Long::compare).orElse((long) -1);
        long min = sumList.stream().min(Long::compare).orElse((long) -1);

        System.out.print(min + " " + max);
    }

}

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        MiniMaxSumResult.miniMaxSum(arr);

        bufferedReader.close();

    }
}
