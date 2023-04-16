package student_andrejs_cekalins.lesson_9.level_7.Task_26;


import java.util.Arrays;

class MyListImp implements MyList {
    private String[] arrayList = new String[0];

    @Override
    public void addUser(String name) {
        String[] newArray = new String[arrayList.length + 1];
        int i = 0;
        for (String newUser : arrayList) {
            newArray[i] = newUser;
            i++;
        }
        newArray[arrayList.length] = name;
        arrayList = newArray;
    }

    @Override
    public void removeUser(String name) {
        String[] newArray = new String[arrayList.length - 1];
        for (String deleteUser : arrayList) {
            int i = 0;
            if (!deleteUser.equals(name)) {
                newArray[i] = deleteUser;
            }
        }
        arrayList = newArray;
    }

    @Override
    public void sortUsers() {
        Arrays.sort(arrayList);
    }

    @Override
    public String containsUser(String name) {
        for (String searchName : arrayList) {
            if (name.equals(searchName)) {
                return searchName;
            }

        }
        return " Name not exist! ";
    }

    @Override
    public String toString() {
        return "MyListImpl{" + Arrays.toString(arrayList) + '}';
    }
}

