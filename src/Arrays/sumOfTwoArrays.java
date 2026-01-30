package Arrays;

import java.util.Scanner;

public class sumOfTwoArrays{
    public static void main(String[] args){
        int[] arr1=new int[100];
        int[] arr2=new int[100];
        int[] arr3=new int[100];

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();


        // arr1=ArraysIO.input();



        for(int i=0; i<size; i++){
            System.out.println("Enter the elements of the first array at index "+i+" :");
            arr1[i]=sc.nextInt();
            System.out.println("Enter the elements of the second array at index "+i+" :");
            arr2[i]=sc.nextInt();
            arr3[i]=arr1[i]+arr2[i];
            System.out.println(arr1[i]+" + "+arr2[i]+" = "+arr3[i]+"");
        }
        for(int i=0; i<size; i++){
            System.out.println("Enter the elements of the second array at index "+i+" :");
            arr2[i]=sc.nextInt();
            arr3[i]=arr1[i]+arr2[i];
            System.out.println("Elements of the resultant array at index "+i+" :"+arr3[i]);
            System.out.println(arr1[i]+" + "+arr2[i]+" = "+arr3[i]+"");
        }
        //  for(int i=0; i<size; i++){
        //     arr3[i]=arr1[i]+arr2[i];
        //     System.out.println("Elements of the resultant array at index "+i+" :"+arr3[i]);
        // }
        sc.close();
    }
}
