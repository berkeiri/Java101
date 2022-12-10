import java.util.Scanner;
public class Bolunen {
    public static void main(String[] args) {
        int sayi,i,ortalama,bolunebilenler;
        double sonuc;
        Scanner input=new Scanner(System.in);
        System.out.println("kaça kadar olucağını seçiniz");
        sayi=input.nextInt();
        i=0;
        bolunebilenler=0;
        ortalama=0;



        while(i<sayi){
            i++;
            if (i % 3 == 0 && i%4==0){
                bolunebilenler=i+bolunebilenler;
                ortalama=ortalama+1;
            }


        }
        System.out.println("bölünebilen sayıların toplamı: "+bolunebilenler);
        System.out.println("bölünebilen sayı adedi: " + ortalama);
        System.out.println("ortalması: " + bolunebilenler/ortalama);

    }
}
