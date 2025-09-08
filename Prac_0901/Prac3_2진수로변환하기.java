package Prac_0901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac3_2진수로변환하기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] digit = new int[20];
        int cnt = 0;

        while (true) {
            if (N < 2) {
                digit[cnt++] = N;
                break;
            }

            digit[cnt++] = N % 2;
            N = N / 2;
        }

        for (int i = cnt-1; i >= 0; i--) {
            System.out.print(digit[i]);
        }
    }
}
