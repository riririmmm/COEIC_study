package Task_0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T7_정보에따른수2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 입력 받기
        String[][] arr = new String[T][2];
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        int cnt = 0;
        for (int i = a; i <= b; i++) {      // 현재 위치

            int d1 = getDistance(arr, i, "S");
            int d2 = getDistance(arr, i, "N");

            // d1과 d2 비교
            if (d1 <= d2)
                cnt++;
        }

        System.out.println(cnt);
        br.close();
    }

    public static int getDistance(String[][] arr, int i, String NorS) {
        int minDistance = Integer.MAX_VALUE;
        for (String[] s : arr) {
            int distance = Integer.MAX_VALUE;
            if (s[0].equals(NorS)) {
                distance = Math.abs(i - Integer.parseInt(s[1]));
            }
            minDistance = Math.min(distance, minDistance);
        }

        return minDistance;
    }
}
