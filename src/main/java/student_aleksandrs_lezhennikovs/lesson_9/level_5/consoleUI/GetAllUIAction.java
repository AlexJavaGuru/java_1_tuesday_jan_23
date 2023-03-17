package student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.domain.BookEntity;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.GetAllService;

import java.util.List;

public class GetAllUIAction implements UIActions{
    private GetAllService getAllService;

    public GetAllUIAction(GetAllService getAllService) {
        this.getAllService = getAllService;
    }

    @Override
    public void execute() {
        System.out.println("List of Books:");
        printBookList(getAllService.getAllBooks());
    }

    private void printBookList(List<BookEntity> books) {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle() + " [" + books.get(i).getAuthor() + "]");
        }
    }
}
