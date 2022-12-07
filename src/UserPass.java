import java.util.Objects;
import java.util.Scanner;
public class UserPass {
    public static void main(String[] args) {
        String userName,password;

        Scanner input=new Scanner(System.in);

        System.out.println("kullanıcı adını giriniz : ");
        userName= input.nextLine();

        System.out.println("parola giriniz :");
        password= input.nextLine();

        if (userName.equals("berke")&& password.equals("123")){
            System.out.println("giriş yaptınız");
        }else if(userName.equals("berke")) {
            System.out.println("şifreniz yanlış");
            System.out.println("şifrenizi sıfırlamak ister misiniz ?\n 1- şifrenizi sıfırlamak için 1e basın\n 2-çıkış yapmak için 2ye basınız");
            Scanner input2=new Scanner(System.in);
            int select;


            select=input2.nextInt();
            if (select==1){
                System.out.println("yeni şifrenizi giriniz:");
                Scanner input3=new Scanner(System.in);
                String newpassword;
                newpassword=input3.nextLine();
                    if (newpassword.equals("123")){
                        System.out.println("eski bir şifre girdiniz");
                    }else {
                        System.out.println("Şifreniz oluşturuldu");
                    }
            }else if(select==2){
                System.out.println("çıkış yapılıyor");

            }else {
                System.out.println("lütfen geçerli bir değer giriniz");
            }
        }else {
            System.out.println("hem kullanıcı adı hem şifre hatalı");
        }
    }
}
