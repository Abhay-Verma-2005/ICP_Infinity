class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        Stack<String> st= new Stack<>();
        for(int i=0;i<n;i++){
            String t=tokens[i];
            if(t.equals("+") || t.equals("-") || t.equals("/") || t.equals("*")){
                int a=Integer.parseInt(st.pop());
                int b=Integer.parseInt(st.pop());
                int ans=operation(a, b, t);
                st.push(String.valueOf(ans));
            }
            else{
                st.push(t);
            }
        }
        return Integer.parseInt(st.peek());

    }
    public int operation(int a, int b,String s){
        if(s.equals("+")){
            return b+a;
        }
        else if(s.equals("-")){
            return b-a;
        }
        else if(s.equals("/")){
            return b/a;
        }
        return b*a;
    }
}
