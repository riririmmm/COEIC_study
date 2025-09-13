package Day0912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T2_3개의선2 {

    static int n;
    static int[][] arr;

    static boolean canCover(int mask, int k) {
        if (mask == 0) return true;   // 전부 커버됨
        if (k == 0) return false;     // 선을 더 못 씀

        // 아직 남아 있는 임의의 인덱스 i 선택
        int i = -1;
        for (int t = 0; t < n; t++) {
            if ((mask & (1 << t)) != 0) {
                i = t;
                break;
            }
        }

        int x0 = arr[i][0], y0 = arr[i][1];

        // 1) x = x0 세로선으로 커버 → 같은 x를 가진 점 비트 제거
        int maskX = mask;
        for (int j = 0; j < n; j++) {
            if ((maskX & (1 << j)) != 0 && arr[j][0] == x0) {
                maskX &= ~(1 << j);
            }
        }
        if (canCover(maskX, k - 1)) return true;

        // 2) y = y0 가로선으로 커버 → 같은 y를 가진 점 비트 제거
        int maskY = mask;
        for (int j = 0; j < n; j++) {
            if ((maskY & (1 << j)) != 0 && arr[j][1] == y0) {
                maskY &= ~(1 << j);
            }
        }
        return canCover(maskY, k - 1);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int fullMask = (n == 32) ? -1 : ((1 << n) - 1); // n≤20이므로 (1<<n)-1이면 충분
        System.out.println(canCover(fullMask, 3) ? 1 : 0);
    }
}
