import java.util.Scanner;

public class HspMakinesi {
    public static void main(String[] args) {

        int sayi1, sayi2, islem, sonuc = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Say�y� Giriniz:");
        sayi1 = input.nextInt();
        System.out.print("2. Say�y� Giriniz:");
        sayi2 = input.nextInt();

        System.out.println("Yap�lacak ��lemi Se�iniz:");
        System.out.println("1-Toplama\n----------\n2-��karma\n----------\n3-�arpma\n----------\n4-B�lme\n----------");

        islem = input.nextInt();

        switch (islem) {
            case 1 : {
                sonuc = sayi1 + sayi2;
                System.out.print("Se�ilen ��lem:1-Toplama\n----------\n��lemin Sonucu:" + sonuc);
            }
            case 2 : {
                sonuc = sayi1 - sayi2;
                System.out.print("Se�ilen ��lem:2-��karma\n----------\n��lemin Sonucu:" + sonuc);
            }
            case 3 : {
                sonuc = sayi1 * sayi2;
                System.out.print("Se�ilen ��lem:3-�arpma\n----------\n��lemin Sonucu:" + sonuc);
            }
            case 4 : {
                sonuc = sayi1 / sayi2;
                System.out.print("Se�ilen ��lem:4-B�lme\n----------\n��lemin Sonucu:" + sonuc);
            }
            default : System.out.print("Se�ilen ��lem:B�yle Bir ��lem Bulunamad�.\nHatal� Giri� Yap�ld�!");
        }

    }
}
