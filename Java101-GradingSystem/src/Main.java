public class Main {
    public static void main(String[] args) {
        Teacher t1 =new Teacher("mert cem","111","TRH");
        Course c1 = new Course("tarih","101","TRH",t1);
        Teacher t2 = new Teacher("yılmaz","222","MAT");
        Course c2 = new Course("matematik","102","MAT",t2);
        Teacher t3 = new Teacher("şule","333","FZK");
        Course c3 = new Course("fizik","103","MAT",t3);
        Student ali = new Student("ali","1","1",c1,c2,c3);
        c1.addTeacher(t2);
        ali.addBulkExamNote(100,50,50,100,100,100);
        ali.printNote();

    }
}