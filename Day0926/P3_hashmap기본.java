package Day0926;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P3_hashmap기본 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int k = Integer.parseInt(st.nextToken());

            switch(command) {
                case "add":
                    int value = Integer.parseInt(st.nextToken());
                    m.put(k, value);
                    break;
                case "find":
                    if (m.containsKey(k)) {
                        System.out.println(m.get(k));
                    } else {
                        System.out.println("None");
                    }
                    break;
                case "remove":
                    m.remove(k);
                    break;
            }
        }

        br.close();
    }

}
