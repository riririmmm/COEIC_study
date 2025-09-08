package Task_0905;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T9_마라톤중간에택시타기2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] checkPoint = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            checkPoint[i][0] = Integer.parseInt(st.nextToken());
            checkPoint[i][1] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < N-1; i++) {
            int tempX = checkPoint[i][0];
            int tempY = checkPoint[i][1];

            // 건너뛰기 위해 이전 값과 같은 값으로 채워두기
            checkPoint[i][0] = checkPoint[i-1][0];
            checkPoint[i][1] = checkPoint[i-1][1];

            int distance = 0;
            for (int j = 0; j < N-1; j++) {
                distance += Math.abs(checkPoint[j+1][0] - checkPoint[j][0])
                        + Math.abs(checkPoint[j+1][1] - checkPoint[j][1]);
            }

            if (distance < min)
                min = distance;

            // 원상복구
            checkPoint[i][0] = tempX;
            checkPoint[i][1] = tempY;
        }

        System.out.println(min);
        br.close();
    }
}
