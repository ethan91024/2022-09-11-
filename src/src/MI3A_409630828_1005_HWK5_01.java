
import java.util.Arrays;

class StudentRec {

    int id;
    String name;
    int[] score;

    StudentRec(int a, String b, int[] c) {
        this.id = a;
        this.name = b;
        this.score = c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StudentRec == false) {
            return false;
        }
        StudentRec a = (StudentRec) obj;
        if (this.id != a.id) {
            return false;
        } else if (!this.name.equals(a.name)) {
            return false;
        } else {
            for (int i = 0; i < this.score.length; i++) {
                if (this.score[i] != a.score[i]) {
                    return false;
                }
            }
        }
        return true;
// DIY, 自行修改
    }

    public String toString() {
        return String.format("(%d,%s,%s)", this.id, this.name, Arrays.toString(score));
    }
}

public class MI3A_409630828_1005_HWK5_01 {

    public static void main(String[] args) {
        int[] s1 = {77, 88, 99, 100}, s2 = {77, 88, 99, 100}, s3 = {77, 99, 100};
        String n1 = new String("Peter"), n2 = new String("Peter"), n3 = "Peter";
        StudentRec sr1 = new StudentRec(1001, n1, s1);
        StudentRec sr2 = new StudentRec(1001, n2, s2);
        StudentRec sr3 = new StudentRec(1001, n3, s3);
        if (sr1.equals(sr2)) {
            System.out.println("sr1 equals to sr2"); // yes
        }
        if (sr1.equals(sr3)) {
            System.out.println("sr1 equals to sr3"); // no
        }
        if (sr1.equals(sr1)) {
            System.out.println("sr1 equals to sr1"); // yes
        }
        if (sr1.equals("Peter")) {
            System.out.println("sr1 equals to \"Peter\""); // no
        }
    }
}
