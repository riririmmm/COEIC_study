package Task_0908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T2_아름다운수열2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arrA = new int[N];
        for (int i = 0; i < N; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] arrB = new int[M];
        for (int i = 0; i < M; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        for (int i = 0; i < N-M+1; i++) {
            int cnt = 0;
            boolean[] checked = new boolean[M];
            for (int k = i; k < i+M; k++) {
                for (int j = 0; j < M; j++) {
                    if (arrA[k] == arrB[j] && !checked[j]) {
                        checked[j] = true;
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt == M)
                answer++;
        }

        System.out.println(answer);
        br.close();
    }
}
