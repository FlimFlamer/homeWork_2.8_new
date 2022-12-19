public class Book {
    private String bookName;
    private int yearPublishing;

    private Author author;

    public Book(Author author, String bookName, int yearPublishing) {
        this.author = author;
        this.bookName = bookName;
        this.yearPublishing = yearPublishing;
    }

    public String getBookName() {
        return bookName;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public Author getAuthor() {
        return author;
    }


}

