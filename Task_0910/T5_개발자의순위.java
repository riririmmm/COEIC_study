package Task_0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T5_개발자의순위 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        // 입력 받기
        int[][] arr = new int[K][N];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                arr[i][j] = Integer.parseInt(st.nextToken());
        }

        // i의 순위가 j의 순위보다 높음을 K번의 경기에 대해 검사해서 모두 통과하면 cnt++
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == j)     // 같은 사람에 대한 검사를 수행하지 않음
                    continue;

                boolean alwaysWin = true;
                for (int k = 0; k < K; k++) {   // k번의 경기에 대해 i와 j의 순위 비교
                    // i와 j의 순위 구하기
                    int iRank = 0, jRank = 0;
                    for (int h = 0; h < N; h++) {
                        if (arr[k][h] == i)
                            iRank = h;
                        if (arr[k][h] == j)
                            jRank = h;
                    }

                    if (jRank > iRank) {
                        alwaysWin = false;
                        break;
                    }
                }

                if (alwaysWin)
                    cnt++;
            }

        }

        System.out.println(cnt);
        br.close();
    }

}
