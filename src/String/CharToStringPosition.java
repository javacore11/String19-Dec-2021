package String;

public class CharToStringPosition {
    public static void main(String[] args) {
        char[] ch = {'A', 'B', 'C', 'D', 'H', 'F'};
        String str = new String(ch, 2, 3);
        System.out.println(str);
    }
}
