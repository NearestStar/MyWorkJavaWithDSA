package Arrays;

public class reverseArray {

    static int[] swap(int arr[], int i, int j){
        int temp;
        temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
        return arr;
    }
    public static void main(String[] args){
        int[] arr=ArraysIO.input();
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            arr=swap(arr, i, j);
            i++;
            j--;
        }
        ArraysIO.display(arr);
    }
}
