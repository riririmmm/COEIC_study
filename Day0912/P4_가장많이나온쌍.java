package Day0912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4_가장많이나온쌍 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 입력 받기
        int[][] arr = new int[m][2];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            // 입력받은 두 수 중 작은 쪽을 (a, b) 중 a로 받음
            if (num1 < num2) {
                arr[i][0] = num1;
                arr[i][1] = num2;
            } else {
                arr[i][0] = num2;
                arr[i][1] = num1;
            }
        }

        int maxCnt = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // (i, j) 쌍이 몇 개나 있는지
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    if (arr[k][0] == i && arr[k][1] == j)
                        cnt++;
                }

                maxCnt = Math.max(cnt, maxCnt);
            }
        }

        System.out.println(maxCnt);
        br.close();
    }
}
