package Day0905;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P7_괄호쌍만들어주기3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] str = br.readLine().toCharArray();

        int cnt = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '(') {
                for (int j = i+1; j < str.length; j++) {
                    if (str[j] == ')')
                        cnt++;
                }
            }
        }

        System.out.println(cnt);
        br.close();
    }
}
