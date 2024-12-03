import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        String ans = "";

        for(char c : str.toCharArray()){
            if(!ans.contains(Character.toString(c)))
                ans = ans.concat(Character.toString(c));
        }

        System.out.println("String after removing duplicates is: ".concat(ans));
    }
}
