package Prac_0901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac4_십진수변환하기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] digit = br.readLine().toCharArray();
        int length = digit.length - 1;

        int answer = 0;
        for (int i = 0; i <= length; i++) {
            int temp = (int) Math.pow(2, length-i);
            answer += Integer.parseInt(String.valueOf(digit[i])) * temp;
        }

        System.out.println(answer);
    }
}
