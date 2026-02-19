package Arrays;

import java.util.Scanner;

public class sumOfAllTheElements {
    public static void main(String[] args){
        int[] arr=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at index "+i+" :");
            arr[i]=sc.nextInt();
        }

        int result=0;

        for(int i=0; i<size; i++){
            System.out.println("Element at index "+i+": "+arr[i]);
            result+=arr[i];
        }

        System.out.println("Result: "+result);

        sc.close();
    }
}
