package MI3A_409630828_0914_HWK2;


class ClassInfo { // 紀錄一個班的平均分數

    static final int defaultStudNo = 15; // 預設為15位同學
    static final float defaultScore = -1; // 預設的平均分數
    String className;
    double[] avgScore; //儲存每位同學的Avg Score

    ClassInfo() {
        //  DIY: 
        // className = "XXX", 學生人數: defaultStudNo
        // 將avgScore[]中的元素值全部設定為defaultScore 
        this.className = "XXX";
        this.avgScore = new double[15];
        for (int i = 0; i < 15; i++) {
            this.avgScore[i] = defaultScore;
        }
    }

    ClassInfo(String className, int studNo, double initScore) {
        // DIY        
        // 設定班級名稱，學生人數與初始分數(initScore) 
        this.className = className;
        this.avgScore = new double[15];
        for (int i = 0; i < avgScore.length; i++) {
            avgScore[i] = initScore;
        }

    }

    void display() {
        /* DIY */
        System.out.println("className: " + this.className);
        for (int i = 1; i < this.defaultStudNo; i++) {
            System.out.print("[" + i + "]:" + (int) avgScore[i - 1] + ", ");
        }
        System.out.println("[" + 15 + "]:" + (int) avgScore[15 - 1]);
    }
}

public class MI3A_409630828_0914_HWK2_04 {

    public static void main(String[] args) {
        ClassInfo ci1 = new ClassInfo(); // 一個空的班級
        ci1.display(); // 印出className: XXX(換行)[1]:-1, [2]:-1, [3]:-1, …, [15]:-1

        ClassInfo ci2 = new ClassInfo("三乙", 15, 60); //有15人，初始分數為60
        ci2.display(); //印出className:三乙(換行)[1]:60, [2]:60, [3]:60, …, [15]:60
    }
}
