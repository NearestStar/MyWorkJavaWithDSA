package Arrays;

public class leftRoutate {

    public static int[] left_Routate(int[] arr){
        int temp=arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        return arr;
    }
    public static void main(String[] args){
        int[] arr=ArraysIO.input();
        int[] result=left_Routate(arr);
        System.out.print("Left routated array by 1: ");
        ArraysIO.display(result);
    }
}
