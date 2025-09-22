package Day0922;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P3_최대증가부분수열 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] temp = new int[N];             // i번째 수까지 증가하는 수가 몇 개 있는지
        Arrays.fill(temp, 1);

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    temp[i] = Math.max(temp[j] + 1, temp[i]);
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i : temp) {
            max = Math.max(i, max);
        }

        System.out.println(max);
        br.close();
    }
}
