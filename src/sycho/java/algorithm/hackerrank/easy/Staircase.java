package sycho.java.algorithm.hackerrank.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.hackerrank.com/challenges/staircase/problem
class StaircaseResult {
    public static void staircase(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = n; j > 0; j--){
                if(i < j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}

public class Staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        StaircaseResult.staircase(n);

        bufferedReader.close();
    }
}
