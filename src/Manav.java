import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        double farmut,felma,fdomates,fmuz,fpatlican,armut,elma,domates,muz,patlican,toplam;
        farmut=2.14;
        felma=3.67;
        fdomates=1.11;
        fmuz=0.95;
        fpatlican=5;

        Scanner input=new Scanner(System.in);
        System.out.println("Kaç kilo armut istersiniz:");
        armut=input.nextInt();
        System.out.println("Kaç kilo elma istersiniz:");
        elma=input.nextInt();
        System.out.println("Kaç kilo domates istersiniz:");
        domates=input.nextInt();
        System.out.println("Kaç kilo muz istersiniz:");
        muz=input.nextInt();
        System.out.println("Kaç kilo patlıcan istersiniz:");
        patlican=input.nextInt();

        toplam=elma*felma+armut*farmut+domates*fdomates+muz*fmuz+patlican*fpatlican;
        System.out.println("Toplam Tutar:" + toplam+ "TL");
    }
}
