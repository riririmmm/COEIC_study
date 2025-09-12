package Day0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5_데이터센터의온도조정2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][2];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            min = Math.min(arr[i][0], min);
            max = Math.max(arr[i][1], max);
        }

        int maxWork = Integer.MIN_VALUE;
        for (int i = min-5; i < max+5; i++) {   // 온도
            int work = 0;
            for (int j = 0; j < N; j++) {
                if (i < arr[j][0])
                    work += C;
                else if (i >= arr[j][0] && i <= arr[j][1])
                    work += G;
                else if (i > arr[j][1])
                    work += H;
            }

            maxWork = Math.max(work, maxWork);
        }

        System.out.println(maxWork);
        br.close();
    }
}
