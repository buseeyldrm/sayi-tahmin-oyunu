
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int sayi=(int)(Math.random()*100);

        Scanner klavye=new Scanner(System.in);
        int hak=5;
        int secim ;

        int[] hatalar=new int[5];

        boolean kazanma=false;
        boolean kaybetme=false;

        System.out.println("Rasgele Üretilen Sayi: " +sayi);

        while (hak>0) {
            System.out.print("Tahmin Ettiğiniz Sayıyı Girin: ");
            secim = klavye.nextInt();

            if (secim < 0 || secim > 99) {
                System.out.println("Lütfen 0-100 arasında bir sayı girin.");
                if (!kaybetme) {
                    kaybetme = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşecektir.");
                } else {
                    System.out.println("Çok fazla hatalı giriş yaptınız.Kalan hakkınız: " + (--hak));
                    if (hak == 0) {
                        System.err.println("Hakkınız bitmiştir.");
                        break;
                    }
                }
                continue;
            }

            if (secim == sayi) {
                System.out.println("Tebrikler,Doğru tahmin.Tahmin ettiğiniz sayı: " + secim);
                break;
            } else {
                System.err.println("Hatalı Bir Sayı Girdiniz.");
                if (secim > sayi) {
                    System.out.println(secim + " sayısı seçilen sayıdan büyüktür.");
                } else {
                    System.out.println(secim + " sayısı seçilen sayıdan küçüktür.");
                }

            }



            hatalar[hak-1]=secim;
            hak--;
            System.out.println("Kalan Hakkınız: " +hak);


        }


        if (!kazanma){
            System.err.println("KAYBETTİNİZ.");

        }
        if (!kaybetme){
            System.out.println("Tahminleriniz: " + Arrays.toString(hatalar));
        }

    }
}