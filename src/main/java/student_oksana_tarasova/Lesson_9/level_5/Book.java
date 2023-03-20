package student_oksana_tarasova.Lesson_9.level_5;

class Book {
    String nameAuthor;
    String surnameAuthor;
    String title;

    public Book(String nameAuthor, String surnameAuthor, String title) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
        this.title = title;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getSurnameAuthor() {
        return surnameAuthor;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameAuthor='" + nameAuthor + '\'' +
                ", surnameAuthor='" + surnameAuthor + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
