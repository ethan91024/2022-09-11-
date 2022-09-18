
class PointX {

    double x, y;

    PointX() {
    }

    PointX(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void set(double a, double b) {
        this.x = a;
        this.y = b;
    }

    double dist(PointX p2) {
        // DIY
        return Math.sqrt(Math.pow(this.x - p2.x, 2) + Math.pow(this.y - p2.y, 2));
    }
}

class Pentagon { //五邊形

    PointX[] points; //記錄五個頂點

    void set(PointX[] ps) {
        points = ps;
    }

    double boundary() {
        /* DIY 計算周長 */
        if (points == null || points.length != 5) {
            return 0.0;
        }
        double total = 0;
        // DIY here
        for (int i = 0; i < 4; i++) {
            total += this.points[i].dist(this.points[i + 1]);
        }
        total += this.points[4].dist(this.points[0]);
        return total;
    }
}

public class MI3A_0914_HWK2_01 {

    public static void main(String[] args) {
        // 頂點(0,0) (4,0) (6, 2), (4, 4), (0, 4)
        PointX[] ps = {new PointX(0, 0), new PointX(4, 0), new PointX(6, 2), new PointX(4, 4), new PointX(0, 4)};
        Pentagon pen = new Pentagon();
        pen.set(ps);
        System.out.println("周長=" + pen.boundary());
    }
}
