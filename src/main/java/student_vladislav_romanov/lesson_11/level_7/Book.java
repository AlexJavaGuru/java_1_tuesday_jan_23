package student_vladislav_romanov.lesson_11.level_7;

class Book {

    private final String title;
    private final String author;
    private final String publisher; // Optional field
    private final int publishingYear; // Optional field
    private final String language; // Optional field
    private final int paperback; // Optional field
    private final String isbn; // Optional field
    private boolean read;

    public Book(BookBuilder bookBuilder) {
        title = bookBuilder.title;
        author = bookBuilder.author;
        publisher = bookBuilder.publisher;
        publishingYear = bookBuilder.publishingYear;
        language = bookBuilder.language;
        paperback = bookBuilder.paperback;
        isbn = bookBuilder.isbn;
        read = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getLanguage() {
        return language;
    }

    public int getPaperback() {
        return paperback;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isRead() {
        return read;
    }

    public static class BookBuilder {

        private String title;
        private String author;
        private String publisher;
        private int publishingYear;
        private String language;
        private int paperback;
        private String isbn;
        private boolean read;

        public BookBuilder(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public BookBuilder setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public BookBuilder setPublishingYear(int publishingYear) {
            this.publishingYear = publishingYear;
            return this;
        }

        public BookBuilder setLanguage(String language) {
            this.language = language;
            return this;
        }

        public BookBuilder setPaperback(int paperback) {
            this.paperback = paperback;
            return this;
        }

        public BookBuilder setIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public BookBuilder setRead(boolean read) {
            this.read = read;
            return this;
        }

        //Build the Employee object
        public Book build() {
            return new Book(this);
        }

    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishingYear=" + publishingYear +
                ", language='" + language + '\'' +
                ", paperback=" + paperback +
                ", isbn='" + isbn + '\'' +
                ", read='" + read + '\'' +
                '}';
    }

}
