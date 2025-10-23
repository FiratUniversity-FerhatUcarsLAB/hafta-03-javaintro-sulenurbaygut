// Dosya adı: JavaDeseni.java
public class JavaDeseni {
    public static void main(String[] args) {
        String[] heart = {
            "    Java     Java    ",
            "  JavaJava JavaJava  ",
            " JavaJavaJavaJavaJava ",
            " JavaJavaJavaJavaJava ",
            "  JavaJavaJavaJava  ",
            "   JavaJavaJava   ",
            "    JavaJava    ",
            "     Java     "
        };

        for (String line : heart) {
            System.out.println(line);
        }
    }
}
