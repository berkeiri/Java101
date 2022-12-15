import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args) {
        double sayi,i,islem,sonuc;
        Scanner input=new Scanner(System.in);
        System.out.println("harmoniği hesaplanıcak değeri giriniz: ");
        sayi=input.nextInt();
        sonuc=0;
        i=1;

        while (i<=sayi){
            sonuc=sonuc+(1/i);
            i=i+1;


        }
        System.out.println("sonuc: "+ sonuc);
    }
}
