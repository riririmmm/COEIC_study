package Prac_0903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4_겹치지않는사각형의넓이 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[2001][2001];
        int cnt = 0;

        StringTokenizer st;

        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken()) + 1000;
            int y1 = Integer.parseInt(st.nextToken()) + 1000;
            int x2 = Integer.parseInt(st.nextToken()) + 1000 - 1;
            int y2 = Integer.parseInt(st.nextToken()) + 1000 - 1;

            for (int j = x1; j <= x2; j++) {
                for (int k = y1; k <= y2; k++) {
                    cnt++;
                    arr[j][k]++;
                }
            }
        }

        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken()) + 1000;
        int y1 = Integer.parseInt(st.nextToken()) + 1000;
        int x2 = Integer.parseInt(st.nextToken()) + 1000 - 1;
        int y2 = Integer.parseInt(st.nextToken()) + 1000 - 1;

        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                if (arr[i][j] >= 1) {
                    cnt = cnt - arr[i][j];
                    arr[i][j] = 0;
                }
            }
        }

        System.out.println(cnt);

        br.close();
    }
}
