import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {
        int ay,gun;
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen hangi ay olduğunu giriniz");
        ay= input.nextInt();


        if (ay==1){
            System.out.println("lütfen gün giriniz");
            gun=input.nextInt();
            if (gun>=22){
                System.out.println("kova burcu");
            }else{
                System.out.println("oğlak burcu");
            }
        }if (ay==2){
            System.out.println("lütfen gün giriniz");
            gun=input.nextInt();
            if (gun>=20){
                System.out.println("balık burcu");
            }else{
                System.out.println("kova burcu");
            }
        }if (ay==3){
            System.out.println("lütfen gün giriniz");
            gun=input.nextInt();
            if (gun>=21){
                System.out.println("koç burcu");
            }else{
                System.out.println("balık burcu");
            }
        }if (ay==4){
            System.out.println("lütfen gün giriniz");
            gun=input.nextInt();
            if (gun>=21){
                System.out.println("boğa burcu");
            }else{
                System.out.println("koç burcu");
            }
        }if (ay==5){
            System.out.println("lütfen gün giriniz");
            gun=input.nextInt();
            if (gun>=22){
                System.out.println("ikizler burcu");
            }else{
                System.out.println("boğa burcu");
            }
        }if (ay==6){
            System.out.println("lütfen gün giriniz");
            gun=input.nextInt();
            if (gun>=23){
                System.out.println("yengeç burcu");
            }else{
                System.out.println("ikizler burcu");
            }
        }if (ay==7){
            System.out.println("lütfen gün giriniz");
            gun=input.nextInt();
            if (gun>=23){
                System.out.println("aslan burcu");
            }else{
                System.out.println("yengeç burcu");
            }
        }if (ay==8){
            System.out.println("lütfen gün giriniz");
            gun=input.nextInt();
            if (gun>=23){
                System.out.println("başak burcu");
            }else{
                System.out.println("aslan burcu");
            }
        }if (ay==9){
            System.out.println("lütfen gün giriniz");
            gun=input.nextInt();
            if (gun>=23){
                System.out.println("terazi burcu");
            }else{
                System.out.println("başak burcu");
            }
        }if (ay==10){
            System.out.println("lütfen gün giriniz");
            gun=input.nextInt();
            if (gun>=23){
                System.out.println("akrep burcu");
            }else{
                System.out.println("terazi burcu");
            }
        }if (ay==11){
            System.out.println("lütfen gün giriniz");
            gun=input.nextInt();
            if (gun>=22){
                System.out.println("yay burcu");
            }else{
                System.out.println("akrep burcu");
            }
        }if (ay==12){
            System.out.println("lütfen gün giriniz");
            gun=input.nextInt();
            if (gun>=22){
                System.out.println("oğlak burcu");
            }else{
                System.out.println("yay burcu");
            }
        }

    }
}
