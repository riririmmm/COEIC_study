package Day0912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T3_좌표평면위의균형2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 입력 받기
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int minCnt = Integer.MAX_VALUE;
        for (int i = 2; i <= 100; i+=2) {
            for (int j = 2; j <= 100; j+=2) {
                int[] areaCnt = new int[4];     // 구역별 좌표 개수

                for (int k = 0; k < n; k++) {
                    if (arr[k][0] < i && arr[k][1] < j)     // 좌측하단 구역
                        areaCnt[0]++;
                    if (arr[k][0] < i && arr[k][1] > j)     // 좌측상단 구역
                        areaCnt[1]++;
                    if (arr[k][0] > i && arr[k][1] < j)     // 우측하단 구역
                        areaCnt[2]++;
                    if (arr[k][0] > i && arr[k][1] > j)     // 우측상단 구역
                        areaCnt[3]++;
                }

                int max = -1;
                for (int k = 0; k < 4; k++) {
                    if (areaCnt[k] > max) {
                        max = areaCnt[k];
//                        System.out.println("i = " + i + ", j = " + j + ", max = " + max);
                    }
                }

                minCnt = Math.min(max, minCnt);
            }
        }

        System.out.println(minCnt);
        br.close();
    }
}
