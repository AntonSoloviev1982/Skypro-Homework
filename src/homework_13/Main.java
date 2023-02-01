package homework_13;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Фёдор", "Достоевский");
        Author author2 = new Author("Анджей", "Сапковский");

        Book book1 = new Book("Бесы", author1, 1871);
        Book book2 = new Book("Ведьмак", author2, 1986);

        book2.setPublishingYear(1993);

        System.out.println("Автор - " + book1.getAuthor() + ", название книги - "
                + book1.getName() + ", год выпуска - " + book1.getPublishingYear());

        System.out.println("Автор - " + book2.getAuthor() + ", название книги - "
                + book2.getName() + ", год выпуска - " + book2.getPublishingYear());

    }
}
