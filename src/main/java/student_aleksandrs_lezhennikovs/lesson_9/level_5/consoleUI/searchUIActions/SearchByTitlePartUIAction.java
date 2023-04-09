package student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI.searchUIActions;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI.UIActions;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI.UtilitiesUI;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.searchServices.SearchByTitlePartService;

import java.util.Scanner;

public class SearchByTitlePartUIAction implements UIActions {
    private SearchByTitlePartService searchByTitlePartService;
    private UtilitiesUI utilitiesUI = new UtilitiesUI();

    public SearchByTitlePartUIAction(SearchByTitlePartService searchByTitlePartService) {
        this.searchByTitlePartService = searchByTitlePartService;
    }

    @Override
    public void execute() {
        System.out.println("Input searching part of book title please:");
        Scanner input = new Scanner(System.in);
        String titlePart = input.nextLine();
        utilitiesUI.printBookList(searchByTitlePartService.searchByTitlePart(titlePart));
    }
}
