
import java.awt.*;
import java.util.Random;
import javax.swing.*;

abstract class Fruit {

    String name; // 學名 
    float cal; //卡路里/克
}

class Apple extends Fruit {

    double calCalorie(double w) {
        return w * cal;
    }

    void draw(JFrame f, Graphics g) {
        System.out.println("Draw Apple");
        Random r = new Random();
        g.drawString("APPLE",
                50 + r.nextInt(f.getHeight() - 50),
                50 + r.nextInt(f.getWidth()) - 50);

    }
}

class Banana extends Fruit {

    double calCalorie(double w) {
        return w * cal;
    }

    void draw(JFrame f, Graphics g) {
        System.out.println("Draw Banana");
        Random r = new Random();
        g.drawString("BANANA",
                50 + r.nextInt(f.getHeight() - 50),
                50 + r.nextInt(f.getWidth() - 50));
    }
}

class MainFrame extends JFrame {

    Apple a = new Apple();
    Banana b = new Banana();
    Apple a2 = new Apple();
    Banana b2 = new Banana();

    // Fruit[] fruits = { a, b, a2, b2} ;    
    MainFrame(int w, int h) {
        super.setSize(w, h);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        g.clearRect(0, 0, this.getWidth(), this.getHeight());
        a.draw(this, g);
        g.setColor(Color.RED);
        b.draw(this, g);
    }
}

public class MI3A_409630828_1012_HWK6_01 {

    public static void main(String[] args) {
        MainFrame frame = new MainFrame(300, 300);
        frame.setVisible(true);
    }
}
