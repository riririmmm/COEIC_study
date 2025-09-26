package Day0926;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class T1_서로다른수의개수 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashSet<Integer> hashSet = new HashSet<>();
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (!hashSet.contains(num)) {
                hashSet.add(num);
                cnt++;
            }
        }

        System.out.println(cnt);
        br.close();
    }

}
