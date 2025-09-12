package Task_0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T4_상해버린치즈 {

    /*
    치즈에 대해 돌면서 i번째 치즈가 상했음을 가정
    eatLog를 sickLog[1]까지 돌면서 sickLog[0]의 사람이 sickLog[1]초 전에 치즈i를 먹었는지 검사
    검사에 통과한다면 전체 초를 다시 돌면서 치즈i를 먹은 사람에 대해 카운트
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        // 입력 받기
        int[][] eatLog = new int[D][3];
        for (int i = 0; i < D; i++) {
            st = new StringTokenizer(br.readLine());
            eatLog[i][0] = Integer.parseInt(st.nextToken());    // 사람
            eatLog[i][1] = Integer.parseInt(st.nextToken());    // 치즈
            eatLog[i][2] = Integer.parseInt(st.nextToken());    // 초
        }
        int[][] sickLog = new int[S][2];
        for (int i = 0; i < S; i++) {
            st = new StringTokenizer(br.readLine());
            sickLog[i][0] = Integer.parseInt(st.nextToken());
            sickLog[i][1] = Integer.parseInt(st.nextToken());
        }

        int maxCnt = 0;
        for (int i = 0; i < M; i++) {   // i번째 치즈가 상했음을 가정
            int cnt = 0;
            boolean[] atePeople = new boolean[N];
            boolean isSpoiled = spoiled(sickLog, eatLog, i);    // i번째 치즈가 상했다면 true, 아니라면 false
            if (isSpoiled) {
                for (int[] eat : eatLog) {
                    if (eat[1] == i && !atePeople[eat[0]-1]) {
                        atePeople[eat[0]-1] = true;
                        cnt++;
                    }
                }
                maxCnt = Math.max(cnt, maxCnt);
            }
        }

        System.out.println(maxCnt);
        br.close();
    }

    private static boolean spoiled(int[][] sickLog, int[][] eatLog, int i) {
        boolean isSpoiled = true;
        for (int[] s : sickLog) {
            for (int j = 0; j < s[1]; j++) {    // sickLog[0]의 사람이 sickLog[1]초 전에 치즈i를 먹었는지
                boolean ate = false;
                for (int[] ints : eatLog) {   // eatLog를 돌며 검사
                    // sickLog 0의 사람이 && i번째 치즈를 && sickLog[1]초 전에 섭취
                    if (ints[0] == s[0] && ints[1] == i && ints[2] < s[1]) {
                        ate = true;
                        break;
                    }
                }
                if (!ate) {     // 섭취하지 않음
                    isSpoiled = false;
                    break;
                }
            }
        }

        return isSpoiled;
    }
}
