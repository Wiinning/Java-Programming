package OjectOrientedProgramming;

class Person{
    Integer id;
    String email;
    String name;
}
class Teacher extends Person{ }
class Student extends Person {
    String studentCardNumber;
}

public class OOP {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.id = 205;
        Student student = new Student();
        student.studentCardNumber="a01";
    }
}
