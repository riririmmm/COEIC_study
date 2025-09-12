package Day0908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1_최고의13위치 {

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
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-2; j++) {
                int cnt = 0;
                if (arr[i][j] == 1)
                    cnt++;
                if (arr[i][j+1] == 1)
                    cnt++;
                if (arr[i][j+2] == 1)
                    cnt++;

                if (cnt > max)
                    max = cnt;
            }
        }

        System.out.println(max);
        br.close();
    }
}
