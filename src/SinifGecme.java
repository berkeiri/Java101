import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        int tr,fiz,mat,kim,tar,muz,dersSayisi,alinanDersler,gecersizDersler;
        dersSayisi=0;
        alinanDersler=0;
        Scanner input= new Scanner(System.in);
        System.out.println("Türkçe notunuzu giriniz: ");
        tr=input.nextInt();
        if(tr>0 && tr<100){
            dersSayisi=dersSayisi+1;
            alinanDersler=alinanDersler+tr;
        } else{
            System.out.println("hiçbişey yapma");
        }



        System.out.println("Matematik notunuzu giriniz: ");
        mat=input.nextInt();
        if(mat>0 && mat<100){
            dersSayisi=dersSayisi+1;
            alinanDersler=alinanDersler+mat;
        } else{
            dersSayisi=dersSayisi;
            alinanDersler=alinanDersler;
        }


        System.out.println("Fizik notunuzu giriniz: ");
        fiz=input.nextInt();
        if(fiz>0 && fiz<100){
            dersSayisi=dersSayisi+1;
            alinanDersler=alinanDersler+fiz;
        } else{
            dersSayisi=dersSayisi;
            alinanDersler=alinanDersler;
        }


        System.out.println("Kimya notunuzu giriniz: ");
        kim=input.nextInt();
        if(kim>0 && kim<100){
            dersSayisi=dersSayisi+1;
            alinanDersler=alinanDersler+kim;
        } else{
            dersSayisi=dersSayisi;
            alinanDersler=alinanDersler;
        }


        System.out.println("Tarih notunuzu giriniz: ");
        tar=input.nextInt();
        if(tar>0 && tar<100){
            dersSayisi=dersSayisi+1;
            alinanDersler=alinanDersler+tar;
        } else{
            dersSayisi=dersSayisi;
            alinanDersler=alinanDersler;
        }


        System.out.println("Müzik notunuzu giriniz: ");
        muz=input.nextInt();
        if(muz>0 && muz<100){
            dersSayisi=dersSayisi+1;
            alinanDersler=alinanDersler+muz;
        } else{
            dersSayisi=dersSayisi;
            alinanDersler=alinanDersler;
        }



        int ortalama;
        ortalama=alinanDersler/dersSayisi;
        System.out.println(ortalama);

        gecersizDersler=6-dersSayisi;

        if (ortalama>=55){
            System.out.println("tebrikler sınıfı geçtiniz ortalamanız: "+ ortalama);
            System.out.println("geçersiz dersler: "+ gecersizDersler);
        }else {
            System.out.println("malesef sınıfta kaldınız ortalamanız:"+ ortalama);
            System.out.println("geçersiz dersler: "+ gecersizDersler);
        }

    }
}
