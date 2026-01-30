package Arrays;

public class evenAndOddCount {
    public static void main(String[] args){
        int[] arr=ArraysIO.input();
        int evenCount=0;
        int oddCount=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Even Numbers: "+evenCount+" Odd Numbers: "+oddCount);
    }
}
