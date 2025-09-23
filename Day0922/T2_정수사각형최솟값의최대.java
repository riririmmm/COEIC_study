package Day0922;

import java.io.*;
import java.util.StringTokenizer;

public class T2_정수사각형최솟값의최대 {

    private static int[][] initialize(int n, int[][] arr) {
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        dp[0][0] = arr[0][0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.min(arr[i][0], dp[i-1][0]);     // 아래쪽으로 초기화
            dp[0][i] = Math.min(arr[0][i], dp[0][i-1]);     // 오른쪽으로 초기화
        }

        return dp;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 입력 받기
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] dp = initialize(N, arr);
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                dp[i][j] = Math.min(Math.max(dp[i-1][j], dp[i][j-1]), arr[i][j]);
            }
        }

        System.out.println(dp[N-1][N-1]);
        br.close();
    }
}
