package Day0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class T3_스승의은혜2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 학생 수
        int B = Integer.parseInt(st.nextToken());   // 예산

        // 입력받기
        int[] price = new int[N];           // 원래 가격 배열
        int[] salePrice = new int[N];       // 세일 후 정렬을 위한 배열
        for (int i = 0; i < N; i++) {
            price[i] = Integer.parseInt(br.readLine());
            salePrice[i] = price[i];
        }

        int maxCnt = 0;
        for (int i = 0; i < N; i++) {       // i 가격을 반토막
            salePrice[i] = salePrice[i] / 2;
            Arrays.sort(salePrice);

            int cnt = 0;
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += salePrice[j];
                if (sum > B)        // 예산 초과 시 중지
                    break;
                cnt++;
            }

            maxCnt = Math.max(cnt, maxCnt);

            // salePrice의 가격을 원상복구
            for (int j = 0; j < N; j++) {
                salePrice[j] = price[j];
            }
        }

        System.out.println(maxCnt);
        br.close();
    }
}
