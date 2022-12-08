import java.util.Scanner;
public class UcakBilet {
    public static void main(String[] args) {
        double mesafe,yas,normalTutar,yasindirimi,gidisDonusindirim,indirimliTutar,gidisDonusindirimliTutar;
        Scanner input=new Scanner(System.in);

        System.out.println("lütfen yaşınızı giriniz: ");
        yas=input.nextInt();

        System.out.println("lütfen gidilecek kmyi giriniz:");
        mesafe=input.nextInt();

        System.out.println("tek yön ise 1e çift yön ise 2ye basınız:");
        int yolculukTipi;
        yolculukTipi=input.nextInt();

        switch (yolculukTipi){
            case 1:
                if (yas>0 && yas<=12){
                    normalTutar=mesafe*0.10;
                    yasindirimi=normalTutar*0.50;
                    indirimliTutar=normalTutar-yasindirimi;
                }else if (yas>12 && yas<=24){
                    normalTutar=mesafe*0.10;
                    yasindirimi=normalTutar*0.10;
                    indirimliTutar=normalTutar-yasindirimi;
                }else if (yas<65){
                    normalTutar=mesafe*0.10;
                    yasindirimi=0;
                    indirimliTutar=normalTutar-yasindirimi;
                }else{
                    normalTutar=mesafe*0.10;
                    yasindirimi=normalTutar*0.50;
                    indirimliTutar=normalTutar-yasindirimi;
                }
                System.out.println("normal tutar: "+normalTutar+"TL"+ "indirimli tutar: "+indirimliTutar );
                break;
            case 2:
                if (yas>0 && yas<=12){
                    normalTutar=mesafe*0.10;
                    yasindirimi=normalTutar*0.50;
                    indirimliTutar=normalTutar-yasindirimi;
                }else if (yas>12 && yas<=24){
                    normalTutar=mesafe*0.10;
                    yasindirimi=normalTutar*0.10;
                    indirimliTutar=normalTutar-yasindirimi;
                }else if (yas<65){
                    normalTutar=mesafe*0.10;
                    yasindirimi=0;
                    indirimliTutar=normalTutar-yasindirimi;
                }else{
                    normalTutar=mesafe*0.10;
                    yasindirimi=normalTutar*0.50;
                    indirimliTutar=normalTutar-yasindirimi;
                }
                gidisDonusindirim=indirimliTutar*0.20;
                gidisDonusindirimliTutar=indirimliTutar-gidisDonusindirim;

                System.out.println("normal tutar: "+normalTutar+"TL"+ "indirimli tutar: "+gidisDonusindirimliTutar );


        }



    }
}
