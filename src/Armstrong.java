import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        int a,b,basamakSayisi,basamaktoplami;
        Scanner input=new Scanner(System.in);

        System.out.println("basamakları toplanacak sayıyı giriniz: ");
        a=input.nextInt();

        basamaktoplami=0;

        while (a!=0){
            b=a%10;
            a=a/10;
            basamaktoplami=basamaktoplami+b;

        }
        System.out.println("basamak sayılarının toplamı:"+ basamaktoplami);
    }
}
