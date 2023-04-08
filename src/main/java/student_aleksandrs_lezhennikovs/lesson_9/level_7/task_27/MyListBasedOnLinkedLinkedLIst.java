package student_aleksandrs_lezhennikovs.lesson_9.level_7.task_27;

import java.util.*;

class MyListBasedOnLinkedLinkedLIst implements MyLinkedLIst {

    private List<Orders> storage = new LinkedList<>();
    private long orderId = 10L;

    public List<Orders> getStorage() {
        return storage;
    }

    @Override
    public void add(Orders order) {
        order.setOrderId(orderId);
        orderId++;
        storage.add(order);
    }

    @Override
    public void deleteByTitle(String title) {
        Optional<Orders> orderOpt = searchByTitle(title);
        if (orderOpt.isPresent()) {
            storage.remove(orderOpt.get());
        }
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
    public List<Orders> printAll() {
        return storage;
    }

    @Override
    public Optional<Orders> searchByTitle(String title) {
        for (Orders order : storage) {
            if (order.getTitle().equals(title)) {
                return Optional.of(order);
            }
        }
        return Optional.empty();
    }
}
