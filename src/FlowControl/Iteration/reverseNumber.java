package FlowControl.Iteration;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String num = sc.nextLine();
        String rev="";
        for(int i=num.length()-1; i>=0; i--){
            rev=rev+num.charAt(i);
        }
        System.out.println(rev);


        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // int rev=0;
        // while(num!=0){
        //     int digit=num%10;
        //     rev=rev*10+digit;
        //     num=num/10;
        // }
        // System.out.println(rev);
        sc.close();
    } 
}
