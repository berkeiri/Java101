public class TekrarEden {
    public static void main(String[] args) {
        int[]list={3,4,3,4,9,18,21,1,33,9,1};
        for (int i=0; i< list.length;i++){
            for (int j=0; j<list.length;j++){
                if((i!=j)&& (list[i]==list[j])){
                    if (list[i]%2==0){
                        System.out.println(list[i]);
                    }
                }
            }
        }
    }
}
