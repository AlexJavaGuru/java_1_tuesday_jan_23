package student_andrejs_cekalins.lesson_9.level_7.Task_26;


class MyListTest {
    public static void main(String[] args) {
        MyListTest test = new MyListTest();
        test.checkAddUser();
        test.checkNotAddUser();
        test.checkRemovedUser();
        test.checkNotRemovedUser();
        test.checkSortUsers();
        test.checkNotSortUsers();
        test.checkContainsUser();
        test.checkNotContainsUser();
    }

    public void checkAddUser() {
        MyList myList = new MyListImp();
        myList.addUser("Andrej");
        String expectedResult = "MyListImpl{[Andrej]}";
        String realResult = myList.toString();
        if (expectedResult.equals(realResult)) {
            System.out.println("Add user test Passed");
        }
    }

    public void checkNotAddUser() {
        MyList myList = new MyListImp();
        myList.addUser("Andrej");
        String expectedResult = "MyListImpl{[Vadim]}";
        String realResult = myList.toString();
        if (!expectedResult.equals(realResult)) {
            System.out.println("Not add user test Passed");
        }
    }

    public void checkRemovedUser() {
        MyList myList = new MyListImp();
        myList.addUser("Andrej");
        myList.addUser("Vadim");
        myList.removeUser("Andrej");
        String expectedResult = "MyListImpl{[Vadim]}";
        String realResult = myList.toString();
        if (expectedResult.equals(realResult)) {
            System.out.println("Remove user test Passed");
        }
    }

    public void checkNotRemovedUser() {
        MyList myList = new MyListImp();
        myList.addUser("Andrej");
        myList.addUser("Vadim");
        myList.removeUser("Andrej");
        String expectedResult = "MyListImpl{[Andrej]}";
        String realResult = myList.toString();
        if (!expectedResult.equals(realResult)) {
            System.out.println("Not remove user test Passed");
        }
    }

    public void checkSortUsers() {
        MyList myList = new MyListImp();
        myList.addUser("Andrej");
        myList.addUser("Vadim");
        myList.addUser("Dmitrij");
        myList.sortUsers();
        String expectedResult = "MyListImpl{[Andrej, Dmitrij, Vadim]}";
        String realResult = myList.toString();
        if (expectedResult.equals(realResult)) {
            System.out.println("Sort users test Passed");
        }
    }

    public void checkNotSortUsers() {
        MyList myList = new MyListImp();
        myList.addUser("Andrej");
        myList.addUser("Vadim");
        myList.addUser("Dmitrij");
        myList.sortUsers();
        String expectedResult = "MyListImpl{[Andrej, Vadim, Dmitrij]}";
        String realResult = myList.toString();
        if (!expectedResult.equals(realResult)) {
            System.out.println("Not sort users test Passed");
        }
    }

    public void checkContainsUser() {
        MyList myList = new MyListImp();
        myList.addUser("Andrej");
        myList.addUser("Vadim");
        myList.addUser("Dmitrij");
        myList.containsUser("Andrej");
        String expectedResult = "Andrej";
        String realResult = myList.containsUser("Andrej");
        if (expectedResult.equals(realResult)) {
            System.out.println("Contains user test Passed");
        }
    }

    public void checkNotContainsUser() {
        MyList myList = new MyListImp();
        myList.addUser("Andrej");
        myList.addUser("Vadim");
        myList.addUser("Dmitrij");
        myList.containsUser("Andrej");
        String expectedResult = "Vadim";
        String realResult = myList.containsUser("Andrej");
        if (!expectedResult.equals(realResult)) {
            System.out.println("Not contains user test Passed");
        }
    }
}
