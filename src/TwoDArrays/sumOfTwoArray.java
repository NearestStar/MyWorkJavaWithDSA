package TwoDArrays;

public class sumOfTwoArray {
    public static void main(String[] args){
        int[][] arr1=TwoDArraysIO.input();
        int[][] arr2=TwoDArraysIO.input();
        int row=arr1.length;
        int col=arr1[0].length;
        int[][] arr3=new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        TwoDArraysIO.print(arr3);
    }
}
