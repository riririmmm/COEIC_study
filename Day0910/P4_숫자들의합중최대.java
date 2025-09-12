package Day0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4_숫자들의합중최대 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int maxSum = 0;
        for (int i = x; i <= y; i++) {
            char[] strNum = String.valueOf(i).toCharArray();
            int sum = 0;
            for (char c : strNum) {
                sum += Integer.parseInt(String.valueOf(c));
            }

            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);
        br.close();
    }
}
