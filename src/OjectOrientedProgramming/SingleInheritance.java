package OjectOrientedProgramming;
class Parent {
    protected Integer id;
    protected String name;
    protected Integer age;
    public Parent(){}
    public Parent(Integer id, String name, Integer age){
        this.id=id;
        this.age=age;
        this.name=name;
    }
}
class Son extends Parent{
    public String CreditCard;
}
public class SingleInheritance {
    public static void main(String[] args) {
        Parent son = new Son(); // upper casting
        Son son1 = new Son(); // down casting
        son.name="Soy";
        System.out.println("Son's Name is:  " + son.name);
        son1.CreditCard = "aa001";
    }
}
