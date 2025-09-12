package Day0905;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T11_괄호쌍만들어주기2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();

        int cnt = 0;
        for (int i = 1; i < str.length; i++) {
            if (str[i-1] == '(' && str[i] == '(') {     // 여는 괄호 연속
                for (int j = i+1; j < str.length-1; j++) {
                    if (str[j] == ')' && str[j+1] == ')') {     // 닫는 괄호 연속
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
        br.close();
    }
}
