package Giris;

import java.util.Scanner;
public class Kdv {
    public static void main(String[] args) {
        double fiyat,kdvorani,kdvli,kdvsiz,kdvtutar;
        Scanner input=new Scanner(System.in);
        System.out.println("fiyatı giriniz");
        fiyat=input.nextInt();
        kdvorani=8;

        if(fiyat<1000){
            kdvorani=18;

        }
        else if (fiyat>1000) {
            kdvorani=8;
            return;
        }
        else {
            System.out.println("geçersiz bir değer");
        }

        kdvli=(fiyat/100)*kdvorani+fiyat;
        kdvsiz=fiyat;
        kdvtutar=(fiyat/100)*kdvorani;

        System.out.println("KDV'siz Fiyat =  "+kdvsiz);
        System.out.println("KDV'li Fiyat =  "+kdvli);
        System.out.println("KDV Tutarı  "+kdvtutar);


    }
}
