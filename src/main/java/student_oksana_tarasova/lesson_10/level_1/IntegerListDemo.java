package student_oksana_tarasova.lesson_10.level_1;

import java.util.*;

class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> listInt = new LinkedList();

        listInt.add(2);
        listInt.add(4);
        listInt.add(6);

        System.out.println(listInt.toString());

        listInt.add(0, 10);
        System.out.println(listInt.toString());
        System.out.println(listInt.size());

        listInt.add(4, 10);
        System.out.println(listInt.toString());
        System.out.println(listInt.size());

        listInt.remove(3);
        System.out.println(listInt.toString());
        System.out.println(listInt.size());

        System.out.println(listInt.isEmpty());

        for (Object s : listInt) {
            System.out.println("element of list: " + s);

        }

        listInt.toString();
    }

}

/*

    static abstract class IntegerList<T> implements List<Integer> {
        private IntegerList() {
        }

        @Override
        public boolean equals(Object obj) {
            return obj == this || obj != null && obj.getClass() == this.getClass();
        }

        @Override
        public int hashCode() {
            return 1;
        }

        @Override
        public String toString() {
            return "IntegerList[]";
        }
    }

    список целых
    чисел .

    Продемонстрируйте как:
            -
    добавить в

    список элемент(в начало и в конец)
-
    узнать длину
    списка
-
    удалить элемент

    из списка(по интексу и без)
-
    узнать пустой
    список или
    нет
-
    обойти список
    и вывести
    на консоль
    каждый элемент.


    {
        @Override
        public int size () {
        return 0;
    }

        @Override
        public boolean isEmpty () {
        return false;
    }

        @Override
        public boolean contains (Object o){
        return false;
    }

        @Override
        public Iterator<Integer> iterator () {
        return null;
    }

        @Override
        public Object[] toArray () {
        return new Object[0];
    }

        @Override
        public <T > T[]toArray(T[]a){
        return null;
    }

        @Override
        public boolean add (Integer integer){
        return false;
    }

        @Override
        public boolean remove (Object o){
        return false;
    }

        @Override
        public boolean containsAll (Collection < ? > c){
        return false;
    }

        @Override
        public boolean addAll (Collection < ? extends Integer > c){
        return false;
    }

        @Override
        public boolean addAll ( int index, Collection<? extends Integer > c){
        return false;
    }

        @Override
        public boolean removeAll (Collection < ? > c){
        return false;
    }

        @Override
        public boolean retainAll (Collection < ? > c){
        return false;
    }

        @Override
        public void clear () {

    }

        @Override
        public Integer get ( int index){
        return null;
    }

        @Override
        public Integer set ( int index, Integer element){
        return null;
    }

        @Override
        public void add ( int index, Integer element){

    }

        @Override
        public Integer remove ( int index){
        return null;
    }

        @Override
        public int indexOf (Object o){
        return 0;
    }

        @Override
        public int lastIndexOf (Object o){
        return 0;
    }

        @Override
        public ListIterator<Integer> listIterator () {
        return null;
    }

        @Override
        public ListIterator<Integer> listIterator ( int index){
        return null;
    }

        @Override
        public List<Integer> subList ( int fromIndex, int toIndex){
        return null;
    }
 */
