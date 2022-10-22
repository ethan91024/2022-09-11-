package MI3A_409630828_0921_HWK3;

import java.awt.*;

class Point {

    int x, y;

    void set(int a, int b) {
        this.x = a;
        this.y = b;
    }
}

class Point3D extends Point {

    int z;

    void set(int a, int b, int c) {
        set(a, b);
        this.z = c;
    }
}

class ColorPoint extends Point3D { // 球體

    Color c;

    ColorPoint(int a, int b, int c, Color color) {
        this.x = a;
        this.y = b;
        this.z = c;
        this.c = color;

    }

    public String toString() {
        String b = "";
        if (c.getRed() == 255) {
            b = "RED";
        }
        return "(x,y,z)=(" + this.x + "," + this.y + "," + this.z + "), Color=" + b;
    }
}

public class MI3A_409630828_0921_HWK3_04_CorrectVersion {

    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 3, 9, Color.RED);
        System.out.println("cp=" + cp);
    }
}
