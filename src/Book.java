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
}
