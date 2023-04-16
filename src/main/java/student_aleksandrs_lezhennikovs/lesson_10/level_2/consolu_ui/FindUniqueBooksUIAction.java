package student_aleksandrs_lezhennikovs.lesson_10.level_2.consolu_ui;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services.FindUniqueBooksService;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;

import java.util.Set;

public class FindUniqueBooksUIAction implements UIAction {
    private FindUniqueBooksService uniqueBooksService;

    public FindUniqueBooksUIAction(FindUniqueBooksService uniqueBooksService) {
        this.uniqueBooksService = uniqueBooksService;
    }


    @Override
    public void execute() {
        System.out.println("Unique Books set:");
        printToSpecialFormat(uniqueBooksService.execute());
    }

    private void printToSpecialFormat(Set<Book> booksSet) {
        for (Book book : booksSet) {
            System.out.println(book);
        }
    }
}
