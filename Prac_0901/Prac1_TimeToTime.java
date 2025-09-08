package Prac_0901;

import java.util.Scanner;

public class Prac1_TimeToTime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int timeAB = (a * 60) + b;
        int timeCD = (c * 60) + d;

        int answer = timeCD - timeAB;

        System.out.println(answer);
    }
}
