import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int num) {
        if (num == 0) return 0;
        return num % 10 + sumOfDigits(num / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Sum of digits: " + sumOfDigits(num));
    }
}