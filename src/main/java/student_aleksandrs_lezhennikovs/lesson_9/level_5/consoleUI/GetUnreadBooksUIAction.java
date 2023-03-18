package student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.GetUnreadBooksService;

public class GetUnreadBooksUIAction implements UIActions {
    private GetUnreadBooksService getUnreadBooksService;
    private UtilitiesUI utilitiesUI = new UtilitiesUI();

    public GetUnreadBooksUIAction(GetUnreadBooksService getUnreadBooks) {
        this.getUnreadBooksService = getUnreadBooks;
    }

    @Override
    public void execute() {
        System.out.println("List of Unread books:");
        utilitiesUI.printBookList(getUnreadBooksService.returnUnreadBooks());
    }
}
