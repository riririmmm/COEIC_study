package Task_0905;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T8_이상한이진수2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] num = br.readLine().toCharArray();

        int max = -1;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == '0')
                num[i] = '1';
            else if (num[i] == '1')
                num[i] = '0';

            int temp = 0;
            for (int j = 0; j < num.length; j++) {
                int pow = (int) Math.pow(2, num.length - j - 1);
                temp += Integer.parseInt(String.valueOf(num[j])) * pow;
            }

            if (temp > max)
                max = temp;

            if (num[i] == '0')
                num[i] = '1';
            else if (num[i] == '1')
                num[i] = '0';
        }

        System.out.println(max);
        br.close();
    }
}
