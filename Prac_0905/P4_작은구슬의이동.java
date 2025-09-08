package Prac_0905;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4_작은구슬의이동 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken()) - 1;
        int y = Integer.parseInt(st.nextToken()) - 1;
        String D = st.nextToken();

        int[] dx = new int[] { 1, 0, 0, -1 };
        int[] dy = new int[] { 0, 1, -1, 0 };   // 아래(D), 오른쪽(R), 왼쪽(L), 위(U)

        int dirNum = -1;
        if (D.equals("D"))
            dirNum = 0;
        if (D.equals("R"))
            dirNum = 1;
        if (D.equals("L"))
            dirNum = 2;
        if (D.equals("U"))
            dirNum = 3;

        for (int i = 0; i < T; i++) {
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];

            if (nx < 0 || nx >= N || ny < 0 || ny >= N) {   // 끝에 닿으면 방향 바꾸기
                dirNum = 3 - dirNum;
                continue;
            }

            x = nx;
            y = ny;
        }

        x++;
        y++;

        System.out.println(x + " " + y);
        br.close();
    }
}
