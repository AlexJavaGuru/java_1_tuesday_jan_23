package student_aleksandrs_lezhennikovs.lesson_10.level_2.consolu_ui;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services.GetBooksByAuthorsService;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;

import java.util.List;
import java.util.Map;

public class GetBooksByAuthorsUIAction implements UIAction {
    private GetBooksByAuthorsService getBooksByAuthorsService;

    public GetBooksByAuthorsUIAction(GetBooksByAuthorsService getBooksByAuthorsService) {
        this.getBooksByAuthorsService = getBooksByAuthorsService;
    }


    @Override
    public void execute() {
        System.out.println("Map of Author and Books:");
        printHashMap(getBooksByAuthorsService.execute());
    }

    private void printHashMap(Map<String, List<Book>> resultMap) {
        for (String author : resultMap.keySet()) {
                System.out.println("Author: " + author);
                printToSpecialFormat(resultMap.get(author));
                System.out.println();
        }
    }

    private void printToSpecialFormat(List<Book> list) {
        for (Book book : list) {
            System.out.println(book);
        }
    }
}
