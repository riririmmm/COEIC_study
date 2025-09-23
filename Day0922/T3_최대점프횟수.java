package Day0922;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class T3_최대점프횟수 {

    public static void main(String[] args) throws IOException {

        // dp에 지금까지의 최대 점프 횟수 저장
        // 예제로 따지면 0 1 2 2 3

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 입력 받기
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = 0;

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] == Integer.MIN_VALUE)
                    continue;

                if (j + arr[j] >= i) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }

        int ans = 0;
        for (int i : dp) {
            ans = Math.max(ans, i);
        }
        System.out.println(ans);
        br.close();
    }
}
