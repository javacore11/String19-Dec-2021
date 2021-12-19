package String;

public class StartsWith {
    public static void main(String[] args) {
        String str = "Hello Hi";
        System.out.println(str.startsWith("He"));
        System.out.println(str.startsWith("H"));
        System.out.println(str.startsWith("hi"));
        System.out.println(str.startsWith("Hi",6));

    }
}
