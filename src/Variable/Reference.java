package Variable;

// reference means memory address
    class User{
        public int id;
        public String name;
        public String email;

    }
    enum Status{
        FAILED,
        SUCCESS
    }
    public class Reference {
        public static void main(String[] args) {
        Status status = Status.SUCCESS;
        System.out.println(status);
        User user = new User();
        user.id = 12;
        user.name = "toto";
        user.email = "toto@gmail.com";
        System.out.print(user.name);
        }
    }


