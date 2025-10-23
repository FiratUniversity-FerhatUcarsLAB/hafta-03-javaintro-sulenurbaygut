public class DikdortgenHesap {
    public static void main(String[] args) {
        double en = 4.5;
        double boy = 7.9;

        double alan = en * boy;
        double cevre = 2 * (en + boy);

        System.out.printf("Dikdörtgenin alanı: %.4f%n", alan);
        System.out.printf("Dikdörtgenin çevresi: %.4f%n", cevre);
    }
}
