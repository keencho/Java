package sycho.java.algorithm.hackerrank.easy;

import java.io.IOException;

// https://www.hackerrank.com/challenges/save-the-prisoner/problem
class SaveThePrisonerResult {
    public static int saveThePrisoner(int n, int m, int s) {

        // 시간복잡도를 신경 안쓰면..
        int c = 1;
        while(c < m) {
            if (s + 1 > n) {
                s = 1;
            } else {
                s ++;
            }
            c++;
        }

        System.out.println(s);

        // 신경쓴다면..!
        return ((s - 1) + (m - 1)) % n + 1;
    }
}

public class SaveThePrisoner {
    public static void main(String[] args) throws IOException {
        SaveThePrisonerResult.saveThePrisoner(7, 19, 2);
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int t = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, t).forEach(tItr -> {
//            try {
//                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//                int n = Integer.parseInt(firstMultipleInput[0]);
//
//                int m = Integer.parseInt(firstMultipleInput[1]);
//
//                int s = Integer.parseInt(firstMultipleInput[2]);
//
//                int result = SaveThePrisonerResult.saveThePrisoner(n, m, s);
//
//                bufferedWriter.write(String.valueOf(result));
//                bufferedWriter.newLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
