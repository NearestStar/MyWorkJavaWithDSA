package TwoDArrays;

import java.util.Scanner;

public class searchElement {

    public static void search(int[][] arr, int tar){
        int n=arr.length;
        int m=arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(tar==arr[i][j]){
                    System.out.println("Element found at row "+i+" and at col "+j+" :"+arr[i][j]);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[][] arr=TwoDArraysIO.input();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to be searched: ");
        int tar=sc.nextInt();
        search(arr, tar);
        sc.close();
    }
}
