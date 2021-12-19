package String;

public class IndexOf {
    public static void main(String[] args) {
        String str = "This is an Example of index";
        int index = str.indexOf("is");
        int index1 = str.indexOf("an",4);
        int index2 = str.indexOf('s');
        System.out.println(index+" "+ index1+"  "+index2);
    }
}
