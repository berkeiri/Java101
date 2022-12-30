import java.util.Scanner;
import java.util.Arrays;
public class EnYakinSayiyiBul {
    public static void main(String[] args) {
        int[] list = {15,12,100,1,-1,-100,2,0};
        int a = -778;
        int b = 788;
        Scanner input = new Scanner(System.in);
        System.out.println("sayi giriniz:");
        int numbers = input.nextInt();
        for (int i:list) {
            if (i<numbers){
                if (i>a){
                    a=i;
                }
            }
            if (i>numbers) {
                if(i<b){
                    b=i;
                }
            }
        }
        System.out.println("Dizi: "+Arrays.toString(list));
        System.out.println("Girilen Sayı :"+numbers);
        System.out.println("Girilen sayıdan küçük en yakın sayı :"+a);
        System.out.println("Girilen sayıdan büyük en yakın sayı :"+b);


    }
}
