public class Teacher {
    String name ;
    String mpno;
    String branch;
    Teacher(String name ,String mpno,String branch){
        this.branch = branch;
        this.name = name;
        this.mpno=mpno;
    }
    void printTeacherInfo(){
        System.out.println("adı : " + this.name);
        System.out.println("branşı : "+this.branch);
        System.out.println("tel no : "+this.mpno);
    }
}
