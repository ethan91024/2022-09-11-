
import java.awt.Point;

class Shape {

    private Point p1; //形狀的左上角座標，或多邊形的第一個點

    protected void setP1(Point p) {
        this.p1 = p;
    }

    protected Point getP1() {
        return p1;
    }
}

class Ellipse extends Shape { // 繼承Shape, 由左上角座標p1, 長寬為d1,d2的矩形所表示
    // DIY: 變數宣告

    int d1;
    int d2;

    // DIY: 函數定義
    Ellipse() {
    }

    void set(Point p, int d1, int d2) {
        setP1(p);
        this.d1 = d1;
        this.d2 = d2;
    }

    double calArea() {
        return Math.PI * this.d1 * this.d2 / 4;
    }
}

class Triangle extends Shape {  // 繼承Shape, p1代表三角形的第一點
    // DIY: 變數宣告

    Point p2, p3;

    // DIY: 函數定義
    void set(Point[] p) {
        setP1(p[0]);
        this.p2 = p[1];
        this.p3 = p[2];
    }

    double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
    }

    double calArea() {
        double a = distance(getP1(), p2);
        double b = distance(p2, p3);
        double c = distance(getP1(), p3);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class MI3A_409630828_0921_HWK3_02 {

    public static void main(String[] args) {
        Ellipse e = new Ellipse();
        e.set(new Point(10, 10), 12, 7);
        System.out.println("Ellipse Area=" + e.calArea());
        Triangle t = new Triangle();
        Point[] ps = {new Point(-3, 0), new Point(2, 0), new Point(1, 7)};
        t.set(ps);
        System.out.println("Triangle Area=" + t.calArea());
    }
}
