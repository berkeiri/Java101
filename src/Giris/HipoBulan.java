package Giris;
import java.util.Scanner;
public class HipoBulan {
    public static void main(String[] args) {
        double a,b,c,u,cevre,alan,x;
        Scanner input=new Scanner(System.in);
        System.out.println("a değeri giriniz");
        a=input.nextInt();
        System.out.println("b değeri giriniz");
        b=input.nextInt();
        System.out.println("c değeri giriniz");
        c=input.nextInt();

        u=(a+b+c)/2;
        alan=u*(u-a)*(u*b)*(u-c);
        alan=Math.sqrt(alan);
        System.out.println(alan);

    }
}
