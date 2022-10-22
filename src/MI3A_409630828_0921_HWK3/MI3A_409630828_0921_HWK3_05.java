package MI3A_409630828_0921_HWK3;


import java.awt.Point;

class Shape {

    protected Point p; // 記錄形狀的左上角座標
    protected double w, h;

    void set(Point upLeft, double w, double h) {
        // DIY here
        this.p = upLeft;
        this.w = w;
        this.h = h;
    }

    double calArea() {
        return -1;
    } // 不知道是何形狀，所以回傳-1

    public String toString() {
        return p + "," + w + "," + h;
    }
}

class Ellipse extends Shape { // 橢圓形
    // DIY here, toString(), calArea()

    Ellipse(Point upLeft, int w, int h) {
        this.p = upLeft;
        this.w = w;
        this.h = h;
    }

    double calArea() {
        return Math.PI * this.w * this.h / 4;
    }

    public String toString() {
        return " center:(" + (int) p.getX() + "," + (int) p.getY() + "), r1=" + (int) w / 2 + ", r2=" + (int) h / 2;
    }
}

public class MI3A_409630828_0921_HWK3_05 {

    public static void main(String[] args) {
        Ellipse e = new Ellipse(new Point(5, 10), 8, 10); // 左上角，長、短邊
        System.out.println("e=" + e); // 印出e= center:(5,10), r1=4, r2=5
        System.out.println("area of e =" + e.calArea()); // 印出面積
    }
}
