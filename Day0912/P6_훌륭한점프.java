package Day0912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P6_훌륭한점프 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int minNum = Integer.MAX_VALUE;
        for (int i = 100; i >= arr[N-1]; i--) {    // i 이하의 돌들만 밟음
            int cur = 0;               // 현재 위치, 1번 돌에서 시작
            boolean able = true;
            int max = arr[0];
            for (int j = 1; j < N; j++) {
                if (arr[j] <= i && Math.abs(j-cur) <= K) {      // 돌의 숫자가 i보다 작고 거리가 k 이하
                    max = Math.max(max, arr[j]);
                    System.out.println("i = " + i + ", j = " + j + ", cur = " + cur + ", arr = " + arr[j] + ", max = " + max);
                    cur = j;
                }

                if (Math.abs(j-cur) > K)
                    able = false;
            }

            if (able) {
                minNum = Math.min(max, minNum);
                System.out.println("max i = " + i + ", minNum = " + minNum);
            }
        }

        System.out.println(minNum);
        br.close();
    }
}
