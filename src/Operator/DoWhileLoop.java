package Operator;

public class DoWhileLoop {
    public static void main(String[] args) throws Exception {


        int i = 0;
        do {
            Thread.sleep(100);

            System.out.println("i value [ " + " ]");
            i++;
            if (i == 500) {
                break;
            }
        } while (i == 0);

        int number = 0;
        do{
            if (number == 10){
                continue;
            }
            System.out.println("Value of number : " + number);
            if (number == 20){
                break;
            }
        }while(number >0);
    }
}

