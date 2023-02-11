package student_oksana_maksimova.lesson_3.level_7;

class Book {
    String name;
    String author;
    int pages;

    public Book(String bookName, String authorName, int howManyPages ) {
        name = bookName;
        author = authorName;
        pages = howManyPages;
    }

    public void name(){
        System.out.println("Book name - " + name);
    }

    public void author() {
        System.out.println("written by - " + author);
    }

    public void pages() {
        System.out.println("have - " + pages + " pages.");
    }
}
