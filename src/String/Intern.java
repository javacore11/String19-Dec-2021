package String;

public class Intern {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = s1.intern();
        System.out.println((s1 == s3) ? "Yes" : "No");
        System.out.println((s2 == s3) ? "Yes" : "No");
    }
}
