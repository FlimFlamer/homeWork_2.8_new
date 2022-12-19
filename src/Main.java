public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Автор", "Первый");
        Author author2 = new Author("Автор", "Второй");
        Book book1 = new Book(author1, "Война миров Том 1", 1907);
        Book book2 = new Book(author2, "Война миров Том 2", 1912);

        book1.setYearPublishing(1902);
        book2.setYearPublishing(1907);

        String title1 = book1.getBookName() + " " + book1.getYearPublishing();
        String title2 = book2.getBookName() + " " + book2.getYearPublishing();
        String authorName1 = book1.getAuthor().getAuthorName() + " " + book1.getAuthor().getAuthorFamily();
        String authorName2 = book2.getAuthor().getAuthorName() + " " + book2.getAuthor().getAuthorFamily();

        System.out.println(authorName1 + " " + title1);
        System.out.println(authorName2 + " " + title2);
    }
}