package student_aleksandrs_lezhennikovs.lesson_9.level_7.task_27;

import java.util.*;

class MyListBasedOnLinkedLinkedLIst implements MyLinkedLIst {

    private LinkedList<Orders> storage = new LinkedList<>();
    private long orderId = 10L;

    public LinkedList<Orders> getStorage() {
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
            Orders order = searchByTitleOpt(title).get();
            storage.remove(order);
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
    public Orders searchByTitle(String title) {
        return searchByTitleOpt(title).get();
    }

    private Optional<Orders> searchByTitleOpt(String title) {
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
}
