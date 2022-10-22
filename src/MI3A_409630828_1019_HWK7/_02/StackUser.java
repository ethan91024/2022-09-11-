package MI3A_409630828_1019_HWK7._02;

public class StackUser {

    public static void main(String[] args) {
        StackX<Integer> alertMsg = new StackX(10); //使用堆疊儲存警告訊息(ID)
        for (int i = 0; i < 30; i++) {
            if (Math.random() > 0.5) {
                alertMsg.push(i);
                if (alertMsg.errFlag != StackError.OK) {
                    StackX<Integer> temp = new StackX(2 * alertMsg.data.length);
                    for (int j = 0; j < alertMsg.data.length; j++) {
                        temp.data[i] = alertMsg.data[i];
                    }
                    alertMsg.errFlag = StackError.OK;
                    alertMsg = temp;
                }
                System.out.println("push():" + i);
            } else {
                Object obj = alertMsg.pop();
                // DIY here
                if (alertMsg.errFlag != StackError.OK) {
                    System.out.println("StackEmpty");
                    alertMsg.errFlag = StackError.OK;
                    continue;
                }
                int x = (Integer) obj;
                System.out.println("pop():" + x);
            }
        }
    }
}
