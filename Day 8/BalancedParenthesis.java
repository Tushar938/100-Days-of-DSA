import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all Parenthesis: ");
        String str = sc.nextLine();
        for(char c : str.toCharArray()){
            if(c=='}')
                st.pop();
            else    
                st.push('{');
        }
        if(st.isEmpty())
            System.out.println("Parenthesis are balanced.");
        else
            System.out.println("Parenthesis are not balanced.");
    }
}
