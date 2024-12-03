import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String rev = "";

        for(int i=0; i<str.length(); i++){
            rev = rev.concat(Character.toString(str.charAt(str.length()-i-1)));
        }
        
        if(str.equals(rev))
            System.out.println(str.concat(" is a palindrome"));
        else
            System.out.println(str.concat(" is not a palindrome"));
    }
}
