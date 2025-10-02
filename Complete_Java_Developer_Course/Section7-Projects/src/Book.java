public class Book {

    private final String author;
    private final String title;
    private final String genre;
    private final int numPages;

    public Book(String author, String title, String genre, int numPages) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.numPages = numPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumPages() {
        return numPages;
    }

    public void printBookDetails() {
        System.out.println(title);
        System.out.println("by " + author);
        System.out.println("has " + numPages + " pages, and its genre is " + genre);
        System.out.println();
    }
}
