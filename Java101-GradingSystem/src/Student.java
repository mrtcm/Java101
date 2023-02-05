public class Student {

    Course c1;
    Course c2 ;
    Course c3 ;
    String name ;
    String stdNo ;
    String classes;
    double avarage=0.0;
    Student(String name ,String stdNo,String classes,Course c1,Course c2 ,Course c3){
        this.name = name ;
        this.stdNo=stdNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 =c3;
    }
    void addBulkExamNote(int note1 ,int note2,int note3,int verbalNote1,int verbalNote2,int verbalNote3){
        if ((note1>=0 && note1<=100)&&(note2>=0 && note2<=100)&&(verbalNote1>=0 && verbalNote1<=100)&&(verbalNote2>=0 && verbalNote2<=100)&&(verbalNote3>=0 && verbalNote3<=100)&&(note3>=0 && note3<=100)){
                this.c1.note = note1;
                this.c2.note=note2;
                this.c3.note=note3;
                this.c1.verbalGrade = verbalNote1;
                this.c2.verbalGrade =verbalNote2;
                this.c3.verbalGrade =verbalNote3;
        }else {
            System.out.println("hatalı veri girdiniz lütfen tekrar deneyin ");
        }
    }
    void calcAvarage(){
            /*
            matematik sözlü %40 sınav %60
            fizik sözlü %30 sınav %70
            tarih sözlü %20 sınav %80
             */
        this.avarage=(((this.c1.verbalGrade*0.20)+(this.c1.note*0.80))+((this.c2.verbalGrade*0.40)+(this.c2.note*0.60))+((this.c3.verbalGrade*0.30)+(this.c3.note*0.70)))/3.0;
    }
    void printNote(){
        calcAvarage();
        System.out.println("merhaba "+this.name+" ortalamanız : "+this.avarage);
        if (this.avarage>55){
            System.out.println("geçtiniz.");
        }
        else {
            System.out.println("kaldınız!");
        }
    }


}
