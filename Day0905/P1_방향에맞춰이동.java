package Day0905;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1_방향에맞춰이동 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dx = new int[] { 1, 0, -1, 0 };   // 동, 남, 서, 북
        int[] dy = new int[] { 0, -1, 0, 1 };
        int x = 0, y = 0;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String way = st.nextToken();
            int d = Integer.parseInt(st.nextToken());
            int wayNum = -1;

            if (way.equals("E"))
                wayNum = 0;
            if (way.equals("S"))
                wayNum = 1;
            if (way.equals("W"))
                wayNum = 2;
            if (way.equals("N"))
                wayNum = 3;

            x += dx[wayNum] * d;
            y += dy[wayNum] * d;
        }

        System.out.println(x + " " + y);
        br.close();
    }
}
