
class Time { // 以24小時進制儲存時間

    int h, m, s;

    // DIY: 自行完成所需建構式
    Time(int a, int b, int c) {
        this.h = a;
        this.m = b;
        this.s = c;
    }

    Time(String s) {
        String[] a = s.split(":| ");
        if (a.length == 4) {
            if (a[0].equals("PM")) {
                this.h = Integer.parseInt(a[1]) + 12;
                this.m = Integer.parseInt(a[2]);
                this.s = Integer.parseInt(a[3]);
            } else {
                this.h = Integer.parseInt(a[1]);
                this.m = Integer.parseInt(a[2]);
                this.s = Integer.parseInt(a[3]);
            }
        } else if (a.length == 3) {
            this.h = Integer.parseInt(a[0]);
            this.m = Integer.parseInt(a[1]);
            this.s = Integer.parseInt(a[2]);
        } else {
            this.h = 0;
            this.m = 0;
            this.s = 0;
        }
    }

    void show(String msg) {
        System.out.printf("%s%02d:%02d:%02d", msg, h, m, s);
        System.out.println("");
        //可能需修改
    }
}

public class MI3A_0914_HWK2_03 {

    public static void main(String[] args) {

        Time t1 = new Time(15, 30, 20);
        Time t2 = new Time("18:5:50");
        Time t3 = new Time("AM 8:20:50");
        Time t4 = new Time("PM 7:10:40");
        t1.show("t1=");
        t2.show("t2=");
        t3.show("t3=");
        t4.show("t4=");

    }
}
/* [程式輸出]
15:30:20
18:05:50
08:20:50
19:10:40

 */
