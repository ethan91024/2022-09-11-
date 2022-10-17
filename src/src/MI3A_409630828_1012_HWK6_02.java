
import java.awt.*;

interface Shape {

    double area();
}

class Circle implements Shape {

    double r;

    Circle(double r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }
}

class Rect implements Shape {

    double w, h;

    Rect(double w, double h) {
        this.w = w;
        this.h = h;
    }

    public double area() {
        return w * h;
    }
}

class PaintBoard {

    Shape[] shapes = new Shape[100];
    int cnt = 0;

    void add(Shape s) {
        shapes[cnt++] = s;
    }

    double calTotalArea() {
        double area = 0;
        for (int i = 0; i < cnt; i++) {
            area += this.shapes[i].area();
        }
        return area;
    }
}

public class MI3A_409630828_1012_HWK6_02 {

    public static void main(String[] args) {
        PaintBoard pb = new PaintBoard();
        pb.add(new Circle(3));
        pb.add(new Rect(9, 4));
        pb.add(new Circle(5.5));
        System.out.println("Total area=" + pb.calTotalArea());
    }
}
