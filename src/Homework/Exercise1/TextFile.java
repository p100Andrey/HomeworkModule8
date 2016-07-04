package Homework.Exercise1;


public class TextFile extends File {

    private String book;

    public TextFile(String textFile) {
        super(textFile);
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public void numberOfPages() {
        System.out.println(getName() + " - number Of pages");
    }

    @Override
    public String toString() {
        return getName() + ", book: " + book;
    }
}