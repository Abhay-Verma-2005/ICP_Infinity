public class StackClient {
    public static void main(String[] args) {
        Stack st= new Stack();
        System.out.println(st.peek());
        st.push(2);
        System.out.println(st.peek());

        st.push(4);
        System.out.println(st.peek());

        st.push(6);
        System.out.println(st.peek());

        st.push(8);
        System.out.println(st.peek());
        int ele=st.pop();
        System.err.println(st.pop());


    }
}
