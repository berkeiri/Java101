
public class Palidrom {
    static boolean isPalidrom(int number){
        int temp=number,reverseNumber=0,lastNumber ;
        while (temp!=0){
            System.out.println("===========");
            System.out.println("ilk adım:"+temp);
            lastNumber=temp%10;
            System.out.println("ikinci adım:"+lastNumber);
            reverseNumber=(reverseNumber*10)+lastNumber;
            System.out.println("üçüncü adım:"+reverseNumber);
            System.out.println("temp:"+temp);
            temp=temp/10;

        }
        if (number==reverseNumber)
            return true;
        else
            return false;

    }
    public static void main(String[] args) {
        System.out.println(isPalidrom(747));

    }
}
