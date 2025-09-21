package Day0917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3_1차원젠가 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for (int i = 0; i < 2; i++) {       // 2번 반복
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            cnt = 0;
            int[] temp = new int[N];
            for (int j = 0; j < N; j++) {
                if ((j >= s-1 && j <= e-1) || arr[j] == 0)       // 블럭 빼기
                    continue;

                temp[cnt++] = arr[j];
            }

            System.arraycopy(temp, 0, arr, 0, N);
        }

        System.out.println(cnt);
        for (int i : arr) {
            if (i != 0)
                System.out.println(i);
        }
        br.close();
    }
}
