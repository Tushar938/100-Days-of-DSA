import java.util.Scanner;

public class Factorial {
    public static int Factorial(int n){
        if(n==1 || n==0)
            return 1;
        return n*Factorial(n-1);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("Factorial: "+Factorial(n));
    }
}