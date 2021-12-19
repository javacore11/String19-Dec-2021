package String;

public class ReplaceAll {
    public static void main(String[] args) {
        String str = "Hello Hi how Are you";
        String str1 = str.replaceAll("o", "u");
        System.out.println(str1);
        String str3 = str.replaceAll("\\s", "");
        System.out.println(str3);
    }
}
