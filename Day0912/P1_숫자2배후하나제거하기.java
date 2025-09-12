package Day0912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1_숫자2배후하나제거하기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {   // i번째 수를 2배
            arr[i] = arr[i] * 2;

            for (int j = 0; j < N; j++) {
                int[] newArr = new int[N-1];
                int cnt = 0;
                for (int k = 0; k < N; k++) {
                    if (j != k)
                        newArr[cnt++] = arr[k];
                }

                int sumDiff = 0;
                for (int k = 0; k < N-2; k++) {
                    sumDiff += Math.abs(newArr[k] - newArr[k+1]);
                }

                minDiff = Math.min(sumDiff, minDiff);
            }

            arr[i] = arr[i] / 2;
        }

        System.out.println(minDiff);
        br.close();
    }
}
