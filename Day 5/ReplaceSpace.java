import java.util.Scanner;

public class ReplaceSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        str = str.replaceAll(" ", "%");

        System.out.println("New string is: ".concat(str));
    }
}
