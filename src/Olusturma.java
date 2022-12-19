public class Olusturma {
    static int siralama(int sayi){
        int sayac=sayi;
        boolean a=true;
        int kackez=0;
        System.out.print(sayac+",");

        do {
            sayac=sayac-5;
            kackez+=1;
            System.out.print(sayac+"," );
        }while (sayac>0);
        int i=sayac;
        while (i<(4*kackez)){
            i=i+5;
            System.out.print(i+",");

        }return 0;


    }


    public static void main(String[] args) {

        System.out.println(siralama(18));



    }
}
