import java.util.Scanner;
public class asalSayiRec {
    public static int asalSayi(int a){
        Scanner input = new Scanner(System.in);
        System.out.println("a sayısını giriniz:");
        a = input.nextInt();
        if (a == 2) {
            System.out.println("asaldır");
        } else if (a == 1 || a % 2 == 0) {
            System.out.println("asal değildir");
        } else {
            boolean asal = true;
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    asal = false;
                    break;
                }
            }

            if (asal) {
                System.out.println("asaldır");
            } else {
                System.out.println("asal değildir");
            }
        }

        return a;
    }
    public static void main(String[] args) {
        System.out.println(asalSayi(4));

    }
}
