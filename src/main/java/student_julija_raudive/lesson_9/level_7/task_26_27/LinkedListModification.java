package student_julija_raudive.lesson_9.level_7.task_26_27;

import java.util.LinkedList;

class LinkedListModification implements MyList {


    LinkedList list = new LinkedList();

    @Override
    public int[] increaseArraySize(int[] array) {
        return new int[array.length + 1];
    }

    @Override
    public int[] removeValueFromArrayAndReduceArraySize(int[] array, int valueToDelete) {
        list.clear();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(valueToDelete)) {
                list.remove(i);
            }
        }
        int newSize = list.size();
        int[] newArray = new int[newSize];
        for (int i=0; i<newArray.length; i++){
            newArray[i] = (int) list.get(i);
        }
        return newArray;
    }

    @Override
    public int[] addValueToArray(int[] array, int value) {
        int[] newArray = increaseArraySize(array);
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
       }
        list.add(value);
        for (int i=0; i<newArray.length; i++){
            newArray[i] = (int) list.get(i);
        }
        return newArray;
    }
}
