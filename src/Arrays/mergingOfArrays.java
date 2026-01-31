package Arrays;

public class mergingOfArrays {

    public static void mergingOfArrays(int[] arr1, int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int[] arr3=new int[n+m];
        int i=0, j=0, k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
            }else{
                arr3[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            arr3[k]=arr1[i];
            k++;
            i++;
        }
        while(j<m){
            arr3[k]=arr2[j];
            k++;
            j++;
        }
        ArraysIO.display(arr3);
    }
    public static void main(String[] args){
        int[] arr1=ArraysIO.input();
        int[] arr2=ArraysIO.input();
        mergingOfArrays(arr1, arr2);
    }
}
