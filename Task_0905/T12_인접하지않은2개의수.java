package Task_0905;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T12_인접하지않은2개의수 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int max = -1;
        for (int i = 0; i < N-2; i++) {
            for (int j = i+2; j < N; j++) {
                int sum = nums[i] + nums[j];
                if (sum > max)
                    max = sum;
            }
        }

        System.out.println(max);
        br.close();
    }
}
