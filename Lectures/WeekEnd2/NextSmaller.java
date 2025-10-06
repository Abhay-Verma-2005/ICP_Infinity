import java.util.Stack;
public class NextSmaller {
    public static void main(String[] args) {
        int arr[] = {55,11,9,7,13,3,66,60};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        nextsmaller(arr, 5); //put index to search next smaller
    }

    public static void nextsmaller(int[] arr,int tar) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                ans[st.pop()]=arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        System.out.println(ans[tar]);
    }
}
