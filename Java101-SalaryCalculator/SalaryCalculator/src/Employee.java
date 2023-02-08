public class Employee {
    String name;
    double salary;
    int hireYear ;
    int workHours;
    Employee(String name,double salary,int workHours,int hireYear){
        this.name = name;
        this.salary =salary;
        this.hireYear=hireYear;
        this.workHours=workHours;
    }
    double tax(double salary){
        if (this.salary >1000){
            return salary*(0.03);
        }
        return 0;
    }
    int bonus(int workHours){
        int moreHourse ;
        int totalBonus = 0;
        if (workHours>40){
            moreHourse= workHours  - 40;
            totalBonus = moreHourse*30;
            return totalBonus;
        }
       return totalBonus ;
    }
    double raiseSalary(int hireYear) {
        int todaysYear = 2021;
        if ((todaysYear - hireYear) < 10) {
            return (this.salary * 0.05);
        } else if ((todaysYear - hireYear > 9) && (todaysYear - hireYear < 20)) {
            return (this.salary * 0.10);
        } else if ((todaysYear - hireYear) > 19) {
            return (this.salary * 0.15);
        }
        return 0;
    }

    void tooString(){
        System.out.println(this.name+"\n"+"maaşı : "+this.salary+"\n"+"çalışma saati : "+this.workHours+"\n"+
        "başlangıç yılı : "+this.hireYear+"\n"+"vergi : "+tax(this.salary)+"\n"+
         "bonus : "+bonus(this.workHours)+"\n"+"maaş artışı : "+raiseSalary(this.hireYear)+"\n"+
        "vergi ve bonuslar eklenince maaş : "+(this.salary-tax(this.salary)+bonus(this.workHours))+"\n"+"toplam mmaş : "+(this.salary+tax(this.salary)+bonus(this.workHours)+raiseSalary(this.hireYear)));


    }
}
