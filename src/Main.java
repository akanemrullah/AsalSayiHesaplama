public class Main {
    public static void main(String[] args) {

        // Gerekli degiskenler tanimlandi.
        boolean check = false;

        // Ic ice for dongusuyle beraber kendinden ve 1 den farkli bir sayiya bolunup bolunememe durumu kontrol edildi. Bolunmesi halinde check adli degisken true olarak atandi.
        // Dista ki her bir dongu icin mantiksal kontroller saglanmadan once check degiskeni false olarak atandi.
        for (int i = 1; i <= 100; i++) {

            check = false;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    check = true;
                }
            }

            // Check false ise mevcut i sayisinin asal oldugu belirtildi.
            if (!check) {
                System.out.println(i + " sayisi asal sayidir.");
            }
        }
    }
}