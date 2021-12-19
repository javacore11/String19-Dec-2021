package String;

public class ByteToStringPosition {
    public static void main(String[] args) {
        byte[] b = {72, 75, 111, 99, 100, 69, 88};
        String str = new String(b);
        System.out.println(str);
        String str1 = new String(b, 1, 4);
        System.out.println(str1);
    }
}
