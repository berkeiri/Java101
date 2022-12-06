import java.util.Scanner;
public class NotOrt {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Türkçe notunuzu giriniz: ");
        int tr=input.nextInt();


        Scanner input1= new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz: ");
        int mat=input1.nextInt();


        Scanner input2= new Scanner(System.in);
        System.out.println("Fizik notunuzu giriniz: ");
        int fiz=input2.nextInt();


        Scanner input3= new Scanner(System.in);
        System.out.println("Kimya notunuzu giriniz: ");
        int kim=input3.nextInt();


        Scanner input4= new Scanner(System.in);
        System.out.println("Tarih notunuzu giriniz: ");
        int tar=input4.nextInt();


        Scanner input5= new Scanner(System.in);
        System.out.println("Müzik notunuzu giriniz: ");
        int muz=input5.nextInt();



        int ortalama;
        ortalama=(tr+mat+fiz+kim+tar+muz)/6;
        System.out.println(ortalama);


        boolean sonuc=ortalama>=60;

        String str= sonuc ? "Tebrikler sınıfı geçtiniz.":"Malesef sınıfta kaldınız.";
        System.out.println(str);
    }
}
