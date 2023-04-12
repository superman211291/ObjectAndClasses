import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int yearOfRelease;

    public Book(String name, Author author, int yearOfRelease) {
        this.name = name;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfRelease == book.yearOfRelease && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearOfRelease);
    }
}
