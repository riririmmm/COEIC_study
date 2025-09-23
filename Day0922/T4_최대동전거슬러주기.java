package Day0922;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class T4_최대동전거슬러주기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] coins = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[M+1];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= M; i++) {   // 금액
            for (int j = 0; j < N; j++) {  // coins 순회
                if (i >= coins[j]) {        // 사용하려는 코인보다 금액이 크다면
                    if (dp[i-coins[j]] == Integer.MIN_VALUE)    // 이 코인을 사용하여 만들 수 없는 금액임
                        continue;

                    dp[i] = Math.max(dp[i], dp[i-coins[j]] + 1);
                }
            }
        }

        if (dp[M] == Integer.MIN_VALUE)
            System.out.println(-1);
        else
            System.out.println(dp[M]);

        br.close();
    }
}
