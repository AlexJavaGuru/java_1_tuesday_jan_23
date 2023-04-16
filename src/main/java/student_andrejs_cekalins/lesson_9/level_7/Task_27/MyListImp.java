package student_andrejs_cekalins.lesson_9.level_7.Task_27;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MyListImp implements MyList {
    private List<String> myList = new ArrayList<>();

    @Override
    public void addUser(String name) {
        myList.add(name);
    }

    @Override
    public void removeUser(String name) {
        myList.remove(name);
    }

    @Override
    public void sortUsers() {
        myList.sort(Comparator.naturalOrder());
    }

    @Override
    public String containsUser(String name) {
        if (myList.contains(name)) {
            return name;
        }
        return " Name not exist! ";
    }
    @Override
    public String toString() {
        return "MyListImpl{" + myList + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyListImp that = (MyListImp) o;
        return myList.equals(that.myList);
    }
}

