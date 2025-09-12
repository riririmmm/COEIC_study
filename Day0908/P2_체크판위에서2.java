package Day0908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;

public class P2_체크판위에서2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        String[][] arr = new String[r][c];

        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < c; j++) {
                arr[i][j] = st.nextToken();
            }
        }

        int cnt = 0;
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {

                for (int k = i+1; k < r-1; k++) {
                    for (int h = j+1; h < c-1; h++) {
                        if (!Objects.equals(arr[0][0], arr[i][j]) && !Objects.equals(arr[i][j], arr[k][h])
                                && !Objects.equals(arr[k][h], arr[r - 1][c - 1]))
                            cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
        br.close();
    }
}
