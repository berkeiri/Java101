package Giris;
import java.util.Scanner;
public class TaxiMeter {
    public static void main(String[] args) {
        double acilisTutar,minTutar,kmBasi,gidilecekKm,toplamTutar;
        Scanner input= new Scanner(System.in);
        System.out.println("gidilecek kmyi giriniz: ");
        gidilecekKm=input.nextInt();
        kmBasi=2.20;
        acilisTutar=10;
        toplamTutar=acilisTutar+gidilecekKm*kmBasi;
        minTutar=20;


        if (toplamTutar>20) {
            System.out.println("Ödemeniz gereken tutar" + toplamTutar+"TL");
        }
        else{
            System.out.println("toplam ödenecek tutar" + minTutar+"TL");
        }
    }
}
