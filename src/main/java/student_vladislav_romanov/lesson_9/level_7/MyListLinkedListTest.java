package student_vladislav_romanov.lesson_9.level_7;

import student_vladislav_romanov.TestUtil;

public class MyListLinkedListTest extends TestUtil {


    public static void main(String[] args) {
        MyListLinkedListTest myListLinkedListTest = new MyListLinkedListTest();
        myListLinkedListTest.addElementTestSucceed();
        myListLinkedListTest.addElementTestFailed();
        myListLinkedListTest.removeElementTestSucceed();
        myListLinkedListTest.removeElementTestFailed();
        myListLinkedListTest.sortAscTestSucceed();
        myListLinkedListTest.sortAscTestFailed();
        myListLinkedListTest.sortDescTestSucceed();
        myListLinkedListTest.sortDescTestFailed();
        myListLinkedListTest.findTestSucceed();
        myListLinkedListTest.findTestFailed();
        myListLinkedListTest.printStat();
    }

    public void addElementTestSucceed() {
        MyList myList = new MyListLinkedListImpl();
        myList.addElement("Hello");
        String expected = "MyListLinkedListImpl{list=[Hello]}";
        String current = myList.toString();
        printResult(current.equals(expected), "addElementTestSucceed");
    }

    public void addElementTestFailed() {
        MyList myList = new MyListLinkedListImpl();
        myList.addElement("Hello");
        String expected = "MyListLinkedListImpl{list=[Java]}";
        String current = myList.toString();
        printResult(!current.equals(expected), "addElementTestFailed");
    }

    public void removeElementTestSucceed() {
        MyList myList = new MyListLinkedListImpl();
        myList.addElement("Hello");
        myList.addElement("Java");
        myList.addElement("World");
        myList.removeElement("Hello");
        String expected = "MyListLinkedListImpl{list=[Java, World]}";
        String current = myList.toString();
        printResult(current.equals(expected), "removeElementTestSucceed");
    }

    public void removeElementTestFailed() {
        MyList myList = new MyListLinkedListImpl();
        myList.addElement("Hello");
        myList.addElement("Java");
        myList.addElement("World");
        myList.removeElement("Hello");
        String expected = "MyListLinkedListImpl{list=[Hello, Java, World]}";
        String current = myList.toString();
        printResult(!current.equals(expected), "removeElementTestFailed");
    }

    public void sortAscTestSucceed() {
        MyList myList = new MyListLinkedListImpl();
        myList.addElement("World");
        myList.addElement("Java");
        myList.addElement("Hello");
        myList.sortAsc();
        String expected = "MyListLinkedListImpl{list=[Hello, Java, World]}";
        String current = myList.toString();
        printResult(current.equals(expected), "sortAscTestSucceed");
    }

    public void sortAscTestFailed() {
        MyList myList = new MyListLinkedListImpl();
        myList.addElement("World");
        myList.addElement("Java");
        myList.addElement("Hello");
        myList.sortAsc();
        String expected = "MyListLinkedListImpl{list=[Java, Hello, World]}";
        String current = myList.toString();
        printResult(!current.equals(expected), "sortAscTesFailed");
    }

    public void sortDescTestSucceed() {
        MyList myList = new MyListLinkedListImpl();
        myList.addElement("World");
        myList.addElement("Java");
        myList.addElement("Hello");
        myList.sortDesc();
        String expected = "MyListLinkedListImpl{list=[World, Java, Hello]}";
        String current = myList.toString();
        printResult(current.equals(expected), "sortDescTestSucceed");
    }

    public void sortDescTestFailed() {
        MyList myList = new MyListLinkedListImpl();
        myList.addElement("World");
        myList.addElement("Java");
        myList.addElement("Hello");
        myList.sortDesc();
        String expected = "MyListLinkedListImpl{list=[Java, Hello, World]}";
        String current = myList.toString();
        printResult(!current.equals(expected), "sortDescTesFailed");
    }

    public void findTestSucceed() {
        MyList myList = new MyListLinkedListImpl();
        myList.addElement("World");
        myList.addElement("Java");
        String expected = "";
        String current = myList.find("Hello");
        printResult(current.equals(expected), "findTestSucceed");
    }

    public void findTestFailed() {
        MyList myList = new MyListLinkedListImpl();
        myList.addElement("World");
        myList.addElement("Java");
        String expected = "Java";
        String current = myList.find("World");
        printResult(!current.equals(expected), "findTestFailed");
    }

}
