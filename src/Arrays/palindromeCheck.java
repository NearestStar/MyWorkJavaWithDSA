package Arrays;

public class palindromeCheck {

    public static boolean palindrome_Check(int[] arr){
        int n=arr.length;
        boolean IsPalindrome=true;
        int j=n-1;
        int i=0;
        while(i<=j){
            if(arr[i]!=arr[j]){
                IsPalindrome=false;
            }
            i++;
            j--;
        }
        return IsPalindrome;
    }
    public static void main(String[] args){
        int[] arr=ArraysIO.input();
        System.out.println("Is Palindrome: "+palindrome_Check(arr));
    }
}
