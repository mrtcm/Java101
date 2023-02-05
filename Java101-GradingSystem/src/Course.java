import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.SplittableRandom;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix ;
    int note=0;
    int verbalGrade=0;


    Course(String name, String code, String  prefix, Teacher teacher){
        this.code = code;
        this.name = name;
        this.prefix=prefix;
        this.teacher = teacher;
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            System.out.println("kayıt başarılı ");
            teacher.printTeacherInfo();
        }
        else {
            System.out.println("hatalı giriş !");
        }
    }

}
