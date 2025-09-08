package Prac_0903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P6_만나는그순간 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arrA = new int[1000000];
        int[] arrB = new int[1000000];

        int answer = -1;

        int sec = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String d = st.nextToken();
            int t = Integer.parseInt(st.nextToken());

            for (int j = 0; j < t; j++) {
                sec++;
                if (d.equals("L")) {
                    arrA[sec] = arrA[sec-1] - 1;
                } else if (d.equals("R")) {
                    arrA[sec] = arrA[sec-1] + 1;
                }
            }
        }

        sec = 0;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String d = st.nextToken();
            int t = Integer.parseInt(st.nextToken());

            for (int j = 0; j < t; j++) {
                sec++;
                if (d.equals("L")) {
                    arrB[sec]= arrB[sec-1] - 1;
                } else if (d.equals("R")) {
                    arrB[sec] = arrB[sec-1] + 1;
                }

                if (arrA[sec] == arrB[sec]) {
                    answer = sec;
                    System.out.println(answer);
                    br.close();
                    return;
                }

            }
        }

        System.out.println(answer);

        br.close();

    }
}
