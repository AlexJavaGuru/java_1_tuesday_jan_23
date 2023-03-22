package student_aleksandrs_lezhennikovs.lesson_9.level_7.task_27;



class MyLinkedListDemo {
    public static void main(String[] args) {
        MyLinkedLIst myLinkedLIst = new MyListBasedOnLinkedLinkedLIst();
        Orders firstOrder = new Orders("Milk package", Flow.FRESH, 5, 500);
        Orders secondOrder = new Orders("Milk", Flow.FRESH, 6, 700);
        Orders thirdOrder = new Orders("Apple", Flow.FRESH, 3, 100);
        myLinkedLIst.add(firstOrder);
        myLinkedLIst.add(secondOrder);
        myLinkedLIst.add(thirdOrder);
        System.out.println(myLinkedLIst);
        myLinkedLIst.sortByTitle();
        System.out.println(myLinkedLIst);
        myLinkedLIst.deleteByTitle("Apple");
        System.out.println(myLinkedLIst);
    }
}
