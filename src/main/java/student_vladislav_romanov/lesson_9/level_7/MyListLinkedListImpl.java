package student_vladislav_romanov.lesson_9.level_7;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

class MyListLinkedListImpl implements MyList {

    private List<String> list = new LinkedList<>();

    @Override
    public void addElement(String text) {
        list.add(text);
    }

    @Override
    public void removeElement(String text) {
        list.remove(text);
    }

    @Override
    public void sortAsc() {
        list.sort(Comparator.naturalOrder());
    }

    @Override
    public void sortDesc() {
        list.sort(Comparator.reverseOrder());
    }

    @Override
    public String find(String text) {
        if (list.contains(text)) {
            return text;
        }
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyListLinkedListImpl that = (MyListLinkedListImpl) o;
        return list.equals(that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    @Override
    public String toString() {
        return "MyListLinkedListImpl{" +
                "list=" + list +
                '}';
    }
}
