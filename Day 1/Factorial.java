import java.util.*;

public class Factorial {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int ans = 1;
        sc.close();
        if(num==0 || num==1)
            ans = 1;
        else{
            while(num>1){
                ans*=num;
                num--;
            }
        } 
        System.out.println("Factorial is: "+ans);
    }
}