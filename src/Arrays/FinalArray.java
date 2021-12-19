package Arrays;

public class FinalArray {
    public static void main(String[] args) {
        final int[] arr = {12, 30, 20, 30};
        int[] arr1 = {20, 30, 40, 50};
        //arr=arr1;
        System.out.println(arr[0]);
        arr[0] = 100;
        System.out.println(arr[0]);
    }
}
