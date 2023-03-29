package student_andrejs_cekalins.lesson_9.level_1.Task_3;


interface MyList {

   void addUser(String name);
    // Add Name to list;
    void removeUser(String name);
    // Delete Name from the list;
    void sortUsers();
    // Sort list with users;
    String containsUser(String name);
    // Search does user exist in the list;
}
