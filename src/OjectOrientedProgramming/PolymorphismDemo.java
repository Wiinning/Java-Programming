package OjectOrientedProgramming;
class Service{
    public int sum(int a, int b){
        System.out.println("This is the sum in parent class");
        System.out.println("This is the result of parent class: " + (a+b));
        return a+b;
    }
}
class Service2 extends Service{
    @Override
    public int sum(int a, int b){
        System.out.println("This is the sum in child class");
        System.out.println("This is he result of sum " + (a+b));
        return a+b;
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Service service = new Service ();
        service.sum(1,2);
        System.out.println("-".repeat(20));
        Service2 service2 = new Service2();
        service2.sum(3,4);
    }
}
