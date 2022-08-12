import java.util.Scanner;

public class HspMakinesi {
    public static void main(String[] args) {

        int sayi1, sayi2, islem, sonuc = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayýyý Giriniz:");
        sayi1 = input.nextInt();
        System.out.print("2. Sayýyý Giriniz:");
        sayi2 = input.nextInt();

        System.out.println("Yapýlacak Ýþlemi Seçiniz:");
        System.out.println("1-Toplama\n----------\n2-Çýkarma\n----------\n3-Çarpma\n----------\n4-Bölme\n----------");

        islem = input.nextInt();

        switch (islem) {
            case 1 : {
                sonuc = sayi1 + sayi2;
                System.out.print("Seçilen Ýþlem:1-Toplama\n----------\nÝþlemin Sonucu:" + sonuc);
            }
            case 2 : {
                sonuc = sayi1 - sayi2;
                System.out.print("Seçilen Ýþlem:2-Çýkarma\n----------\nÝþlemin Sonucu:" + sonuc);
            }
            case 3 : {
                sonuc = sayi1 * sayi2;
                System.out.print("Seçilen Ýþlem:3-Çarpma\n----------\nÝþlemin Sonucu:" + sonuc);
            }
            case 4 : {
                sonuc = sayi1 / sayi2;
                System.out.print("Seçilen Ýþlem:4-Bölme\n----------\nÝþlemin Sonucu:" + sonuc);
            }
            default : System.out.print("Seçilen Ýþlem:Böyle Bir Ýþlem Bulunamadý.\nHatalý Giriþ Yapýldý!");
        }

    }
}
