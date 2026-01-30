package Arrays;

import java.util.Scanner;

public class LeftRotateByK {
    public static void main(String[] args) {
        int[] arr = ArraysIO.input();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of K: ");
        int k = sc.nextInt();

        int n = arr.length;
        k = k % n;   // handle k > n

        int[] temp = new int[k];

        // store first k elements
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // shift remaining elements to left
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // copy temp elements to end
        int j = 0;
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[j++];
        }

        ArraysIO.display(arr);
        sc.close();
    }
}
