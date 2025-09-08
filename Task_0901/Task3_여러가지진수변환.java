package Task_0901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Task3_여러가지진수변환 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        StringBuilder answer = new StringBuilder();

        while (true) {
            if (N < B) {
                answer.insert(0, N);
                break;
            }

            answer.insert(0, N % B);
            N = N / B;
        }

        System.out.println(answer);

        br.close();
    }
}
