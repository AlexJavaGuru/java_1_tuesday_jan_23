package student_vladislav_romanov.lesson_9.level_7;

interface MyList {

    // Add new element to List
    void addElement(String text);

    // Remove element from List by content int
    void removeElement(String text);

    // Sorting List ASC, return sorted List
    void sortAsc();

    // Sorting List DESC, return sorted List
    void sortDesc();

    // Find element, return element if existed, else null
    String find(String text);

}
