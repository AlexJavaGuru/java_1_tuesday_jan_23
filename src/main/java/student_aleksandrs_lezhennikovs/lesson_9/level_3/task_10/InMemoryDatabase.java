package student_aleksandrs_lezhennikovs.lesson_9.level_3.task_10;


import java.util.Optional;

class InMemoryDatabase implements ProductDatabase {
    private Product[] storage;

    public InMemoryDatabase(Product[] storage) {
        this.storage = storage;
    }

    public Product[] getStorage() {
        return storage;
    }

    @Override
    public void save(Product product) {
        int index = getIndexOfEmptyElement(storage);
        if (index != -1) {
            storage[index] = product;
        } else if (isProductUnique(product)) {
            extendStorage();
            storage[storage.length - 1] = product;
        }
    }

    private int getIndexOfEmptyElement(Product[] storage) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                return i;
            }
        }
        return -1;
    }

    private void extendStorage() {
        Product[] newStorage = new Product[storage.length + 1];
        for (int i = 0; i < storage.length; i++) {
            newStorage[i] = storage[i];
        }
        storage = newStorage;
    }

    private boolean isProductUnique(Product checkProduct) {
        for (Product product : storage) {
            if (product.getTitle() == checkProduct.getTitle()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (Product product : storage) {
            Optional<Product> optProduct = Optional.ofNullable(product);
            if (optProduct.isPresent()) {
                if (optProduct.get().getTitle().equals(productTitle)) {
                    return optProduct;
                }
            }
        }
        return Optional.empty();
    }
}
