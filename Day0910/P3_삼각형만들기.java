package Day0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3_삼각형만들기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

//        int[][] arr = new int[20005][20005];
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int maxArea = 0;
        for (int i = 0; i < N-2; i++) {
            for (int j = i+1; j < N-1; j++) {
                for (int k = j+1; k < N; k++) {
                    int area = triangleArea(arr[i], arr[j], arr[k]);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        System.out.println(maxArea);
        br.close();
    }

    public static int triangleArea(int[] a, int[] b, int[] c) {
        int area = 0;
        if (a[0] == b[0]) {     // a(i)와 b(j)의 x좌표가 같은 경우
            if (a[1] == c[1] || b[1] == c[1]) { // 사각형이 형성될 때 너비를 c로 함
                int x = Math.abs(a[1] - b[1]);
                int y = Math.abs(a[0] - c[0]);
                area = x*y;
            }
        }
        if (a[0] == c[0]) {     // a(i)와 c(k)의 x좌표가 같은 경우
            if (a[1] == b[1] || b[1] == c[1]) { // 사각형이 형성될 때 너비를 b로 함
                int x = Math.abs(a[1] - c[1]);
                int y = Math.abs(b[0] - c[0]);
                area = x*y;
            }
        }
        if (b[0] == c[0]) {     // b(j)와 c(k)의 x좌표가 같은 경우
            if (b[1] == a[1] || c[1] == a[1]) {
                int x = Math.abs(b[1] - c[1]);
                int y = Math.abs(b[0] - a[0]);
                area = x*y;
            }
        }

        return area;
    }
}
