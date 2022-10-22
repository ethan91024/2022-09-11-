package MI3A_409630828_1019_HWK7._02;

public class StackX<T> {

    int errFlag = StackError.OK;
    T[] data;
    int top = -1;

    public StackX(int size) {
        if (size < 1) {
            size = 5;
        }
        data = (T[]) new Object[size];
    }

    public void push(T o) {
        if (top == data.length - 1) // Exception Handling
        {
            errFlag = StackError.STACK_FULL;
        } else {
            data[++top] = o;
        }
    }

    public T pop() {
        if (top < 0) {
            errFlag = StackError.STACK_EMPTY;
            return null;
        } else {
            return data[top--];
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < this.data.length; i++) {
            s += this.data[i];
        }
        return s;
    }
}
