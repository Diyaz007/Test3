public class Legal extends Book {
    private static int counter = 1;

    public Legal() {
    }

    public Legal(String autor, String bookName, int bookYear) {
        super(autor, bookName, bookYear);
        setId(counter++);
    }
}


