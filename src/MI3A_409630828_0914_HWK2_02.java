
class MonthDay {

    int m, d;

    // diy here
    MonthDay(int a, int b) {
        this.m = a;
        this.d = b;
    }

    MonthDay(MonthDay d1) {
        this.m = d1.m;
        this.d = d1.d;
    }

    MonthDay(String a) {
        String[] s = a.split("/");
        this.m = Integer.parseInt(s[0]);
        this.d = Integer.parseInt(s[1]);
    }

    void show(String header) {
        System.out.println(header + m + "/" + d);
    }
}

public class MI3A_409630828_0914_HWK2_02 {

    public static void main(String[] args) {
        // ---- 完成class MonthDay後，自行解開註解 ---

        MonthDay d1 = new MonthDay(12, 5), d2 = new MonthDay(d1);
        MonthDay d3 = new MonthDay("8/15");
        d1.show("d1=");
        d2.show("d2=");
        d3.show("d3=");
    }
}
