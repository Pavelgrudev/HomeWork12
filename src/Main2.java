public class Main2 {
    public static void main2(String[] args) {

        Book book = new Book("Vasya", 1995);
        Book book2 = new Book("Petya", 2001);
        book.setAge1(1998);
        System.out.println(book.getAge1());

    }
}
