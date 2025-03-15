package ClassAndObject;
class Book1 {
    private Integer id;
    private String title;

    // constructor
    public Book1() {
    }

    public Book1(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
public class GetterSetter {
    public static void main(String[] args) {
        Book1 book = new Book1(1,"Nezha");
        System.out.println("Value of object 1 is " + book);
        Book1 book1 = new Book1();
        book1.setId(16);
        System.out.println("Book 1 ID is: " + book1.getId());
    }
}



