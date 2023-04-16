package student_vladislav_romanov.lesson_9.level_7;

import student_vladislav_romanov.TestUtil;

class MyListTest extends TestUtil {

    public static void main(String[] args) {
        MyListTest myListTest = new MyListTest();
        myListTest.addElementTestSucceed();
        myListTest.addElementTestFailed();
        myListTest.removeElementTestSucceed();
        myListTest.removeElementTestFailed();
        myListTest.sortAscTestSucceed();
        myListTest.sortAscTestFailed();
        myListTest.sortDescTestSucceed();
        myListTest.sortDescTestFailed();
        myListTest.findTestSucceed();
        myListTest.findTestFailed();
        myListTest.printStat();
    }

    public void addElementTestSucceed() {
        MyList myList = new MyListImpl();
        myList.addElement("Hello");
        String expected = "MyListImpl{list=[Hello]}";
        String current = myList.toString();
        printResult(current.equals(expected), "addElementTestSucceed");
    }

    public void addElementTestFailed() {
        MyList myList = new MyListImpl();
        myList.addElement("Hello");
        String expected = "MyListImpl{list=[Java]}";
        String current = myList.toString();
        printResult(!current.equals(expected), "addElementTestFailed");
    }

    public void removeElementTestSucceed() {
        MyList myList = new MyListImpl();
        myList.addElement("Hello");
        myList.addElement("Java");
        myList.addElement("World");
        myList.removeElement("Hello");
        String expected = "MyListImpl{list=[Java, World]}";
        String current = myList.toString();
        printResult(current.equals(expected), "removeElementTestSucceed");
    }

    public void removeElementTestFailed() {
        MyList myList = new MyListImpl();
        myList.addElement("Hello");
        myList.addElement("Java");
        myList.addElement("World");
        myList.removeElement("Hello");
        String expected = "MyListImpl{list=[Hello, Java, World]}";
        String current = myList.toString();
        printResult(!current.equals(expected), "removeElementTestFailed");
    }

    public void sortAscTestSucceed() {
        MyList myList = new MyListImpl();
        myList.addElement("World");
        myList.addElement("Java");
        myList.addElement("Hello");
        myList.sortAsc();
        String expected = "MyListImpl{list=[Hello, Java, World]}";
        String current = myList.toString();
        printResult(current.equals(expected), "sortAscTestSucceed");
    }

    public void sortAscTestFailed() {
        MyList myList = new MyListImpl();
        myList.addElement("World");
        myList.addElement("Java");
        myList.addElement("Hello");
        myList.sortAsc();
        String expected = "MyListImpl{list=[Java, Hello, World]}";
        String current = myList.toString();
        printResult(!current.equals(expected), "sortAscTesFailed");
    }

    public void sortDescTestSucceed() {
        MyList myList = new MyListImpl();
        myList.addElement("World");
        myList.addElement("Java");
        myList.addElement("Hello");
        myList.sortDesc();
        String expected = "MyListImpl{list=[World, Java, Hello]}";
        String current = myList.toString();
        printResult(current.equals(expected), "sortDescTestSucceed");
    }

    public void sortDescTestFailed() {
        MyList myList = new MyListImpl();
        myList.addElement("World");
        myList.addElement("Java");
        myList.addElement("Hello");
        myList.sortDesc();
        String expected = "MyListImpl{list=[Java, Hello, World]}";
        String current = myList.toString();
        printResult(!current.equals(expected), "sortDescTesFailed");
    }

    public void findTestSucceed() {
        MyList myList = new MyListImpl();
        myList.addElement("World");
        myList.addElement("Java");
        String expected = "";
        String current = myList.find("Hello");
        printResult(current.equals(expected), "findTestSucceed");
    }

    public void findTestFailed() {
        MyList myList = new MyListImpl();
        myList.addElement("World");
        myList.addElement("Java");
        String expected = "Java";
        String current = myList.find("World");
        printResult(!current.equals(expected), "findTestFailed");
    }

}
