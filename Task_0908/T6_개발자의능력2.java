package Task_0908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T6_개발자의능력2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력받기
        int[] arr = new int[6];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 6-1; i++) {         // 첫번째 그룹
            for (int j = i+1; j < 6; j++) {

                for (int a = 0; a < 6-1; a++) {         // 두번째 그룹
                    for (int b = a+1; b < 6; b++) {

                        if (i == a || j == b || i == b || j == a)       // 두 그룹이 같은 개발자를 선택하는 경우
                            continue;

                        int groupA = arr[i] + arr[j];
                        int groupB = arr[a] + arr[b];
                        int groupC = sum - groupA - groupB;

                        int maxGroup = Math.max(Math.max(groupA, groupB), Math.max(groupB, groupC));
                        int minGroup = Math.min(Math.min(groupA, groupB), Math.min(groupB, groupC));

                        int diff = maxGroup - minGroup;
                        min = Math.min(min, diff);
                    }
                }
            }
        }

        System.out.println(min);
        br.close();
    }
}
