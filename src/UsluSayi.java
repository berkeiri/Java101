import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        int a,b,toplam,dondur;
        Scanner input=new Scanner(System.in);
        toplam=1;
        System.out.println("üssünü almak için 1. değerini giriniz");
        a=input.nextInt();

        System.out.println("üssünü almak için 2. değeri giriniz");
        b=input.nextInt();
        dondur=1;


        while(dondur<=b){
            toplam=toplam*a;
            dondur=dondur+1;

        }
        System.out.println(a+"üzeri"+b+"="+toplam);




    }
}
