package Task_0910;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class T1_운행되고있는시간 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 일하는 시간 입력 받기
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int maxSum = 0;
        for (int i = 0; i < N; i++) {       // i를 해고
            boolean[] workTime = new boolean[1001];
            for (int j = 0; j < N; j++) {
                if (j == i)     // i의 일하는 시간 제외
                    continue;

                for (int k = arr[j][0]; k < arr[j][1]; k++) {
                    workTime[k] = true;
                }
            }

            int sum = time(workTime);
            maxSum = Math.max(sum, maxSum);

        }

        System.out.println(maxSum);
        br.close();
    }

    public static int time(boolean[] workArr) {
        int sum = 0;
        for (boolean i : workArr)
            if (i)
                sum++;

        return sum;
    }
}
