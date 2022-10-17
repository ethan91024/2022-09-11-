
import java.util.*;

class Rect {

    int x, y, w, h;

    void set(int a, int b, int c, int d) {
        this.x = a;
        this.y = b;
        this.w = c;
        this.h = d;
    }

    void draw(char a) {
        for (int i = 0; i < w; i++) {
            System.out.print(a);
        }
        System.out.println("");
        for (int i = 0; i < this.h - 2; i++) {
            System.out.print(a);
            for (int j = 0; j < this.w - 2; j++) {
                System.out.print(" ");
            }
            System.out.print(a);
        }
        System.out.println("");
        for (int i = 0; i < w; i++) {
            System.out.print(a);
        }
        System.out.println("");
    }

    public String toString() {
        return "LU=(" + x + "," + y + "), w=" + w + ", h=" + h;
    }

    double overlapArea(Rect r2) {
        if (this == null || r2 == null) {
            return -1;
        }
        double p1_x = this.x, p1_y = this.y - this.h;
        double p2_x = p1_x + this.w, p2_y = this.y;
        double p3_x = r2.x, p3_y = r2.y - r2.h;
        double p4_x = p3_x + r2.w, p4_y = r2.y;

        if (p1_x > p4_x || p2_x < p3_x || p1_y > p4_y || p2_y < p3_y) {
            return 0;
        }
        double Len = Math.min(p2_x, p4_x) - Math.max(p1_x, p3_x);
        double Wid = Math.min(p2_y, p4_y) - Math.max(p1_y, p3_y);
        return Len * Wid;
    }
}

public class MI3A_409630828_0907_HWK1_02 {

    public static void main(String[] args) {
        Rect r1 = new Rect();
        r1.set(1, 4, 4, 3);
        System.out.println("r1=" + r1);
        r1.draw('@');

        Rect r2 = new Rect();
        r2.set(2, 7, 5, 5);
        double overlapArea = r1.overlapArea(r2);
        System.out.println("overlapArea=" + overlapArea);
    }
}
