package sycho.java.algorithm.baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2908
public class p2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int j = scanner.nextInt();

        int ri = reverse(i);
        int rj = reverse(j);

        System.out.println(Math.max(ri, rj));
    }

    private static int reverse(int s) {
        int r = 0;

        while (s != 0) {
            int d = s % 10;
            r = r * 10 + d;

            s /= 10;
        }
        return r;
    }
}
