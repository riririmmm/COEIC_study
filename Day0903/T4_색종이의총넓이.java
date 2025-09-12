package Day0903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T4_색종이의총넓이 {

    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[201][201];
        int answer = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken()) + 100;
            int y = Integer.parseInt(st.nextToken()) + 100;

            for (int j = x; j < x+8; j++) {
                for (int k = y; k < y+8; k++) {
                    if (arr[j][k] == 0)
                        answer++;

                    arr[j][k]++;
                }
            }
        }

        System.out.println(answer);
        br.close();
    }
}
