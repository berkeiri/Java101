import java.util.Scanner;
public class usAlmaRes {
    public static int usAlma(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * usAlma(a, b - 1);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("taban sayısını giriniz :");
        int a=input.nextInt();
        System.out.println("üs değerini giriniz: ");
        int b =input.nextInt();
        System.out.println("sonuc: "+ usAlma(a,b));


    }
}
