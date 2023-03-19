package student_vladislav_romanov.lesson_9.level_1;

interface MyList {

    // Creating new List
    int[] create();

    // Add new element to List
    void addElementToList(int[] list, int number);

    // Remove element from List by content int
    void removeElementFromList(int[] list, int number);

    // Sorting List ASC, return sorted List
    int[] sortingNewListAsc(int[] list);

    // Sorting List DESC, return sorted List
    int[] sortingNewListDesc(int[] list);

    // Find element, return element if existed, else null
    int find(int number);
}
