package student_andrejs_cekalins.lesson_9.level_1.Task_3;

interface MyList {
    int[] createMyListArray(int arrayLength);
    String sortUsersByName();
    // Sort list by users first letter of Names;
    String sortUsersBySurname();
    // Sort list by users first letter of Surnames;

    int getUserById();
    // Return user by id number;

    void deleteUser();
    // Delete user from the list;

    void addUser();
    // Add user to the list;
    void editUser();
    // Edit user in the list;



}
