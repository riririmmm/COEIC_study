package Task_0905;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T10_원모양으로되어있는방 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] room = new int[N];

        for (int i = 0; i < N; i++) {
            room[i] = Integer.parseInt(br.readLine());
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int dist = 0;
            for (int j = 0; j < N; j++) {
                int temp = (i + j) % N;
                dist += room[temp] * j;
            }
            if (dist < min)
                min = dist;
        }

        System.out.println(min);
        br.close();
    }
}
