package Prac_0905;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2_문자에따른명령2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] command = br.readLine().toCharArray();

        int[] dx = new int[] { 1, 0, -1, 0 };   // 동, 남, 서, 북
        int[] dy = new int[] { 0, -1, 0, 1 };
        int dirNum = 3;
        int x = 0;
        int y = 0;

        for (char c : command) {
            if (c == 'L') {
                dirNum--;
                if (dirNum < 0)
                    dirNum = 3;
            }
            if (c == 'R')
                dirNum++;
            if (c == 'F') {
                dirNum = dirNum % 4;

                x += dx[dirNum];
                y += dy[dirNum];
            }
        }

        System.out.println(x + " " + y);
        br.close();
    }
}
