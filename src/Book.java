import java.util.Objects;

public class Book {
    private String bookTitle;
    private Author nameOfAuthor;
    private int publicationYear;

    public Book(String bookTitle, Author nameOfAuthor, int publicationYear) {
        this.bookTitle = bookTitle;
        this.nameOfAuthor = nameOfAuthor;
        this.publicationYear = publicationYear;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public Author getNameOfAuthor() {
        return this.nameOfAuthor;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(nameOfAuthor, book.nameOfAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, nameOfAuthor, publicationYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", nameOfAuthor=" + nameOfAuthor +
                ", publicationYear=" + publicationYear +
                '}';
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;

    }
}
