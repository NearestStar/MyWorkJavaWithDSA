package Arrays;

public class zerosAtEnd {
    public static void main(String[] args){
        int[] arr=ArraysIO.input();
        

        //O(n)
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j++]=arr[i];
            }
        }

        //O(0)
        while(j<arr.length){
            arr[j]=0;
            j++;
        }
        ArraysIO.display(arr);
    }
}
