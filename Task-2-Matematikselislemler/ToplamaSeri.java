public class ToplamaSeri {
    public static void main(String[] args) {
        int toplam = 0;
        String ifade = "";

        for (int i = 1; i <= 9; i++) {
            toplam += i;
            ifade += i;
            if (i < 9) {
                ifade += " + ";
            }
        }

        System.out.println(ifade + " = " + toplam);
    }
}
