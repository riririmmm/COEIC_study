package Day0905;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T2_되돌아오기2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] command = br.readLine().toCharArray();

        int x = 0, y = 0;
        int sec = 0;
        int[] dx = { 1, 0, -1, 0 };
        int[] dy = { 0, -1, 0, 1 }; // 동, 남, 서, 북
        int dirNum = 3;

        for (char d : command) {
            sec++;
            if (d == 'L') {
                dirNum--;
                if (dirNum < 0)
                    dirNum = 3;
            }
            if (d == 'R') {
                dirNum = (dirNum + 1) % 4;
            }
            if (d == 'F') {
                int nx = x + dx[dirNum];
                int ny = y + dy[dirNum];
                if (nx == 0 && ny == 0) {     // 처음으로 되돌아왔다면
                    System.out.println(sec);
                    br.close();
                    return;
                }
                x = nx;
                y = ny;
            }
        }

        System.out.println(-1);
        br.close();
    }
}
