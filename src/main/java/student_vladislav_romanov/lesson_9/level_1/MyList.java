package student_vladislav_romanov.lesson_9.level_1;

interface MyList {

    // Creating new List
    NewList create();

    // Add new element to List
    void addElementToList(NewList list);

    // Remove element from NewList by content String
    void removeElementFromList(NewList list, String content);

    // Remove element from NewList by content int
    void removeElementFromList(NewList list, int content);

    // Sorting NewList ASC
    NewList sortingNewListAsc(NewList list);

    // Sorting NewList DESC
    NewList sortingNewListDesc(NewList list);

    // Find element
}
