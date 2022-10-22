package MI3A_409630828_0928_HWK4;


class ID {

    private int id;

    ID(int a) {
        this.id = a;
    }

    void reset() {
        id = -1;
    }

    public String toString() {
        return "(" + id + "";
    }
}

class Score extends ID {

    private float gpa;

    Score(int a, float b) {
        super(a);
        this.gpa = b;
    }

    void reset() {
        // DIY here  
        super.reset();
        gpa = -1;
    }

    public String toString() { // id,gpa
        String s = super.toString();
        return s + ", " + gpa; // DIY
    }
}

class Record extends Score {

    private String comment;

    Record(int a, float b, String s) {
        super(a, b);
        this.comment = s;
    }

    void reset() {
        // DIY here
        super.reset();
        comment = "XXX";
    }

    public String toString() {
        String s = super.toString();
        return s + ", " + comment + ")"; // DIY 
    }
}

public class MI3A_409630828_0928_HWK4_03 {

    public static void main(String[] args) {
        Record r = new Record(1001, 4.3f, "GOOD");
        System.out.println("Record=" + r); // 印出(1001, 4.3, GOOD)
        r.reset(); // id=-1,  gpa=-1,  comment="XXX"
        System.out.println("Record=" + r); // 印出(-1, -1, XXX)
    }
}
