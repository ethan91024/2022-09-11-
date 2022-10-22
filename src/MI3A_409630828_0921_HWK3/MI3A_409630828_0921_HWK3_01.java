package MI3A_409630828_0921_HWK3;


class Employee { //公司員工

    int ID;
    String name;

    void set(int id, String n) {
        this.ID = id;
        this.name = n;
    }
}

class Fulltime extends Employee { // 全職人員
    // int ID ;	String name ; 

    double baseSalary;
    int lenOfService;

    void set(int id, String n, int salary, int lenOfService) {
        this.ID = id;
        this.name = n;
        this.baseSalary = salary;
        this.lenOfService = lenOfService;
    }

    double calSalary() {
        return this.baseSalary * Math.pow(1.05, this.lenOfService - 1);
    }

    public String toString() {
        return "(" + this.ID + ", " + this.name + ", " + (int) this.baseSalary + ", " + this.lenOfService + ")";
    }

}

public class MI3A_409630828_0921_HWK3_01 {

    public static void main(String[] args) {
        Fulltime f = new Fulltime();
        f.set(1002,"Peter", 37300, 5); // OK ?
//        f.baseSalary = 37300 ; // 比照碩士生基本薪資
//        f.lenOfService = 5 ; // 年資5年
        System.out.println(f);
        System.out.println(f.calSalary());
    }
}
