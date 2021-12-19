package Arrays;

public class OneAnoArrray {
    public static void AnoFun(int[] arr) {
        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        AnoFun(new int[]{1, 2, 3, 4, 5});
    }
}
