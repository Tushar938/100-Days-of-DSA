import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string to be reversed: ");
        String str = sc.nextLine();
        String ans = "";

        for(int i=0; i<str.length(); i++){
            ans = ans.concat(Character.toString(str.charAt(str.length()-i-1)));
        }

        System.out.println("Reversed String: ".concat(ans));
    }
}
