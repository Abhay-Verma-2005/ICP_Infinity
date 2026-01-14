package ICP_Infinity.CompanyQuestion;
import java.util.*;

public class MinimumTransacDelelte {
    public static int solution(String s) {
        int n=s.length();
        boolean isZ=false;
        boolean isF=false;
        int z=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='0'){
                if((isZ )){
                    return n-i-2;
                }
                isZ=true;
                z++;
            }
            else if(s.charAt(i)=='5'){
                if((isZ )){
                    return n-i-2;
                }
                isF=true;
            }
            else if(isF && s.charAt(i)=='7'){
                return n-i-2;
            }
            else if(isF && s.charAt(i)=='2'){
                return n-i-2;
            }
        }
        
        return n-z;

    }










    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String[] inputs = {
        // -------- Given / Normal Cases --------
        "2245047",
        "290830545",
        "345678",
        "2345890",
        "67890",
        "98570",
        "234098",

        // -------- Edge Cases --------
        "0",        // already divisible
        "25",       // already divisible
        "50",       // already divisible
        "75",       // already divisible
        "100",      // ends with 00
        "10",       // delete '1' -> "0"
        "5",        // delete all -> 0
        "1",        // delete all -> 0
        "1111",     // no valid ending
        "2222",     // no valid ending
        "100000",   // many zeros
        "7005",     // delete '5' -> "700"
        "705",      // delete '7' -> "05" -> 5 deletions logic check
        "2500",     // already divisible
        "99999999999999999999" // stress: no valid ending
    };

    int[] expectedOutputs = {
        // -------- Given / Normal Cases --------
        2,
        5,
        6,
        2,
        4,
        1,
        5,

        // -------- Edge Cases --------
        0,  // "0"
        0,  // "25"
        0,  // "50"
        0,  // "75"
        0,  // "100"
        1,  // "10"
        1,  // "5"
        1,  // "1"
        4,  // "1111"
        4,  // "2222"
        0,  // "100000"
        1,  // "7005"
        1,  // "705"
        0,  // "2500"
        20  // all digits deleted
    };
    int c=0;
    for (int i = 0; i < inputs.length; i++) {
        int ans = solution(inputs[i]);
        System.out.println(
            "Input : " + inputs[i] +
            " | Output : " + ans +
            " | Expected : " + expectedOutputs[i]
        );
        if(expectedOutputs[i]==ans){
            c++;
        }
    }
    System.out.printf("Passed : %d  / %d",c,inputs.length);

}
}