package MI3A_409630828_1019_HWK7;

public class MI3A_409630828_1019_HWK7_03 {

    public static void main(String[] args) {
        int[] score = {88, -1, 120, 75, 95, 44, 77, 98, -10}; //有些分數不合法
        int max = 0;
        for (int i = 0; i < score.length; i++) {
            try {
                max = maxOf(max, score[i]);
            } catch (Exception e) {
                System.out.println("Exception: " + score[i]);
            }
        }
        System.out.println("Max Score = " + max);
    }

    public static int maxOf(int s1, int s2) throws Exception {
        if (s1 < 0 || s2 < 0) {
            throw new Exception("Score<0");
        }
        if (s1 > 100 || s2 > 100) {
            throw new Exception("Score>100");
        }
        return (s1 >= s2) ? s1 : s2;
    }
}
