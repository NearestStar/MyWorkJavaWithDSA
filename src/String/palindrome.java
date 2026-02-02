package String;

import java.util.Scanner;

public class palindrome {
    public static void IsPalindrome(String str){
        
        for(int i=0; i<str.length(); i++){
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);

            if(start != end){
                System.out.println("Not a palindrome");
                break;
            }
        }
        System.out.println("It's a palindrome");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        IsPalindrome(str);
        sc.close();
    }
}
