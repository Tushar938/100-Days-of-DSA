import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        char ch = ' ';

        for(int i=0; i<str.length(); i++){
            boolean bool = false;;
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j))
                    bool=true;
            }
            if(!bool){
                ch=str.charAt(i);
                break;
            }
        }
        if(ch!=' ')
            System.out.println("First non repeating character is: ".concat(Character.toString(ch)));
        else
            System.out.println("There are no non repeating characters in the given string");
    }
}
