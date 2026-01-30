package Arrays;

import java.util.Scanner;

public class Search {

    public static int linearSearch(int[] arr, int tar){
        int n=arr.length;
        for(int i=0; i<n; i++){
            if(tar==arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int tar, int left, int right){
        while(left<right){
            int mid=(int)(right+left)/2;
            if(arr[mid]==tar){
                return mid;
            }else if(arr[mid]<tar){
                left=mid+1;
            }else if(arr[mid]>tar){
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr=ArraysIO.input();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target: ");
        int tar=sc.nextInt();
        System.out.println("Enter the choice of Search(1. For Linear Search. 2. For Binary Search");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                int result=linearSearch(arr, tar);
                System.out.println("Index of the target: "+result);
                ArraysIO.display(arr);
                break;
            case 2:
                result=binarySearch(arr, tar, 0, arr.length-1);
                System.out.println("Index of the target: "+result);
                ArraysIO.display(arr);
                break;
            default:
                break;
        }
        sc.close();
    }
}
