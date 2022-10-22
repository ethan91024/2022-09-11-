package MI3A_409630828_1019_HWK7;

import java.util.*;

class MyPoint {

    int x, y;

    MyPoint(int a, int b) {
        x = a;
        y = b;
    }

    public double distance(MyPoint a) {
        return Math.sqrt(Math.pow(a.x, 2) + Math.pow(a.y, 2));
    }

    public int compareTo(Object obj) {
        MyPoint a = (MyPoint) obj;
        double dist1 = distance(this);
        double dist2 = distance(a);
        if (dist1 > dist2) {
            return 1;
        } else if (dist1 < dist2) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

class MPComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        MyPoint a = (MyPoint) o1;
        MyPoint b = (MyPoint) o2;
        return a.compareTo(b);
    }
}

public class MI3A_409630828_1019_HWK7_01 {

    public static void main(String[] args) {
        MyPoint[] mps = {new MyPoint(3, 6), new MyPoint(1, 2), new MyPoint(-1, -1), new MyPoint(-8, 9)};
        Arrays.sort(mps, new MPComparator());
        // … 自行用for印出msp //(-1,-1) (1, 2) ( 3,6) (-8,9)
        System.out.print("mps[]=");
        for (int i = 0; i < mps.length; i++) {
            System.out.print(mps[i]);
        }
        System.out.println("");
    }
}
