package Day0922;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1_피보나치수 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N <= 2) {
            System.out.println(1);
            br.close();
            return;
        }

        int[] fibbo = new int[N];
        fibbo[0] = 1;
        fibbo[1] = 1;

        for (int i = 2; i < N; i++) {
            fibbo[i] = fibbo[i-1] + fibbo[i-2];
        }

        System.out.println(fibbo[N-1]);
        br.close();
    }
}
