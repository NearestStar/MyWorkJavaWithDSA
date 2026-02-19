package Arrays;

public class minimumOfArray {
    public static void main(String[] args){
        int[] arr=ArraysIO.input();
        int min=Integer.MAX_VALUE;
        int prev=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                prev=min;
                min=arr[i];
            }else if(arr[i]<prev && arr[i]!=min){
                prev=arr[i];
            }
        }
        System.out.println("Minimum: "+min);
        System.out.println("Second smallest: "+prev);
    }
}
    