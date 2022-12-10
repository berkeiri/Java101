import java.util.Scanner;
public class Kuvvet {
    public static void main(String[] args) {
        int i,n,j;
        Scanner input=new Scanner(System.in);
        System.out.println("kaça kadar gideceğini giriniz:");
        n=input.nextInt();



        i=1;
        j=1;


        do {
            System.out.println(i+" "+ j);
            i=i*4;
            j=j*5;
        }
        while (i<=n &&  j<=n);



    }
}
