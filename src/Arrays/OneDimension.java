package Arrays;

import java.util.Scanner;

public class OneDimension {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
        for (int x : arr) {
            System.out.println(x);

        }
    }


}
