import java.util.Objects;

public class Book {
    // Bei Eigenschaften vor Klasse jommt private (99%)

    //public, private, protected(eigene Datei, die im gleichen Ordner sind)
    private String cover;
    private String title;
    private String author;
    private int pageCount;
    private String isbn;
    private String publisher;
    private double price;

    //Konstruktor

    public Book() {

    }
    public Book(String cover, String title, String author, int pageCount, String isbn, String publisher, double price) {
        this.cover = cover;
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.isbn = isbn;
        this.publisher = publisher;
        this.price = price;
        System.out.println("Konstruktor");
    }


    //Methode machen, um private viriable zugreifen zu können
    public String getCover() {
        return cover;
    }
    public String getTitle() {

        return title;
    }
    public String getAuthor() {

        return author;
    }

    public String getIsbn(){
        return isbn;
    }
    // Wert zu ändern , setter ist meistens immer mit void
    public void setCover(String newCover) {
        this.cover = cover;
    }
// mit this kann man auf aktuelles objekt zugreifen
    public void setAuthor(String newAuthor) {
        this.author = author;
    }

    public void setTitle(String newTitle) {
        this.title = title;
    }

   /* public String toString() {
        return cover + " " + title + " " + pageCount + " ";
    } */


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pageCount == book.pageCount && Double.compare(book.price, price) == 0 && Objects.equals(cover, book.cover) && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(isbn, book.isbn) && Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cover, title, author, pageCount, isbn, publisher, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "cover='" + cover + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pageCount=" + pageCount +
                ", isbn='" + isbn + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }
}

// \ : option + shift + 7