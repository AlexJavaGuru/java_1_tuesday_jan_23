package student_vladislav_romanov.lesson_9.level_7;

import java.util.Arrays;

class MyListImpl implements MyList {

    private String[] list = new String[0];

    @Override
    public void addElement(String text) {
        String[] tempList = copyListContentFromOrigin();
        tempList[list.length] = text;
        list = tempList;
    }

    @Override
    public void removeElement(String text) {
        String[] tempList = new String[list.length - 1];
        int i = 0;
        for (String element : list) {
            if (!element.equals(text)) {
                tempList[i] = element;
                i++;
            }
        }
        list = tempList;
    }

    @Override
    public void sortAsc() {
        Arrays.sort(list);
    }

    @Override
    public void sortDesc() {
        String[] tempList = new String[list.length];
        Arrays.sort(list);

        int i = list.length - 1;
        for (String element : list) {
            tempList[i] = element;
            i--;
        }

        list = tempList;
    }

    @Override
    public String find(String text) {
        for (String element : list) {
            if (text.equals(element)) {
                return element;
            }
        }
        return "";
    }

    String[] copyListContentFromOrigin() {
        String[] tempList = new String[list.length + 1];

        int i = 0;
        for (String element : list) {
            tempList[i] = element;
            i++;
        }

        return tempList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyListImpl myList = (MyListImpl) o;
        return Arrays.equals(list, myList.list);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(list);
    }

    @Override
    public String toString() {
        return "MyListImpl{" +
                "list=" + Arrays.toString(list) +
                '}';
    }
}
