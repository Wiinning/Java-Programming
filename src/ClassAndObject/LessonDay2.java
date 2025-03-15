package ClassAndObject;

   class Book {
     Integer id;
     String title;
     // Default Constructor
       Book(){
           System.out.println("Default Constructor is called!");
       }
       Book(Integer id, String title){
           this.id = id;
           this.title=title;
       }

       @Override
       public String toString() {
           return "Book{" +
                   "id=" + id +
                   ", title='" + title + '\'' +
                   '}';
       }
   }
   public class LessonDay2{
   public static void main(String[] args) {
        Book book = new Book(1,"Godzilla");
       System.out.println(book);
       Book book1 = new Book();
       System.out.println(book1);
    }
}
