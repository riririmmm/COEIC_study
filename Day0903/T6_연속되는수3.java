package Day0903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T6_연속되는수3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[N];
        int cnt = 1, max = -1;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > 0)
                arr[i] = true;
            else if (num < 0)
                arr[i] = false;

            if (i != 0 && arr[i-1] == arr[i])
                cnt++;
            if (i != 0 && arr[i-1] != arr[i])
                cnt = 1;

            if (cnt > max)
                max = cnt;
        }

        System.out.println(max);
    }
}
