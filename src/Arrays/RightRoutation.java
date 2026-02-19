package Arrays;

import java.util.Scanner;

public class RightRoutation {
    public static void main(String[] args){
        int[] arr=ArraysIO.input();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the K value: ");
        int k=sc.nextInt();
        int n=arr.length;
        k=k%n;
        int[] temp=new int[k];
        int j = 0;
        for(int i=n-k; i<n; i++){
            temp[j]=arr[i]; 
            j++;       
        }
        for(int i=n-k-1; i>=0; i--){
            arr[i+k]=arr[i];
        }
        for(int i=0; i<k; i++){
            arr[i]=temp[i];
        }
        ArraysIO.display(arr);
        sc.close();
    }
}
