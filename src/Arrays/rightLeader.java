package Arrays;



    public class rightLeader {







    //     public static int[] leaderRight(int[] arr) {
    //     int n = arr.length;
    //     int[] leaArr = new int[n];
    //     int idx = 0;

    //     for (int i = 0; i < n; i++) {
    //         boolean isLeader = true;

    //         for (int j = i + 1; j < n; j++) {
    //             if (arr[j] > arr[i]) {
    //                 isLeader = false;
    //                 break;
    //             }
    //         }

    //         if (isLeader) {
    //             leaArr[idx++] = arr[i];
    //         }
    //     }
    //     return Arrays.copyOf(leaArr, idx);
    // }







    // public static void leaderRight(int[] arr){
    //     int n=arr.length;
    //     int idx=0;
    //     int j=0;
    //     int[] leaArr=new int[n];
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0; i<n; i++){
    //         if(max<arr[i]){
    //             max=arr[i];
    //             idx=i;
    //         }
    //     }
    //     leaArr[j++]=max;
    //     leaArr[j++]=arr[n-1];
    //     if(max==arr[n-1]){
    //         System.out.println("Leader is "+max);
    //     }else{
    //         for(int i=idx+1; i<n; i++){
    //             if(arr[i]>arr[n-1]){
    //                 leaArr[j] = arr[i];
    //                 j++;
    //             }
    //         }
    //     }
    //     ArraysIO.display(leaArr);
    // }







    //     public static int[] leaderRight(int[] arr) {
    //     int n = arr.length;
    //     int[] leaArr = new int[n];
    //     int idx = 0;

    //     for (int i = n-1; i >= 0; i--) {
    //         boolean isLeader = true;

    //         for (int j = i + 1; j < n; j++) {
    //             if (arr[j] > arr[i]) {
    //                 isLeader = false;
    //                 break;
    //             }
    //         }

    //         if (isLeader) {
    //             leaArr[idx++] = arr[i];
    //         }
    //     }
    //     return Arrays.copyOf(leaArr, idx);
    // }




    public static void leaderRight(int[] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=n-1; i>=0; i--){
            if(arr[i]>=max){
                System.out.print(arr[i]+" ");
                max=arr[i];
            }
        }
    }


    public static void main(String[] args){
        int[] arr=ArraysIO.input();
        leaderRight(arr);
    }
}
