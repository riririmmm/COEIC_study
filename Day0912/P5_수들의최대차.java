package Day0912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5_수들의최대차 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int maxNum = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > maxNum)
                maxNum = arr[i];
        }

        int maxCnt = 0;
        for (int i = 1; i <= maxNum+K; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j] >= i && arr[j] <= i+K)
                    cnt++;
            }

            maxCnt = Math.max(cnt, maxCnt);
        }

        System.out.println(maxCnt);
        br.close();
    }
}
