public class DaireHesap {
    public static void main(String[] args) {
        double yariCap = 5.5;

        double alan = Math.PI * yariCap * yariCap;
        double cevre = 2 * Math.PI * yariCap;

        System.out.printf("Dairenin alanı: %.4f%n", alan);
        System.out.printf("Dairenin çevresi: %.4f%n", cevre);
    }
}
