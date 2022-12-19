public class Author {
    private static String authorName;
    private static String authorFamily;

    public Author(String authorName, String authorFamily) {
        this.authorName = authorName;
        this.authorFamily = authorFamily;
    }

    public static String getAuthorName() {
        return authorName;
    }

    public static String getAuthorFamily() {
        return authorFamily;
    }


}
