package Arrays;

import java.util.Scanner;

public class ClassLevelArray {
    int[] z = new int[5];

    public static void main(String[] args) {
        ClassLevelArray classLevelArray = new ClassLevelArray();
        for (int i = 0; i < classLevelArray.z.length; i++) {
            classLevelArray.z[i] = new Scanner(System.in).nextInt();
        }
        for (int x : classLevelArray.z
        ) {
            System.out.println(x);

        }

    }
}
