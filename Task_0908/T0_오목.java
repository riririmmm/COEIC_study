package Task_0908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T0_오목 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 판 입력
        int[][] arr = new int[19][19];
        for (int i = 0; i < 19; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 19; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 19-4; i++) {
            for (int j = 0; j < 19-4; j++) {

                if (arr[i][j] != 0) {
                    // 오른쪽 가로로 오목이 형성되는 경우
                    if (arr[i][j] == arr[i][j+1] && arr[i][j+1] == arr[i][j+2]
                            && arr[i][j+2] == arr[i][j+3] && arr[i][j+3] == arr[i][j+4]) {
                        System.out.println(arr[i][j]);
                        System.out.println((i+1) + " " + (j+2+1));
                        br.close();
                        return;
                    }

                    // 아래쪽 세로로 오목이 형성되는 경우
                    if (arr[i][j] == arr[i+1][j] && arr[i+1][j] == arr[i+2][j]
                            && arr[i+2][j] == arr[i+3][j] && arr[i+3][j] == arr[i+4][j]) {
                        System.out.println(arr[i][j]);
                        System.out.println((i+2+1) + " " + (j+1));
                        br.close();
                        return;
                    }

                    // 오른쪽 아래 대각선으로 오목이 형성되는 경우
                    if (arr[i][j] == arr[i+1][j+1] && arr[i+1][j+1] == arr[i+2][j+2]
                            && arr[i+2][j+2] == arr[i+3][j+3] && arr[i+3][j+3] == arr[i+4][j+4]) {
                        System.out.println(arr[i][j]);
                        System.out.println((i+2+1) + " " + (j+2+1));
                        br.close();
                        return;
                    }

                    // 왼쪽 아래 대각선으로 오목이 형성되는 경우
                    if (arr[i][j] == arr[i+1][j-1] && arr[i+1][j-1] == arr[i+2][j-2]
                            && arr[i+2][j-2] == arr[i+3][j-3] && arr[i+3][j-3] == arr[i+4][j=4]) {
                        System.out.println(arr[i][j]);
                        System.out.println((i+2+1) + " " + (j-2+1));
                        br.close();
                        return;
                    }

                }

            }
        }

        // 왼쪽 아래 대각선 중 위쪽 시작점이 16 ~ 19 인 경우
        for (int j = 15; j < 19; j++) {
            if (arr[14][j] == arr[15][j-1] && arr[15][j-1] == arr[16][j-2]
                    && arr[16][j-2] == arr[17][j-3] && arr[17][j-3] == arr[18][j-4]) {
                System.out.println(arr[14][j]);
                System.out.println("16 " + (j-2+1));
                br.close();
                return;
            }
        }

        System.out.println(0);
        br.close();
    }
}
