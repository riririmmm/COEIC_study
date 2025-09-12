package Day0903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T9_좌우로움직이는로봇 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arrA = new int[2000001];
        int[] arrB = new int[2000001];

        int secA = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            String d = st.nextToken();

            for (int j = 0; j < t; j++) {
                secA++;
                if (d.equals("L")) {
                    arrA[secA] = arrA[secA - 1] - 1;
                } else if (d.equals("R")) {
                    arrA[secA] = arrA[secA - 1] + 1;
                }
            }
        }

        int secB = 0;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int t = Integer.parseInt(st.nextToken());
            String d = st.nextToken();

            for (int j = 0; j < t; j++) {
                secB++;
                if (d.equals("L")) {
                    arrB[secB] = arrB[secB - 1] - 1;
                } else if (d.equals("R")) {
                    arrB[secB] = arrB[secB - 1] + 1;
                }
            }
        }

        if (secA < secB) {  // A가 먼저 끝난 경우
            for (int i = secA; i <= secB; i++) {
                secA++;
                arrA[secA] = arrA[secA - 1];
            }
        } else if (secB < secA) {   // B가 먼저 끝난 경우
            for (int i = secB; i <= secA; i++) {
                secB++;
                arrB[secB] = arrB[secB - 1];
            }
        }

        int answer = 0;
        for (int i = 1; i <= secA; i++) {
            if (arrA[i-1] != arrB[i-1] && arrA[i] == arrB[i]) {
                answer++;
                System.out.println("i = " + i + ", arr[i] = " + arrA[i]);
                System.out.println("arrA = " + arrA[i-1]);
                System.out.println("arrB = " + arrB[i-1]);
            }
        }

        System.out.println(answer);
        br.close();
    }
}
