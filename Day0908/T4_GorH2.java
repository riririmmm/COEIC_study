package Day0908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T4_GorH2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[101];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int loc = Integer.parseInt(st.nextToken());
            arr[loc] = st.nextToken();
        }

        int max = -1;
        for (int i = 0; i < 101-1; i++) {
            for (int j = i; j < 101; j++) {
                int cntG = 0;
                int cntH = 0;

                if (arr[i] == null)   // 시작지점이 null이면 안 됨
                    continue;

                for (int k = i; k <= j; k++) {
                    if (arr[k] == null)       // 끝지점이 null이면 안 됨
                        continue;

                    if (arr[k].equals("G"))
                        cntG++;
                    else if (arr[k].equals("H"))
                        cntH++;

                    if (cntG == cntH)       // G와 H가 같은 경우
                        max = Math.max(max, k-i);

                    if ((cntG == 0 || cntH == 0) && k-i != 0)     // G 또는 H로만 이루어진 경우
                        max = Math.max(max, k-i);
                }

            }
        }

        if (max != -1)
            System.out.println(max);
        else
            System.out.println(0);
        br.close();
    }
}
