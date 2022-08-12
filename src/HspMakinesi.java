import java.util.Scanner;

public class HspMakinesi {
    public static void main(String[] args) {

        int sayi1, sayi2, islem, sonuc = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz:");
        sayi1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz:");
        sayi2 = input.nextInt();

        System.out.println("Yapılacak İşlemi Seçiniz:");
        System.out.println("1-Toplama\n----------\n2-Çıkarma\n----------\n3-Çarpma\n----------\n4-Bölme\n----------");

        islem = input.nextInt();

        switch (islem) {
            case 1 : {
                sonuc = sayi1 + sayi2;
                System.out.print("Seçilen İşlem:1-Toplama\n----------\nİşlemin Sonucu:" + sonuc);
            }
            case 2 : {
                sonuc = sayi1 - sayi2;
                System.out.print("Seçilen İşlem:2-Çıkarma\n----------\nİşlemin Sonucu:" + sonuc);
            }
            case 3 : {
                sonuc = sayi1 * sayi2;
                System.out.print("Seçilen İşlem:3-Çarpma\n----------\nİşlemin Sonucu:" + sonuc);
            }
            case 4 : {
                sonuc = sayi1 / sayi2;
                System.out.print("Seçilen İşlem:4-Bölme\n----------\nİşlemin Sonucu:" + sonuc);
            }
            default : System.out.print("Seçilen İşlem:Böyle Bir İşlem Bulunamadı.\nHatalı Giriş Yapıldı!");
        }

    }
}
