package sycho.java.algorithm.hackerrank.easy;

import java.io.*;

// https://www.hackerrank.com/challenges/time-conversion/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
class TimeConversionResult {
    public static String timeConversion(String str) {
        String ap = str.length() > 2 ? str.substring(str.length() - 2) : str;
        String conversion = str.split(ap)[0];

        int hour = Integer.parseInt(str.split(":")[0]);
        String [] split = conversion.split(":");
        if ("PM".equalsIgnoreCase(ap)) {
            if (hour != 12) {
                hour += 12;
            }
            conversion = hour + ":" + split[1] + ":" + split[2];
        } else {
            if (hour == 12) {
                conversion =  "00:" + split[1] + ":" + split[2];
            }
        }

        return conversion;
    }
}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = bufferedReader.readLine();
//
//        String result = TimeConversionResult.timeConversion(s);
//
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();

        TimeConversionResult.timeConversion("12:45:54PM");
    }
}
