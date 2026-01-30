package FlowControl.Iteration;

import java.util.Scanner;

public class printNtimes {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int result=0;
        for(int i=1;i<=n;i++){
            result=result+i;
        }
        System.out.println("Sum of "+n+" Numbers = "+result);
        sc.close();
    }
}
