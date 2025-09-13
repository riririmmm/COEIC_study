package Day0912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T1_수를여러번사용하여특정수만들기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < (c/a)+5; i++) {
            for (int j = 0; j < (c/b)+5; j++) {
                if ((a*i) + (b*j) <= c)
                    max = Math.max((a*i) + (b*j), max);
            }
        }

        System.out.println(max);
        br.close();
    }
}
