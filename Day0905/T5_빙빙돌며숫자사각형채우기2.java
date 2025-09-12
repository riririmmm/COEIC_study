package Day0905;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T5_빙빙돌며숫자사각형채우기2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];

        int[] dx = { 1, 0, -1, 0 };     // 남, 동, 북, 서
        int[] dy = { 0, 1, 0, -1 };
        int dirNum = 0;

        int x = 0, y = 0;
        arr[x][y] = 1;
        int num = 2;
        for (int i = 1; i < N*M; i++) {
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];

            if (nx < 0 || nx >= N || ny < 0 || ny >= M || arr[nx][ny] != 0) {
                dirNum = (dirNum + 1) % 4;
            }

            x = x + dx[dirNum];
            y = y + dy[dirNum];
            arr[x][y] = num;
            num++;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        br.close();
    }
}
