package student_vladislav_romanov.lesson_9.level_7;

public class MyListDemo {

    public static void main(String[] args) {
        MyList myList = new MyListImpl();

        myList.addElement("Hello");
        myList.addElement("Java");
        myList.addElement("World");
        System.out.println(myList);
        myList.removeElement("Java");
        myList.addElement("Global");
        myList.addElement("Any");
        System.out.println(myList);
        myList.sortAsc();
        System.out.println(myList);
        myList.sortDesc();
        System.out.println(myList);
        System.out.println(myList.find("Java"));
        System.out.println(myList.find("Global"));
    }

}
