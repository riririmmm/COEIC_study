package Day0903;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T5_잔해물을덮기위한사각형의최소넓이 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());
        int x4 = Integer.parseInt(st.nextToken());
        int y4 = Integer.parseInt(st.nextToken());

        int w1 = x2 - x1, h1 = y2 - y1;
        int area1 = w1 * h1;

        int ox1 = Math.max(x1, x3);
        int oy1 = Math.max(y1, y3);
        int ox2 = Math.min(x2, x4);
        int oy2 = Math.min(y2, y4);

        if (ox1 >= ox2 || oy1 >= oy2) {
            System.out.println(area1);
            return;
        }

        if (ox1 == x1 && oy1 == y1 && ox2 == x2 && oy2 == y2) {
            System.out.println(0);
            return;
        }

        int ans = area1;

        if (ox1 == x1 && ox2 == x2) {
            if (oy1 <= y1) ans = (y2 - oy2) * w1;
            else if (oy2 >= y2) ans = (oy1 - y1) * w1;
        }
        else if (oy1 == y1 && oy2 == y2) {
            if (ox1 <= x1) ans = (x2 - ox2) * h1;
            else if (ox2 >= x2) ans = (ox1 - x1) * h1;
        }

        System.out.println(ans);
    }
}
