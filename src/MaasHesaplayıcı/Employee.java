package MaasHesaplayıcı;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int thisyear=2021;

    public Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    double tax(){
        if(this.salary<10000){
            System.out.println("vergi yok");
            return 0;
        }else {
            System.out.println("ödenecek vergi: "+ this.salary*0.03);
            return this.salary*0.03;
        }
    }
    double bonus(){
        if(this.workHours>=40){
            System.out.println("eklenen bonus: "+ this.workHours*30+"TL");
            return this.workHours*30;
        }
        else{
            System.out.println("bonus bulunmamaktadır.");
            return 0;
        }
    }
    double raiseSalary(){
        if(thisyear-this.hireYear<10){
            System.out.println("zam yapılmıştır: "+ (this.salary*0.05)+"TL");
            return this.salary*0.05;
        }else if (thisyear-this.hireYear<20){
            System.out.println("zam yapılmıştır: "+ (this.salary*0.1)+"TL");
            return this.salary*0.1;
        }else if(thisyear-this.hireYear>19){
            System.out.println("zam yapılmıştır: "+ (this.salary*0.15)+"TL");
            return this.salary*0.15;
        }
        return 0;
    }
    double maasHesapla() {
        double vergi = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double yeniMaas = salary + vergi + bonus + raise;
        return yeniMaas;
    }

    public void run(){
        System.out.println("Adı: "+this.name);
        System.out.println("maaşı: "+this.salary);
        System.out.println("başlangıç yılı:" + this.hireYear);
        tax();
        bonus();
        raiseSalary();
        System.out.println("Vergi ve bonuslar ile birlikte maaş: " + maasHesapla());

    }
}
