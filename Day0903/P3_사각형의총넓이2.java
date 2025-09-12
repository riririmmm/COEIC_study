package Day0903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3_사각형의총넓이2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[201][201];

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) + 100;
            int y1 = Integer.parseInt(st.nextToken()) + 100;
            int x2 = Integer.parseInt(st.nextToken()) + 100 - 1;
            int y2 = Integer.parseInt(st.nextToken()) + 100 - 1;

            for (int j = x1; j <= x2; j++) {
                for (int k = y1; k <= y2; k++) {
                    if (arr[j][k] == 0) {
                        cnt++;
                        arr[j][k]++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}
