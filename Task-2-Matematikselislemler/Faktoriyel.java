
public class Faktoriyel {
    public static void main(String[] args) {
        int sayi = 5;
        int faktoriyel = 1;
        String ifade = "";

        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
            ifade += i;
            if (i < sayi) {
                ifade += " x ";
            }
            System.out.println("Adım " + i + ": " + faktoriyel);
        }

        System.out.println("\n" + sayi + "! = " + ifade + " = " + faktoriyel);
    }
}
