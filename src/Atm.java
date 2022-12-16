import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Objects;
import java.util.Scanner;


public class Atm {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int hak,paraYatir,paraCek,bakiye;
        String kullaniciAdi,sifre,girisYapAd,girisYapSifre;
        boolean girisYapildimi;

        kullaniciAdi="berke";
        sifre="123";
        hak=0;
        girisYapildimi=false;
        bakiye=3000;

        System.out.println("kullanıcı adı giriniz: ");
        girisYapAd=input.nextLine();

        System.out.println("sifre giriniz: ");
        girisYapSifre=input.nextLine();


        while (girisYapildimi=true){
           hak=hak+1;




            if (Objects.equals(girisYapAd, kullaniciAdi)&& Objects.equals(girisYapSifre,sifre)){
                girisYapildimi=true;
                System.out.println("giriş yapıldı");
                System.out.println("lütfen yapılacak işlemi giriniz");
                System.out.println("para çekmek için 1e para yatırmak için 2ye çıkış yapmak için 3e basınız");
                int islem=input.nextInt();
                    switch (islem) {
                        case 1:
                            System.out.println("ne kadar çekmek isterseniz:");
                            paraCek=input.nextInt();
                            if (paraCek<=bakiye){
                                System.out.println("paranızı çekebilirsiniz kalan bakiye: "+ (bakiye-paraCek));
                                break;
                            }else{
                                System.out.println("malesef o kadar bakiyeniz yok");
                                break;
                            }
                        case 2:
                            System.out.println("yatırmak istediğiniz miktarı giriniz");
                            paraYatir= input.nextInt();
                            System.out.println("bakiyeniz :"+(paraYatir+bakiye));
                            break;
                        case 3:
                            System.out.println("çıkış yapıldı");
                            break;
                    }break;


            }else {
                System.out.println("kullanıcı adı yada şifre yanlış");
                girisYapildimi=false;
            }
        }



    }
}
