package Day0912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T4_독서실의거리두기4 {

    private static int getDistance(int[] arr) {
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 0)    // 빈자리라면 스킵
                continue;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] == 0)    // 빈자리라면 스킵
                    continue;

                distance = Math.min(distance, j-i);
            }
        }

        return distance;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        char[] arr = br.readLine().toCharArray();
        int[] seat = new int[N];
        for (int i = 0; i < N; i++) {
            seat[i] = Integer.parseInt(String.valueOf(arr[i]));
        }


        int maxDistance = Integer.MIN_VALUE;
        for (int i = 0; i < N-1; i++) {       // i번째 자리에 첫번째 새 자리를 배정
            if (seat[i] != 0)               // i번째 자리가 공석이 아니라면 스킵
                continue;
            seat[i] = 1;

            for (int j = i+1; j < N; j++) {     // j번째 자리에 두번째 새 자리를 배정
                if (seat[j] != 0)           // j번째 자리가 공석이 아니라면 스킵
                    continue;
                seat[j] = 1;

                maxDistance = Math.max(getDistance(seat), maxDistance);

                seat[j] = 0;    // 자리배정 원상복구
            }
            seat[i] = 0;        // 자리배정 원상복구
        }

        System.out.println(maxDistance);
        br.close();
    }
}
