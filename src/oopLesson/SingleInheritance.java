package oopLesson;
class Parent{
    protected Integer id;
    protected String name;
    protected Integer age;
    //
    Parent(){}
    public Parent(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
class Son extends Parent{
    public String creditCard;
}
public class SingleInheritance {
    public static void main(String[] args) {
        Son son = new Son(); // down casting
        son.creditCard = "aa";
        // or
        Parent son1 = new Son(); // upper casting
        son1.id= 12;
    }

}
