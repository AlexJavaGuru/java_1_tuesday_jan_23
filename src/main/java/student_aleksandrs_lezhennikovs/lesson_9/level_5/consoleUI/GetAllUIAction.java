package student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.domain.BookEntity;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.GetAllService;

import java.util.List;

public class GetAllUIAction implements UIActions{
    private GetAllService getAllService;
    private UtilitiesUI utilitiesUI = new UtilitiesUI();

    public GetAllUIAction(GetAllService getAllService) {
        this.getAllService = getAllService;
    }

    @Override
    public void execute() {
        utilitiesUI.printBookListFullInfo(getAllService.getAllBooks());
    }
}
