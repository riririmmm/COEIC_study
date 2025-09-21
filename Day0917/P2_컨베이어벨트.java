package Day0917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2_컨베이어벨트 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int[][] arr = new int[2][N];
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < T; i++) {     // T초 동안

            int temp = arr[0][N-1];
            for (int j = N-1; j > 0; j--) {   // 위쪽 컨베이어벨트
                arr[0][j] = arr[0][j-1];
            }
            arr[0][0] = arr[1][N-1];
            for (int j = N-1; j > 0; j--) {
                arr[1][j] = arr[1][j-1];
            }
            arr[1][0] = temp;
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        br.close();
    }
}
