import java.util.Scanner;
public class BoyKilo {
    public static void main(String[] args) {
        double boy,kilo,endeks;
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen boyunuzu metre cinsinden giriniz: ");
        boy=input.nextDouble();
        System.out.println("boyunuz:"+ boy);

        System.out.println("lütfen kilonuzu giriniz");
        kilo=input.nextInt();
        System.out.println("kilonuz:"+ kilo);

        endeks=kilo/(boy*boy);
        System.out.println("vücut kitle endeksiniz: "+ endeks);
    }
}
