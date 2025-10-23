public class AlisverisListesi {
    public static void main(String[] args) {
        // Ürünler, miktar ve fiyatlar
        String[] urunler = {"Elma", "Ekmek", "Süt", "Peynir", "Domates"};
        int[] miktarlar = {3, 2, 1, 1, 5};
        double[] fiyatlar = {2.5, 4.0, 3.2, 12.5, 1.8};

        System.out.println("------------------------------------------------");
        System.out.printf("| %-10s | %-7s | %-7s |\n", "Ürün", "Miktar", "Fiyat");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < urunler.length; i++) {
            System.out.printf("| %-10s | %-7d | %-7.2f |\n", urunler[i], miktarlar[i], fiyatlar[i]);
        }

        System.out.println("------------------------------------------------");
    }
}
