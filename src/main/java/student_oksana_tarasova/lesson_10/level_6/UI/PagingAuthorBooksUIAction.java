package student_oksana_tarasova.lesson_10.level_6.UI;

import student_oksana_tarasova.lesson_10.level_2.Book;
import student_oksana_tarasova.lesson_10.level_2.BookDatabase;
import student_oksana_tarasova.lesson_10.level_7.PagingListBook;


import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class PagingAuthorBooksUIAction implements UIAction {


    BookDatabase bookDatabase;
    int pagingList;


    public PagingAuthorBooksUIAction(BookDatabase bookDatabase, int pagingList) {
        this.bookDatabase = bookDatabase;
        this.pagingList = pagingList;

    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the author of the books you are interested in");
        String author = scanner.nextLine();
        List<Book> books = bookDatabase.findByAuthor(author);
        PagingListBook pagingListBook1 = new PagingListBook(books, pagingList);
        Map<Integer, List<Book>> page = pagingListBook1.paging();
        System.out.println(page.get(1).toString());
        while (true) {
            System.out.println("If you want to continue browsing, enter consecutive page numbers from 2, 3, etc., if not = enter 0");
            int select = Integer.parseInt(scanner.next());
            if (select == 0) {
                break;
            } else if (select >= page.size()) {
                System.out.println(page.get(select));
                System.out.println("There are no more books matching this search.");
                break;
            } else {
                System.out.println(page.get(select));
            }
        }
    }
}
