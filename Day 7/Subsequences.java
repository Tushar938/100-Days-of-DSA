import java.util.Scanner;

public class Subsequences {
    public static void printSubsequences(String str, String current, int index) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }
        printSubsequences(str, current + str.charAt(index), index + 1);
        printSubsequences(str, current, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        printSubsequences(str, "", 0);
    }
}
