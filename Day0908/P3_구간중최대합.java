package Day0908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3_구간중최대합 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = -1;
        for (int i = 0; i < N-K+1; i++) {
            int cnt = 0;
            for (int j = i; j < i+K; j++) {
                cnt += arr[j];
            }
            if (cnt > max)
                max = cnt;
        }

        System.out.println(max);
        br.close();
    }
}
