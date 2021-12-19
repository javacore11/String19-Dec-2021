package String;

public class Split {
    public static void main(String[] args) {
        String str1 = "Hello-Hi-How-Are You";
        String[] split1 = str1.split("-");
        for (String sp1 : split1)
            System.out.println(sp1);
        String str2 = "Hello                how are you";
       // String[] split2 = str2.split("\\s"); //one space
        String[] split2 = str2.split("\\s+");
        for (String sp2 : split2)
            System.out.println(sp2);
    }
}
