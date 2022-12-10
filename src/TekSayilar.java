import java.util.Scanner;
public class TekSayilar {
    public static void main(String[] args) {
        int sayi,toplam;
        Scanner input=new Scanner(System.in);
        toplam=0;


        do {
            System.out.println("sayi giriniz: ");
            sayi= input.nextInt();
            if(sayi%2==0 && sayi%4==0){
                toplam=sayi+toplam;

            }
        }while (sayi%2==0);

        System.out.println("2 ve 4e bölünen sayıların toplamı: "+ toplam);





    }
}
