import java.util.Scanner;
public class Tavsiye {
    public static void main(String[] args) {
        int heat;
        Scanner input=new Scanner(System.in);
        System.out.println("hava derecesini giriniz:");
        heat=input.nextInt();

        if(heat<5){
            System.out.println("kayak yapabilirsiniz");
        }else if(heat<10){
            System.out.println("gidebilirsiniz");
        } else if (heat<15) {
            System.out.println("sinemaya gidebilir ve piknik yapabilirsiniz");
        } else if (heat<25) {
            System.out.println("piknik yapabilirsiniz");
        }else{
            System.out.println("yüzmeye gidebilirsiniz");
        }

    }
}
