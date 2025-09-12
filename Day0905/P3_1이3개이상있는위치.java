package Day0905;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3_1이3개이상있는위치 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];

        int[] dx = new int[] { 1, 0, -1, 0 };   // 동, 남, 서, 북
        int[] dy = new int[] { 0, -1, 0, 1 };

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int dirNum = 0; dirNum < 4; dirNum++) {
                    int ny = j + dx[dirNum];
                    int nx = i + dy[dirNum];

                    if (nx >= 0 && ny >= 0 && nx < N && ny < N && arr[nx][ny] == 1) {
//                        System.out.println("dN=" + dirNum + ", i=" + i + ", j=" + j + ", nx=" + nx + ", ny=" + ny);
                        cnt++;
                    }
                }

                if (cnt >= 3) {
//                    System.out.println("i = " + i + ", j = " + j);
                    answer++;
                }
                cnt = 0;
            }
        }

        System.out.println(answer);
        br.close();
    }
}
