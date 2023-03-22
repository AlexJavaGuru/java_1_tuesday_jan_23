package student_aleksandrs_lezhennikovs.lesson_9.level_7.task_27;

import java.util.*;

class MyListBasedOnLinkedLinkedLIst implements MyLinkedLIst {

    private LinkedList<Orders> storage = new LinkedList<>();
    private long orderId = 10L;

    @Override
    public void add(Orders order) {
        order.setOrderId(orderId);
        orderId++;
        storage.add(order);
    }

    @Override
    public void deleteByTitle(String title) {
            //Orders order = searchByTitle(title);
            //storage.remove(order);
            //storage.remove(order.getTitle().equals(title));

    }

    public void sortByTitle() {
        storage.sort(new Comparator<Orders>() {
            @Override
            public int compare(Orders firstOrder, Orders nextOrder) {
                return firstOrder.getTitle().compareTo(nextOrder.getTitle());
            }
        });
    }

    @Override
    public LinkedList<Orders> printAll() {
        return storage;
    }

    @Override
    public Optional<Orders> searchByTitle(String title) {
        for (Orders order : storage) {
            Optional<Orders> optOrder = Optional.ofNullable(order);
            if (optOrder.isPresent()) {
                if (optOrder.get().getTitle().equals(title)) {
                    return optOrder;
                }
            }
        }
        return Optional.empty();
    }

    @Override
    public String toString() {
        return "MyListBasedOnLinkedLinkedLIst{" +
                "storage=" + storage +
                '}';
    }
}
