package TwoDArrays;

import java.util.Scanner;

public class TwoDArraysIO {

    public static int[][] input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the row of the array: ");
        int row=sc.nextInt();
        System.out.println("Enter the size of the col of the array: ");
        int col=sc.nextInt();
        // int row=3;
        // int col=3;
        int[][] arr=new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("Enter the element at index "+i+" , "+j+" :");
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }

    public static void print(int[][] arr){
        int rowSize = arr.length;
        int colSize = arr[0].length;
        for(int i=0; i<rowSize; i++){
            for(int j=0; j<colSize; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printDiagonal(int[][] arr){
        int row=arr.length;
        int col=arr[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i==j){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
    }

    public static void sumOfAll(int[][] arr){
        int row=arr.length;
        int col=arr[0].length;
        int sum=0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum of all elements in 2D array: "+sum);
    }

    public static void sumOfCorresponding(int[][] arr){
        int row=arr.length;
        int col=arr[0].length;
        int res=0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                res+=arr[i][j];
            }
            System.out.println("Sum of corresponding elements of row "+i+" :"+res);
            res=0;
        }
    }

    public static void sumOfCol(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int res=0;
        for(int j=0; j<n; j++){
            for(int i=0; i<m; i++){
                res+=arr[i][j];
            }
            System.out.println("Sum of Column "+j+" is :"+res);
            res=0;
        }
    }

    public static void printUpperDiagonal(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        System.out.println("Elements of the upper diagonal of the array: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i<j){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
    }

    public static void printLowerDiagonal(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        System.out.println("Elements of the lower diagonal of the array: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i>j){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
    }

    public static void transpose(int[][] arr){
        int n=arr.length;
        int m=arr.length;
        int[][] arr1=new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr1[i][j]=arr[j][i];
            }
        }
        System.out.println("Transpose of the array: ");
        print(arr1);
    }
    public static void main(String[] args){
        int[][] arr=input();
        print(arr);
        printDiagonal(arr);
        sumOfAll(arr);
        sumOfCorresponding(arr);
        sumOfCol(arr);
        printUpperDiagonal(arr);
        printLowerDiagonal(arr);
        transpose(arr);
    }
}
