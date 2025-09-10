package Prac_0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1_좌표평면위의특정구역2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 입력받기
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int minArea = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {   // i의 좌표를 뺌
            int minX = 40001;
            int maxX = -1;
            int minY = 40001;
            int maxY = -1;
            int x = 0, y = 0;

            for (int j = 0; j < N; j++) {   // 처음부터 순회하면서
                if (i == j)                 // i일때 스킵
                    continue;

                if (arr[j][0] < minX)       // 왼쪽 끝(좌변)값이 될 x좌표 찾기
                    minX = arr[j][0];
                if (arr[j][0] > maxX)       // 오른쪽 끝(우변)값이 될 x좌표 찾기
                    maxX = arr[j][0];
                if (arr[j][1] < minY)       // 아래쪽 끝(하변)값이 될 y좌표 찾기
                    minY = arr[j][1];
                if (arr[j][1] > maxY)       // 위쪽 끝(상변)값이 될 y좌표 찾기
                    maxY = arr[j][1];

                x = maxX - minX;
                y = maxY - minY;
            }

            minArea = Math.min(minArea, x*y);
//            System.out.println("maxX = " + maxX + ", minX = " + minX);
//            System.out.println("maxY = " + maxY + ", minY = " + minY);
//            System.out.println("x = " + x + ", y = " + y + ", area = " + minArea);
        }

        System.out.println(minArea);
        br.close();
    }
}
