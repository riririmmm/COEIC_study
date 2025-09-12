package Day0908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4_GorH3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        char[] arr = new char[10000];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int location = Integer.parseInt(st.nextToken());
            arr[location] = st.nextToken().charAt(0);
        }

        int max = -1;
        for (int i = 0; i < arr.length-K; i++) {
            int score = 0;
            for (int j = i; j <= i+K; j++) {
                if (arr[j] == 'G')
                    score += 1;
                else if (arr[j] == 'H') {
                    score += 2;
                }
            }

            if (score > max)
                max = score;
        }

        System.out.println(max);
        br.close();
    }
}
