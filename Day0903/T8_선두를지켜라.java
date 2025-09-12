package Day0903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T8_선두를지켜라 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] posA = new int[Integer.MAX_VALUE];
        int[] posB = new int[Integer.MAX_VALUE];

        int timeA = 1;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            for (int j = 0; j < t; j++) {
                posA[timeA] = posA[timeA - 1] + v;
                timeA++;
            }
        }

        int timeB = 1;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            for (int j = 0; j < t; j++) {
                posB[timeB] = posB[timeB - 1] + v;
                timeB++;
            }
        }

        int reader = 0, answer = 0;
        for (int i = 1; i < timeA; i++) {
           if (posA[i] > posB[i]) {
               if (reader == 2)
                   answer++;
               reader = 1;
           }

           if (posA[i] < posB[i]) {
               if (reader == 1)
                   answer++;

               reader = 2;
           }
        }

        System.out.println(answer);
        br.close();
    }
}
