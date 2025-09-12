package Day0905;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T4_거울에레이저쏘기2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[][] arr = new char[N][N];

        int[] dx = { 0, 1, 0, -1 }; // 동, 남, 서, 북
        int[] dy = { 1, 0, -1, 0 };

        for (int i = 0; i < N; i++) {
            char[] str = br.readLine().toCharArray();
            System.arraycopy(str, 0, arr[i], 0, N);
        }

        int K = Integer.parseInt(br.readLine());
        int dirNum = (K / N + 1) % 4;   // 시작 위치의 방향
        int x = -1, y = -1;

        // 시작 위치(xy)
        if ((K-1) / N == 0) {
            x = 0;
            y = K - 1;
        }
        if ((K-1) / N == 1) {
            x = K - N - 1;
            y = N - 1;
        }
        if ((K-1) / N == 2) {
            x = N - 1;
            y = 3 * N - K;
        }
        if ((K-1) / N == 3) {
            x = 4 * N - K;
            y = 0;
        }

        int answer = 0;
        while (true) {
            // x 또는 y가 범위를 벗어나면 종료
            if (x < 0 || x >= N || y < 0 || y >= N)
                break;

            if (arr[x][y] == '/') {
                if (dirNum == 0)
                    dirNum = 3;
                else if (dirNum == 1)
                    dirNum = 2;
                else if (dirNum == 2)
                    dirNum = 1;
                else if (dirNum == 3)
                    dirNum = 0;

            }
            if (arr[x][y] == '\\') {
                if (dirNum == 0)
                    dirNum = 1;
                else if (dirNum == 1)
                    dirNum = 0;
                else if (dirNum == 2)
                    dirNum = 3;
                else if (dirNum == 3)
                    dirNum = 2;
            }

            x = x + dx[dirNum];
            y = y + dy[dirNum];
            answer++;
        }

        System.out.println(answer);
        br.close();
    }
}
