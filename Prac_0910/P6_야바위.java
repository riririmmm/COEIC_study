package Prac_0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P6_야바위 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][3];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()) - 1;
            arr[i][1] = Integer.parseInt(st.nextToken()) - 1;
            arr[i][2] = Integer.parseInt(st.nextToken()) - 1;
        }

        int maxCnt = 0;
        for (int i = 0; i < 3; i++) {       // a, b, c번 종이컵에 들어 있는 경우들을
            int cnt = simulate(arr, i);     // 각각 시뮬레이션
            maxCnt = Math.max(cnt, maxCnt);
        }

        System.out.println(maxCnt);
        br.close();
    }

    public static int simulate(int[][] arr, int n) {
        int cnt = 0;    // 점수
        boolean[] cups = new boolean[3];
        cups[n] = true;     // 조약돌이 든 위치를 true로 표시

        for (int i = 0; i < arr.length; i++) {
            // 컵 바꾸기
            boolean temp = cups[arr[i][1]];
            cups[arr[i][1]] = cups[arr[i][0]];
            cups[arr[i][0]] = temp;

            if (cups[arr[i][2]])
                cnt++;
        }

        return cnt;
    }
}
