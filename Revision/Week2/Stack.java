public class Stack {
    private int[] st = new int[100];
    private int idx = -1;

    public void push(int ele) {
        if (idx + 1 == st.length) {
            int[] newArr = new int[2 * st.length];
            for (int i = 0; i < st.length; i++) {
                newArr[i] = st[i];
            }
            st = newArr;
        }
        st[++idx] = ele;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return st[idx--];
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return st[idx];
    }

    public boolean isEmpty() {
        return idx == -1;
    }
}
