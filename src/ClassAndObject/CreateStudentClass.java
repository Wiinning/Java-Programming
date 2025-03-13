package ClassAndObject;

import ClassAndObject.model.Student;

public class CreateStudentClass {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentInfo(1,"Winning", "Winning@gmail.com");
        Student student2 = new Student();
        student2.setStudentInfo(2, "Mak Chou", "Chou@gmail.com");
        student1.getStudentInfo();
        student2.getStudentInfo();

    }
}
