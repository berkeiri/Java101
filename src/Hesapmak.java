import java.util.Scanner;
public class Hesapmak {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input=new Scanner(System.in);
        System.out.println("ilk Sayıyı giriniz: ");
        n1=input.nextInt();

        System.out.println("İkinci Sayıyı giriniz: ");
        n2=input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma \n3-Çarpma\n4-Bölme");
        System.out.println("Yapılacak işlemi giriniz:");
        select=input.nextInt();

        switch (select){
            case 1:
                System.out.println("toplama:"+(n1+n2));
                break;
            case 2:
                System.out.println("çıkarma:"+(n1-n2));
                break;
            case 3:
                System.out.println("çarpma:"+(n1*n2));
                break;
            case 4:
                System.out.println("bölme:"+(n1/n2));
                break;
            default:
                System.out.println("lütfen doğru bir değer giriniz");


        }




    }
}
