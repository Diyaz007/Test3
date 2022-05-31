public class Book {
    private int id;
    private String autor;
    private String bookName;
    private int bookYear;

    public Book(){}

    public Book( String autor, String bookName, int bookYear) {
        this.autor = autor;
        this.bookName = bookName;
        this.bookYear = bookYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        autor = autor;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    @Override
    public String toString() {
        return "-------------------"+
                "\nID = " + getId() +
                "\nАвтор = " + getAutor() +
                "\nНазвание = " + getBookName() +
                "\nГод = " + getBookYear();
    }
}
