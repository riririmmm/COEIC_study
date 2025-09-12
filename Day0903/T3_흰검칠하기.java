package Day0903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T3_흰검칠하기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] color = new int[200000];
        int[] arrW = new int[200000];
        int[] arrB = new int[200000];
        int current = 100000;

        int white = 0;
        int black = 0;
        int gray = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            String way = st.nextToken();

            if (way.equals("L")) {
                int start = current - x;
                int end = current;

                for (int j = end; j > start; j--) {
                    arrW[j]++;
                    color[j] = 1;
//                    System.out.println("arrW = " + arrW[j] + " & " + j);
                    current = j;
                }
            } else if (way.equals("R")) {
                int start = current;
                int end = current + x;

                for (int j = start; j < end; j++) {
                    arrB[j]++;
                    color[j] = 2;
//                    System.out.println("arrB = " + arrW[j] + " & " + j);
                    current = j;
                }
            }
        }

        for (int i = 0; i < arrB.length; i++) {
            if (arrW[i] >= 2 && arrB[i] >= 2) {
//                System.out.println("gray = " + i);
                gray++;
            } else if (color[i] == 1) {
//                System.out.println("white = " + i);
                white++;
            } else if (color[i] == 2) {
//                System.out.println("black = " + i);
                black++;
            }
        }

        System.out.println(white + " " + black + " " + gray);
        br.close();
    }
}
