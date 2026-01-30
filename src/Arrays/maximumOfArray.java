package Arrays;

public class maximumOfArray{
    public static void main(String[] args){
        int[] arr=ArraysIO.input();
        int max=Integer.MIN_VALUE;
        int prev=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                prev=max;
                max=arr[i];
            }else if(arr[i]>prev && arr[i]!=max){
                prev=arr[i];
            }
        }
        System.out.println("Maximum element is: "+max);
        System.out.println("Second largest element is: "+prev);
    }
}
