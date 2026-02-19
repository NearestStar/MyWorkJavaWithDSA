package Arrays;

import java.util.Scanner;

public class arrays{

    public static int[] ArrayIO(int[] arr, int size){
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        return arr;
    }


    public static void main(String[] args){
        int[] arr=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();

        for(int i=0;i<size;i++){
            System.out.println("Enter the element at index "+i+" :");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.println("Element at index "+i+" :"+arr[i]);
        }
        sc.close();
    }
}