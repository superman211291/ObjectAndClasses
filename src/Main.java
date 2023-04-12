public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Джоан", "Роулинг");
        Author author2 = new Author("Стивен","Кинг");
        Book book1 = new Book("Гарри поттер и узник Азкабана",author1,2019);
        Book book2 = new Book("Зелёная миля",author2,2014);
        book1.setYearOfRelease(2020);
    }
}