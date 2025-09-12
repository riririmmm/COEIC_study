package Day0908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T5_숫자카운트 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] num = new int[N];
        int[] cnt1 = new int[N];
        int[] cnt2 = new int[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            num[i] = Integer.parseInt(st.nextToken());
            cnt1[i] = Integer.parseInt(st.nextToken());
            cnt2[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {

                    if (i == j || j == k || i == k)     // 같은 숫자로 이루어지는 경우 제외
                        continue;

                    boolean ableNum = true;
                    for (int n = 0; n < N; n++) {
                        int answer1 = 0;
                        int answer2 = 0;

                        int num1 = num[n] / 100;    // 첫번째 자리
                        int num2 = (num[n] / 10) % 10;     // 두번째 자리
                        int num3 = num[n] % 10;     // 세번째 자리

                        // 자리 & 숫자 다 맞춘 경우
                        if (num1 == i)
                            answer1++;
                        if (num2 == j)
                            answer1++;
                        if (num3 == k)
                            answer1++;

                        // 숫자만 맞춘 경우
                        if (i == num2 || i == num3)
                            answer2++;
                        if (j == num1 || j == num3)
                            answer2++;
                        if (k == num1 || k == num2)
                            answer2++;

                        if (answer1 != cnt1[n] || answer2 != cnt2[n])
                            ableNum = false;
                    }

                    if (ableNum)
                        answer++;
                }
            }

        }

        System.out.println(answer);
        br.close();
    }
}
