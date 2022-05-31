public class Technical extends Book {
    private static int counter = 1;

    public Technical() {
    }

    public Technical(String autor, String bookName, int bookYear) {
        super(autor, bookName, bookYear);
        setId(counter++);
    }
}
