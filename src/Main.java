

import java.sql.SQLOutput;

public class Main  {
    public static void main(String[] args) {
        Author surName = new Author();
        Book warAndPeace = new Book(  " War And Peace" ,1867);
        System.out.println("Книга называется  " +warAndPeace.getName1()+ " написал " + surName.name2+ " в "  +warAndPeace.getAge1()+  " году.");
        System.out.println( "написал "  +  surName.getName2());
        System.out.println("warAndPeace.name1  = " + warAndPeace.getName1());
        System.out.println("warAndPeace.age1 =  "  + warAndPeace.getAge1());
        warAndPeace.setAge1(2000);
        System.out.println("warAndPeace.getAge1 = " + warAndPeace.getAge1());
        Book book = new Book("название книги book написал Vasya",1995);
        Book book2 = new Book("Petya", 2001);
        System.out.println("название книги book, написал Vasya в 1995 году");
        System.out.println("название книги book2  написал  Petya в 2001 году");
        book.setAge1(1998);
        System.out.println("Вася написал книгу в " +book.getAge1()+ " году");
    }
}











