import java.util.Scanner;
public class ebok {
    public static void main(String[] args) {
        int n1,i,n2,ebob,ekok,k;
        Scanner input=new Scanner(System.in);
        System.out.println("n1 sayısını giriniz: ");
        n1=input.nextInt();

        System.out.println("n2 sayısını giriniz: ");
        n2=input.nextInt();
        i=0;
        ebob=1;

        while (n1>=i){
            i=i+1;
            if (n1%i==0 && n2%i==0){
                ebob=i;

            }
        }
        System.out.println("ebob:"+ ebob);

        k=1;
        while (k<=(n1*n2)){
            k++;
            if (k%n1==0 && k%n2==0){
                System.out.println("ekok:"+k);
                break;
            }
        }


    }
}
