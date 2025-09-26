package Day0926;

import java.io.*;
import java.util.HashMap;

public class P5_가장많은데이터 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> hashMap = new HashMap<>();
        int max = 1;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (!hashMap.containsKey(str)) {            // 새로운 단어인 경우
                hashMap.put(str, 1);
            } else {                                    // 이미 저장된 단어인 경우
                hashMap.put(str, hashMap.get(str)+1);
                max = Math.max(max, hashMap.get(str));
            }
        }

        System.out.println(max);
        br.close();
    }

}
