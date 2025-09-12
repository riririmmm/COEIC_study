package Day0905;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T3_격자위의편안한상태 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N+1][N+1];
        int[] dx = { 1, 0, -1, 0 };
        int[] dy = { 0, -1, 0, 1 }; // 동, 남, 서, 북

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = 1;  // 칸 색칠

            int cnt = 0;
            for (int dirNum = 0; dirNum < 4; dirNum++) {
                int nx = x + dx[dirNum];
                int ny = y + dy[dirNum];
                if (nx >= 0 && nx <= N && ny >= 0 && ny <= N && arr[nx][ny] != 0) {
                    cnt++;
                }
            }

            if (cnt == 3)
                System.out.println(1);
            else
                System.out.println(0);

        }

        br.close();
    }
}
