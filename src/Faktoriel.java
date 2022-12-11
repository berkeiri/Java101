import java.util.Scanner;
public class Faktoriel {
    public static void main(String[] args) {
        int n,r,b,c,toplam;
        Scanner input=new Scanner(System.in);

        System.out.println("1. kombinasyonu giriniz:");
        r=input.nextInt();

        System.out.println("2. kombinasyonu giriniz:");
        n=input.nextInt();


        toplam=1;

        if(n>r){
            System.out.println("üzgünüm r değeri nden büyük olamaz");
        }else{
            while (n<=r){
                toplam=toplam*n;
                n=n+1;

            }
            System.out.println(toplam);

        }
    }
}
