package student_oksana_maksimova.lesson_3.level_7;

class Book {
    String name;
    String author;
    int pages;

     Book(String bookName, String authorName, int howManyPages ) {
        name = bookName;
        author = authorName;
        pages = howManyPages;
    }

     void name(){
         System.out.println("Book name - " + name);
    }

     void author() {

         System.out.println("written by - " + author);
    }

     void pages() {

         System.out.println("have - " + pages + " pages.");
    }
}
