import java.util.Scanner;
public class Mukemmel {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi;

        System.out.println("Sayıyı giriniz: ");
        sayi=input.nextInt();
        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam =toplam+i;
            }
        }

        if (toplam == sayi) {
            System.out.println(sayi + " mükemmel bir sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel bir sayı değildir.");
        }
    }
}
