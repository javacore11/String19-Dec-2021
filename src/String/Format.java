package String;

public class Format {
    public static void main(String[] args) {
        String str = "Hello";
        String st = String.format("name is %s", str);
        String st1 = String.format("value of %f", 30.88);
        String st2 = String.format("Value is %f.3", 89.778887);
        System.out.println(st);
        System.out.println(st1);
        System.out.println(st2);
    }
}
