package student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.GetReadBooksService;

public class GetReadBooksUIAction implements UIActions {
    private GetReadBooksService getReadBooksService;
    private UtilitiesUI utilitiesUI = new UtilitiesUI();

    public GetReadBooksUIAction(GetReadBooksService getReadBooksService) {
        this.getReadBooksService = getReadBooksService;
    }

    @Override
    public void execute() {
        System.out.println("List of Read books:");
        utilitiesUI.printBookList(getReadBooksService.returnReadBooks());
    }
}
