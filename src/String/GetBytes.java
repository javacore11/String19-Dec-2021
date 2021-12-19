package String;

public class GetBytes {
    public static void main(String[] args) {
        String str = "HelloHI";
        byte[] br = str.getBytes();
        for (byte b : br) {
            System.out.println(b);

        }
    }
}

