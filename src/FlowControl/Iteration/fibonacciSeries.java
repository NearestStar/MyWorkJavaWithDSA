package FlowControl.Iteration;

import java.util.Scanner;

public class fibonacciSeries {

    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number: ");
            int n=sc.nextInt();
            int sum=0;
            int a=1;
            int b=0;
            for(int i=0;i<=n;i++){
                sum=a+b;
                System.out.print(sum+" ");
                a=b;
                b=sum;
            }
            sc.close();
    }
}