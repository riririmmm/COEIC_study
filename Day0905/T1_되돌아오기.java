package Day0905;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T1_되돌아오기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[2001][2001];

        int[] dx = { 1, 0, -1, 0 };
        int[] dy = { 0, -1, 0, 1 }; // 동, 남, 서, 북

        int answer = -1;
        int sec = 0;
        int wayNum = -1;
        int x = 1000, y = 1000;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String way = st.nextToken();
            int d = Integer.parseInt(st.nextToken());
            if (way.equals("E"))
                wayNum = 0;
            if (way.equals("S"))
                wayNum = 1;
            if (way.equals("W"))
                wayNum = 2;
            if (way.equals("N"))
                wayNum = 3;

            for (int j = 0; j < d; j++) {
                sec++;
                int nx = x + dx[wayNum];
                int ny = y + dy[wayNum];

                if (nx == 1000 && ny == 1000) {
                    answer = sec;
                    System.out.println(answer);
                    br.close();
                    return;
                }

                x = nx;
                y = ny;
                arr[x][y] = sec;
            }
        }

        br.close();
        System.out.println(answer);
    }
}
