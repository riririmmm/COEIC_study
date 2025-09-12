package Day0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2_가장가까운두점사이의거리2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                int distance = (int) (Math.pow(arr[i][0]-arr[j][0], 2) + Math.pow(arr[i][1]-arr[j][1], 2));
                minDistance = Math.min(minDistance, distance);
//                System.out.println("arr[i][0] = " + arr[i][0] + ", arr[j][0] = " + arr[j][0] + ", arr[i][0]-arr[j][0] = " + (arr[i][0]-arr[j][0]));
//                System.out.println("arr[i][1] = " + arr[i][1] + ", arr[j][1] = " + arr[j][1] + ", arr[i][1]-arr[j][1] = " + (arr[i][1]-arr[j][1]));
//                System.out.println("minDistance = " + minDistance);
//                System.out.println();
            }
        }

        System.out.println(minDistance);
        br.close();
    }
}
