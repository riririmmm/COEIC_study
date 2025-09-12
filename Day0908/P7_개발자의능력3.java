package Day0908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P7_개발자의능력3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[6];
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j < 5; j++) {
                for (int k = j+1; k < 6; k++) {

                    int cnt = arr[i] + arr[j] + arr[k];
                    int diff = sum - cnt;

                    if (Math.abs(cnt - diff) < min) {
                        min = Math.abs(cnt - diff);
                    }
                }
            }
        }

        System.out.println(min);
        br.close();
    }
}
