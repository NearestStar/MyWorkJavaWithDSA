package TwoDArrays;

public class maxAndMinOfAnArray {

    public static void max(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Max element of the array: "+max);
    }

    public static void min(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(min>arr[i][j]){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("Min element of the array: "+min);
    }
    public static void main(String[] args){
        int[][] arr=TwoDArraysIO.input();
        max(arr);
        min(arr);
    }
}
