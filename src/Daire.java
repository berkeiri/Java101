import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        double pi,r,alan,cevre,a,dilimAlani;
        Scanner input=new Scanner(System.in);
        System.out.println("yarıçapını giriniz: ");
        r=input.nextInt();
        System.out.println("Açıyı giriniz:");
        a=input.nextDouble();

        pi=3.14;
        alan=pi*r*r;
        cevre=2*pi*r;


        System.out.println("dairenin alanı:"+ alan);
        System.out.println(("dairenin çevresi:"+ cevre));
        dilimAlani=(pi * (r*r) * a) / 360;
        System.out.println("Dilim alanı:"+dilimAlani);

    }
}
