package Day0917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1_최고의33위치 {

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

        int maxCnt = Integer.MIN_VALUE;
        for (int i = 0; i < N-2; i++) {
            for (int j = 0; j < N-2; j++) {
                int cnt = 0;

                // 1인 칸 세기
                for (int a = 0; a < 3; a++) {
                    for (int b = 0; b < 3; b++) {
                        if (arr[i+a][j+b] == 1)
                            cnt++;
                    }
                }

                maxCnt = Math.max(cnt, maxCnt);
            }
        }

        System.out.println(maxCnt);
        br.close();
    }
}
