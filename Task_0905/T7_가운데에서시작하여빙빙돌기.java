package Task_0905;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T7_가운데에서시작하여빙빙돌기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dx = { 0, -1, 0, 1 };     // 서, 북, 동, 남
        int[] dy = { -1, 0, 1, 0 };
        int dirNum = 0;

        int[][] arr = new int[n][n];
        int x = n - 1;
        int y = n - 1;
        arr[x][y] = n*n;
        int num = n*n - 1;

        for (int i = 1; i < n*n; i++) {
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n || arr[nx][ny] != 0) {
                dirNum = (dirNum + 1) % 4;
            }

            x = x + dx[dirNum];
            y = y + dy[dirNum];
            arr[x][y] = num;
            num--;
        }

        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        br.close();
    }
}
