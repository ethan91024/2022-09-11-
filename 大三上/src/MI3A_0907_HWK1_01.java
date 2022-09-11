
import java.util.*;

class Point {

    double x, y;

    void set(double a, double b) {
        this.x = a;
        this.y = b;
    }

    double distOnLine(Point p2, Point p3) {
        if ((p2.y - this.y) / (p2.x - this.x) == (p3.y - this.y) / (p3.x - this.x)) {
            double dist1 = Math.sqrt(Math.pow(this.x - p2.x, 2) + Math.pow(this.y - p2.y, 2));
            double dist2 = Math.sqrt(Math.pow(p2.x - p3.x, 2) + Math.pow(p2.y - p3.y, 2));
            double dist3 = Math.sqrt(Math.pow(this.x - p3.x, 2) + Math.pow(this.y - p3.y, 2));
            double n = dist1 > dist2 ? dist1 : dist2;
            double m = n > dist3 ? n : dist3;
            return m;
        } else {
            return -1;
        }
    }
}

public class MI3A_0907_HWK1_01 {

    public static void main(String[] args) {
        Point p1 = new Point(), p2 = new Point(), p3 = new Point();
        p1.set(5, 3);
        p2.set(3, 0);
        p3.set(4, 1);
        System.out.println("length of line=" + p1.distOnLine(p2, p3));
        Point p4 = new Point();
        p4.set(1, -2);
        System.out.println("length of line=" + p2.distOnLine(p3, p4));
    }
}
