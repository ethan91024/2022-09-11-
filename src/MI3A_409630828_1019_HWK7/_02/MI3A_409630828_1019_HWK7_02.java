package MI3A_409630828_1019_HWK7._02;

public class MI3A_409630828_1019_HWK7_02 {

    public static void main(String[] args) {
        StackX s = new StackX(5); // size=5
        System.out.println("s.pop()=" + s.pop());
        System.out.println("----------------");
        for (int i = 0; i < 6; i++) {
            s.push(i);
        }
        System.out.println("s=" + s);
    }
}
