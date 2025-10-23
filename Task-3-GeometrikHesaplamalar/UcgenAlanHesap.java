public class UcgenHesap {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;

        double cevre = a + b + c;
        double s = cevre / 2; // Yarı çevre
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.printf("Üçgenin çevresi: %.4f%n", cevre);
        System.out.printf("Üçgenin alanı: %.4f%n", alan);
    }
}
