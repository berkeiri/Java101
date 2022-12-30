import java.util.Scanner;
import java.util.Arrays;
public class KucuktenBuyuge {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("dizinin eleman sayısını giriniz");
        int adet=input.nextInt();
        int [] list=new int[adet];
        for (int i = 0; i < list.length; i++) {
            System.out.print("Bir sayı girin: ");
            list[i] = input.nextInt();

        }
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }

        for (int i = 0; i < list.length; i++) {
            System.out.println("Dizinin " + (i+1) + ". elemanı: " + list[i]);
        }


    }

}
