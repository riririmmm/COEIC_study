package Task_0903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T7_연속되는수4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int cnt = 1, max = -1;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if (i != 0 && arr[i] > arr[i-1])
                cnt++;
            if (i != 0 && arr[i] <= arr[i-1])
                cnt = 1;

            if (cnt > max)
                max = cnt;
        }

        System.out.println(max);
    }
}
