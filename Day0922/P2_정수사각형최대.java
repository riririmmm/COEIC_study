package Day0922;

import java.io.*;
import java.util.*;

public class P2_정수사각형최대 {

    private static int[][] initialize(int n, int[][] arr) {
        int[][] temp = new int[n][n];
        temp[0][0] = arr[0][0];

        for (int i = 1; i < n; i++) {
            temp[i][0] = temp[i-1][0] + arr[i][0];      // 밑으로 초기화
            temp[0][i] = temp[0][i-1] + arr[0][i];      // 오른쪽으로 초기화
        }

        return temp;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

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
                dp[i][j] = Math.max(dp[i-1][j] + arr[i][j], dp[i][j-1] + arr[i][j]);
            }
        }

        System.out.println(dp[N-1][N-1]);
        br.close();
    }

}
