package student_daniels_belejuns.lesson_9.level_1.task_3;

interface MyList {
    int[] create();

    void addElementToList(int[] list, int number);

    void removeElementFromList(int[] list, int number);

    int[] sortingNewListAsc(int[] list);

    int[] sortingNewListDesc(int[] list);

    int find(int number);
}

