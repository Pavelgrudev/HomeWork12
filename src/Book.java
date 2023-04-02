public class Book {
   private  Author authorName;
   private String bookName;
   private int yearOfBook;

    public Book(String bookName, Author authorName, int yearOfBook) {
        this.bookName = bookName;
        this.yearOfBook = yearOfBook;
        this.authorName=authorName;
    }

    public String getbookName() {
        return bookName;
    }
    public int getYearOfBook() {
        return yearOfBook;}
        public Author getAuthorName(){
            return authorName;
        }
    public void setAge1(int yearOfBook){
        this.yearOfBook=yearOfBook;
    }


}