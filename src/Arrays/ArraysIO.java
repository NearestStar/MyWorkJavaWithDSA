package Arrays;

import java.util.Scanner;

class ArraysIO {
    static int[] input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element at index "+i+" :");
            arr[i] = sc.nextInt();
        }
        
        return arr;
    }

    static void display(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}