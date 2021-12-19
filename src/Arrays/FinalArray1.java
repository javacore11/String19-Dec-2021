package Arrays;

import java.util.Scanner;

public class FinalArray1 {
    public static void main(String[] args) {
        final int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
