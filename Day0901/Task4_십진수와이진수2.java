package Day0901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4_십진수와이진수2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] digit = br.readLine().toCharArray();
        int length = digit.length - 1;

        int number = 0;
        for (int i = 0; i <= length; i++) {
            int temp = (int) Math.pow(2, length-i);
            number += Integer.parseInt(String.valueOf(digit[i])) * temp;
        }

        number = number * 17;

        StringBuilder answer = new StringBuilder();

        while (true) {
            if (number < 2) {
                answer.insert(0, number);
                break;
            }

            answer.insert(0, number % 2);
            number = number / 2;
        }

        System.out.println(answer);
        br.close();
    }
}
