package student_aleksandrs_lezhennikovs.lesson_10.level_2.consolu_ui;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services.GetAllBooksService;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;

import java.util.List;

public class GetAllBookUIAction implements UIAction {
    private GetAllBooksService getAllBooksService;

    public GetAllBookUIAction(GetAllBooksService getAllBooksService) {
        this.getAllBooksService = getAllBooksService;
    }

    @Override
    public void execute() {
        printToSpecialFormat(getAllBooksService.execute());
    }
    private void printToSpecialFormat(List<Book> list) {
        for (Book book : list) {
            System.out.println(book);
        }
    }
}
