package Day0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T2_겹치지않는선분2 {

    /*
    시작점을 비교해서 시작점(x)이 더 왼쪽에 있는 쪽을 l1, 다른 하나를 l2로 가정
    끝점을 비교해서 l2의 끝점(y)가 l1의 끝점(y)보다 왼쪽에 있으면 겹친 것으로 간주
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] lines = new int[N][2];      // 각 선분의 시작점 & 끝점 저장
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            lines[i][0] = Integer.parseInt(st.nextToken());
            lines[i][1] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            boolean isNotOverlap = true;
            for (int j = 0; j < N; j++) {
                if (i == j)     // 자기자신의 선분인 경우
                    continue;

                int[] l1, l2;
                // x가 왼쪽에 있는 걸 l1으로 정의
                if (lines[i][0] < lines[j][0]) {
                    l1 = lines[i];
                    l2 = lines[j];
                } else {
                    l1 = lines[j];
                    l2 = lines[i];
                }

                if (l1[1] > l2[1])      // 겹침
                    isNotOverlap = false;
            }

            if (isNotOverlap)
                cnt++;
        }

        System.out.println(cnt);
        br.close();
    }
}
