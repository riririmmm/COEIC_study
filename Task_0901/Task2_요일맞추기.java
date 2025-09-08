package Task_0901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Task2_요일맞추기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dateStr = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int date = 0;
        while (true) {
            if (m1 == m2 && d1 == d2)
                break;

            if ((m1 > m2) || (m1 == m2 && d1 > d2)) {
                d1--;
                date--;

                if (d1 < 1) {
                    m1--;
                    d1 = num_of_days[m1];
                }

                if (date < 0) {
                    date = 7 + date;
                }
            } else {
                d1++;
                date++;

                if (date > 6)
                    date = 0;

                if (d1 > num_of_days[m1]) {
                    m1++;
                    d1 = 1;
                }
            }

        }

        System.out.println(dateStr[date]);
    }
}
