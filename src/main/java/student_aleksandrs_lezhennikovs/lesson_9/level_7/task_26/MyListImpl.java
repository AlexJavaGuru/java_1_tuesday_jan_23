package student_aleksandrs_lezhennikovs.lesson_9.level_7.task_26;

import java.util.Arrays;

class MyListImpl implements MyList {
    private long orderId = 10L;
    private Orders[] ordersRepository;

    public Orders[] getOrdersRepo() {
        return ordersRepository;
    }

    @Override
    public void add(Orders order) {
        if (isNullRepository(ordersRepository)) {
            ordersRepository = new Orders[1];
            incrementId(order);
            ordersRepository[0] = order;
        } else {
            extendOrdersRepository();
            incrementId(order);
            ordersRepository[ordersRepository.length - 1] = order;
        }

    }

    @Override
    public void deleteByTitle(String title) {
        int i, j;
        for (j = 0, i = 0; i < ordersRepository.length; i++) {
            if (!ordersRepository[i].getTitle().equals(title)) {
                ordersRepository[j++] = ordersRepository[i];
            }
        }
        ordersRepository = Arrays.copyOf(ordersRepository, j);
    }

    @Override
    public void sortByTitle() {
        Orders orderTemp;
        for (int i = 0; i < ordersRepository.length - 1; i++) {
            for (int j = i + 1; j < ordersRepository.length; j++) {
                if (ordersRepository[i].getTitle().compareTo(ordersRepository[j].getTitle()) > 0)  {
                    orderTemp = ordersRepository[i];
                    ordersRepository[i] = ordersRepository[j];
                    ordersRepository[j] = orderTemp;
                }
            }
        }
    }

    @Override
    public Orders[] printAll() {
        return ordersRepository;
    }

    @Override
    public Orders[] searchByTitle(String title) {
        int i, j;
        Orders[] resultArray = new Orders[ordersRepository.length];
        for (j = 0, i = 0; i < ordersRepository.length; i++) {
            if (ordersRepository[i].getTitle().equals(title)) {
                resultArray[j++] = ordersRepository[i];
            }
        }
        return Arrays.copyOf(resultArray, j);
    }

    @Override
    public String toString() {
        return "MyListImpl {" + "\n" +
                "ordersRepository=" + "\n" + Arrays.toString(ordersRepository) + "\n" +
                '}';
    }

    private void incrementId(Orders order) {
        order.setOrderId(orderId);
        orderId++;
    }

    private void extendOrdersRepository() {
        Orders[] newStorage = new Orders[ordersRepository.length + 1];
        for (int i = 0; i < ordersRepository.length; i++) {
            newStorage[i] = ordersRepository[i];
        }
        ordersRepository = newStorage;
    }

    private boolean isNullRepository(Orders[] ordersRepository) {
        return this.ordersRepository == null;
    }

}
