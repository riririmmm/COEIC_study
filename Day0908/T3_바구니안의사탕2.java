package Day0908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T3_바구니안의사탕2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[101];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int candy = Integer.parseInt(st.nextToken());
            int basket = Integer.parseInt(st.nextToken());

            arr[basket] += candy;
        }

        int max = 0;
        for (int i = 0; i < 101; i++) {
            int sum = 0;
            for (int j = i-K; j <= i+K; j++) {
                if (j < 0 || j > 100)
                    continue;
                sum += arr[j];
//                System.out.println("j = " + j + ", arr[j] = " + arr[j] + " , sum = " + sum);
            }
            max = Math.max(max, sum);
        }

        System.out.println(max);
        br.close();
    }
}
