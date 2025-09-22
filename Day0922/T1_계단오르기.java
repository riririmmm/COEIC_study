package Day0922;

import java.io.*;

public class T1_계단오르기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 각 계단 수에 따라
        // 계단: 1 2 3 4 5 6 7 8 9 10
        // 방법: 0 1 1 1 2 2 3 4 5 7
        // i번째 계단까지 오는 방법 = i-2번째 계단까지 오는 방법 + i-3번째 계단까지 오는 방법

        if (N <= 3) {
            System.out.println(1);
            br.close();
            return;
        }

        int[] dp = new int[N+1];
        dp[2] = 1;
        dp[3] = 1;
        for (int i = 4; i <= N; i++) {
            dp[i] = (dp[i-2] + dp[i-3]) % 10007;
        }

        System.out.println(dp[N]);
        br.close();
    }
}
