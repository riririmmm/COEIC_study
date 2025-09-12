package Day0908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T1_최고의13위치2 {

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

        int max = -1;
        for (int i = 0; i < N; i++) {     // 첫번째 격자
            for (int j = 0; j < N-2; j++) {

                for (int k = 0; k < N; k++) {   // 두번째 격자
                    for (int h = 0; h < N-2; h++) {

                        if (i == k && Math.abs(h - j) <= 2) {   // 격자가 겹치는 경우
                            continue;
                        }

                        int cntA = arr[i][j] + arr[i][j+1] + arr[i][j+2];   // 첫번째 격자 합
                        int cntB = arr[k][h] + arr[k][h+1] + arr[k][h+2];   // 두번째 격자 합
                        int cnt = cntA + cntB;
                        max = Math.max(max, cnt);
                    }
                }

            }
        }

        System.out.println(max);
        br.close();
    }
}
