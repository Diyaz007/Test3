public class Artistic extends Book{
    private static int counter = 1;

    public Artistic() {
    }

    public Artistic(String autor, String bookName, int bookYear) {
        super(autor, bookName, bookYear);
        setId(counter++);
    }
}
