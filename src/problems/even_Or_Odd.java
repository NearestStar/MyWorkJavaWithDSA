package problems;

import java.util.Scanner;

public class even_Or_Odd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Given number is even");
        }else{
            System.out.println("Given number is odd");
        }
        sc.close();
    }
}
