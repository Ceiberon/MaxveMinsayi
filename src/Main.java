import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int s, sayi, kucuk, buyuk;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç sayı karşılaştırmak istersiniz : ");
        s = input.nextInt();

        System.out.print("1. sayınızı giriniz: ");
        kucuk = input.nextInt();
        buyuk = kucuk;

        for (int i = 2; i <= s; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = input.nextInt();

            if (sayi < kucuk){
                kucuk = sayi;
            } else if (sayi > buyuk) {
                buyuk = sayi;
            }
        }
        System.out.println("En küçük : " + kucuk);
        System.out.println("En büyük : " + buyuk);
    }
}