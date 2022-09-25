
class Staff { // 員工

    int ID;
    String name;

    Staff() {
        this.ID = -1;
        this.name = "XXX";
    }

    Staff(int id, String n) {
        ID = id;
        name = n;
    }
}
class Fulltime extends Staff { // 全職員工

    double baseSalary;
    int lenOfService; // 底薪與年資
    // DIY: 自行加入合適的建構式與toString() 

    Fulltime() {
        this.baseSalary = -1;
        this.lenOfService = -1;
    }

    Fulltime(int ID, String name, int sal, int len) {
        this.ID = ID;
        this.name = name;
        this.baseSalary = sal;
        this.lenOfService = len;
    }

    public String toString() {
        return "(" + this.ID + ", " + this.name + ", " + (int) this.baseSalary + ", " + this.lenOfService + ")";
    }
}

public class MI3A_409630828_0921_HWK3_03 {

    public static void main(String[] args) {
        Fulltime f1 = new Fulltime(); // -1, XXX, -1, -1
        Fulltime f2 = new Fulltime(1001, "Peter", 32000, 5);
        System.out.println(f1 + "\n" + f2);
    }
}
