package Task_0903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T2_왔다갔던구역2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[1001];
        int current = 500;
        int answer = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            String way = st.nextToken();

            if (way.equals("L")) {
                int start = current - x;
                int end = current;

                for (int j = start; j < end; j++) {
                    arr[j]++;
                    if (arr[j] == 2)
                        answer++;
                }
                current = current - x;
            } else if (way.equals("R")) {
                int start = current;
                int end = start + x;

                for (int j = start; j < end; j++) {
                    arr[j]++;
                    if (arr[j] == 2)
                        answer++;
                }
                current = current + x;
            }
        }

        System.out.println(answer);
        br.close();
    }
}
