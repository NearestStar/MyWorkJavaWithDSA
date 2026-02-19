package Arrays;

public class isAsec {

    public static boolean is_Asec(int[] arr){
        // int cur=arr[0];
        // for(int i=1; i<arr.length; i++){
        //     if(cur>arr[i]){
        //         return false;
        //     }else{
        //         cur=arr[i];
        //     }
        // }
        // return true;

        for(int i=1; i<arr.length; i++){
            if(arr[i]<=arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr=ArraysIO.input();
        System.out.println("Is Array Asec: "+is_Asec(arr));
    }
}
