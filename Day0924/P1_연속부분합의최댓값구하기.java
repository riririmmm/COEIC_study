package Day0924;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1_연속부분합의최댓값구하기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 입력 받기
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N];
        dp[0] = arr[0];
        int max = dp[0];
        for (int i = 1; i < N; i++) {
            dp[i] = Math.max(arr[i], arr[i]+dp[i-1]);
            max = Math.max(dp[i], max);
        }

        System.out.println(max);
        br.close();
    }

}
