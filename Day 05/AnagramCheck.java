import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter secound String: ");
        String str2 = sc.nextLine();

        if(isAnagram(str1, str2))
            System.out.println(str1+" and "+str2+" are Anagrams");
        else    
            System.out.println(str1+" and "+str2+" are not Anagrams");
    }
    public static boolean isAnagram(String str1, String str2){
        boolean bool = false;
        if(str1.length()!=str2.length())
            return false;
        else{
            for(char c:str1.toCharArray()){
                bool=false;
                for(char d:str2.toCharArray()){
                    if(c==d){
                        bool=true;
                        break;
                    }
                }
                if(!bool)
                    return bool;
            }
        }        
        return bool;
    }
}
