package Day0901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Task1_DateTimeToDateTime {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());

        long startTime = (11 * 24 * 60) + (11 * 60) + 11;
        long endTime = (a * 24 * 60) + (b * 60) + c;

        long answer = endTime - startTime;

        if (answer < 0)
            System.out.println("-1");
        else
            System.out.println(answer);
    }
}
