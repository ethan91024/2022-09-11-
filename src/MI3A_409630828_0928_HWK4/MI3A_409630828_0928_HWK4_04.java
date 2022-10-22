package MI3A_409630828_0928_HWK4;


import java.util.*;

class MyList<T> extends LinkedList<T> {

    public static int addLastCnt = 0; // 記錄祖先類別提供的addLast()被呼叫幾次

    public void addList(T item, int n) { // 呼叫祖先類別提供的add(item) n次
        for (int i = 0; i < n; i++) {
            add(item);
        }
    }

    public void addLast(T item) { // 先呼叫祖先類別提供的addLast(item), 
        addLastCnt++;
    }
}

public class MI3A_409630828_0928_HWK4_04 {

    public static void main(String[] args) {
        MyList<Integer> list1 = new MyList<>();
        list1.addList(10, 5); // 將元素10加入串列5次
        System.out.println("list1=" + list1);  // 印出list1=[10, 10, 10, 10, 10] 

        MyList<String> list2 = new MyList<>();
        for (int i = 0; i < 12; i++) {
            list2.addLast("ID" + (1000 + i));
        }
        System.out.println("#calls of addList()=" + MyList.addLastCnt);
        // 印出 #calls of addList()=12     
    }
}
