import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        for(char c:str.toCharArray())
            st.push(c);
        str="";
        while(!st.isEmpty()){
            str = str.concat(st.lastElement().toString());
            st.pop();
        }
        System.out.println("Reversed String is: ".concat(str));
    }
}