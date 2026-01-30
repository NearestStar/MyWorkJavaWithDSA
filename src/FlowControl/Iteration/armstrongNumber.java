package FlowControl.Iteration;

import java.util.*;

public class armstrongNumber {

    public static int count(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }

    public static boolean isArmstrong(int n){
        int count=count(n);
        int current=n;
        double sum=0;
        while(current>0){
            int digit=current%10;
            sum=sum+Math.pow(digit, count);
            current=current/10;
        }
        return sum==n;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(isArmstrong(i)){
                System.out.println(i+" is an Armstrong Number");
            }
        }
        sc.close();
    }
}
