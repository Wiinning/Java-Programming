package OjectOrientedProgramming;
class Parent1 {
    protected String name;
    protected Integer age;
    //
    public Parent1(){}
    public Parent1(String name){
        this.name = name;
    }
    public void run(){
        System.out.println(name + " is running");
    }
}
class Son1 extends Parent1{
    public Son1(String name){
        super(name);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Parent1 son = new Son1("Soy");
        son.run();
    }
}
