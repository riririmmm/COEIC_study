package Prac_0903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2_최대로겹치는구간 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[201];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) + 100;
            int end = Integer.parseInt(st.nextToken()) + 100 - 1;

            for (int j = start; j <= end; j++) {
                arr[j]++;
            }
        }

        int max = -1;
        for (int j : arr) {
            if (j > max)
                max = j;
        }

        System.out.println(max);
    }
}
