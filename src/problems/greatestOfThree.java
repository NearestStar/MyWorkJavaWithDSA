package problems;

import java.util.*;

public class greatestOfThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();
        System.out.println("Enter number 3: ");
        int c = sc.nextInt();

        // if(a>b){
        //     if(a>c){
        //         System.out.println("Greater Number Is: "+a);
        //     }else if(c>a){
        //         System.out.println("Greater Number Is: "+c);
        //     }
        // }
        // else if(b>c){
        //     System.out.println("Greater Number Is: "+b);
        // }
        // else{
        //     System.out.println("Greater Number Is: "+c);
        // }

        System.out.println("Greatest Number: "+Math.max(a, Math.max(b, c)));

        if (a>b && a>c){
            System.out.println("Greater Number Is: "+a);
        }
        sc.close();
    }
}
