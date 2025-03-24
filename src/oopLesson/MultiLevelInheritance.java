package oopLesson;
class A {
    protected Integer id;
}
class B extends A{}
class C extends B {}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.id=2;
        b.id=3;
        c.id=8;
    }
}
