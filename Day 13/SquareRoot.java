import java.util.Scanner;

public class SquareRoot {
    public static double sqrt(int x, double precision) {
        double left = 0, right = x, mid = 0;
        while (right - left > precision) {
            mid = left + (right - left) / 2;
            if (mid * mid <= x) left = mid;
            else right = mid;
        }
        return left;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precision = 2;
        System.out.println("Enter the number: ");
        System.out.println("SquareRoot is: "+sqrt(sc.nextInt(), precision));
    }
}
