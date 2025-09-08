package Prac_0903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5_연속되는수2 {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        int cnt = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;

            if (i ==0  || arr[i-1] == num) {
                cnt++;
            }

            if (i != 0 && arr[i-1] != num) {
                if (cnt > max) {
                    max = cnt;
                }
                cnt = 1;
            }
        }

        if (cnt > max) {
            max = cnt;
        }

        System.out.println(max);
        br.close();
    }
}
