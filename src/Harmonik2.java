public class Harmonik2 {
    public static void main(String[] args) {
        int [] numbers={5,10,30,40,50,60};
        double toplam=0;

        for (int i=0; i<numbers.length; i++){
            double elemanlar=numbers[i];
            System.out.println(elemanlar);
            for(double k=1; k<=elemanlar;k++){
                toplam=toplam+(1/k);
            }
            System.out.println(elemanlar+"sayısının harmonik ortalaması"+ toplam);
        }

    }
}
