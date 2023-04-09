package student_aleksandrs_lezhennikovs.lesson_10.level_2.consolu_ui;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services.GetAuthorsBooksCountService;

import java.util.Map;

public class GetAuthorsBookCountUIAction implements UIAction {
    private GetAuthorsBooksCountService getAuthorsBooksCountService;

    public GetAuthorsBookCountUIAction(GetAuthorsBooksCountService getAuthorsBooksCountService) {
        this.getAuthorsBooksCountService = getAuthorsBooksCountService;
    }

    @Override
    public void execute() {
        System.out.println("Authors and Books count: ");
        printHashMap(getAuthorsBooksCountService.execute());
    }

    private void printHashMap(Map<String, Integer> resultMap) {
        for (String author : resultMap.keySet()) {
            System.out.println("Author: " + author + " Books count: " + resultMap.get(author));

        }
    }
}
