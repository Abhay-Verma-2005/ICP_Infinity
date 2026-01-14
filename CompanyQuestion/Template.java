package ICP_Infinity.CompanyQuestion;
import java.util.*;
public class Template {
    public static int solution(String num) {
        // WRITE CODE HERE

        return 0; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = {
            "290830545",
            "345678",
            "2345890",
            "67890",
            "98570",
            "234098"
        };

        int[] expectedOutputs = {
            5,
            6,
            2,
            4,
            1,
            5
        };

        for (int i = 0; i < inputs.length; i++) {
            int ans = solution(inputs[i]);
            System.out.println(
                "Input  : " + inputs[i] +
                " | Output : " + ans +
                " | Expected : " + expectedOutputs[i]
            );
        }

        sc.close();
    }
}
