package Day0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class T6_흥미로운숫자2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int[] cntNum = new int[11];

        int cnt = 0;
        for (int i = x; i <= y; i++) {
            int num = i;
            int len = 1;            // i가 몇자리 숫자인지

            while (true) {     // i의 각 자릿수가 몇 개씩 있는지 검사
                cntNum[num % 10]++;
                if (num < 10)
                    break;
                num = num / 10;
                len++;
            }

            // i가 한자리만 다른 숫자라면 cnt++
            for (int j = 0; j < cntNum.length; j++) {
                for (int k = 0; k < cntNum.length; k++) {
                    if (j == k)
                        continue;

                    if (cntNum[j] == len-1 && cntNum[k] == 1)
                        cnt++;
                }
            }

            Arrays.fill(cntNum, 0);     // cntNum 0으로 초기화
        }

        System.out.println(cnt);
        br.close();
    }
}
