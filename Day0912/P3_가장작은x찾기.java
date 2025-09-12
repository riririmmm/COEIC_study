package Day0912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3_가장작은x찾기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        int a = arr[0][0], b = arr[0][1];

        int minX = Integer.MAX_VALUE;
        for (int i = 0; ; i++) {      // x = i 가정, 찾을 때까지 무한반복
            int num = i;
            boolean ableX = true;
            for (int j = 0; j < N; j++) {
                num *= 2;
                if (num < arr[j][0] || num > arr[j][1]) {   // 범위를 벗어난다면
                    ableX = false;
                    break;
                }
            }

            if (ableX) {
                minX = i;
                break;
            }
        }

        System.out.println(minX);
        br.close();
    }
}
