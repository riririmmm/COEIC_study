package Day0912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2_독서실의거리두기5 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        char[] arr = br.readLine().toCharArray();
        int[] seat = new int[N];
        for (int i = 0; i < N; i++) {
            seat[i] = Integer.parseInt(String.valueOf(arr[i]));
        }

        int maxDistance = Integer.MIN_VALUE;
        for (int i = 0; i < seat.length; i++) {     // i번째 자리에 새 자리를 배정
            if (seat[i] == 1)       // 이미 있는 자리라면 패스
                continue;
            seat[i] = 1;

            int distance = Integer.MAX_VALUE;
            for (int j = 0; j < N-1; j++) {
                if (seat[j] == 0)   // 없는 자리라면 스킵
                    continue;

                for (int k = j+1; k < N; k++) {
                    if (seat[k] == 0)   // 없는 자리라면 스킵
                        continue;

                    distance = Math.min(distance, k-j);
//                    System.out.println("i = " + i + ", k = " + k + ", j = " + j + ", d = " + distance);
                }
            }

            maxDistance = Math.max(distance, maxDistance);
            seat[i] = 0;
        }

        System.out.println(maxDistance);
        br.close();
    }
}
