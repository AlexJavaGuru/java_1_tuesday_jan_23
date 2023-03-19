package student_oleg_gryazev._lesson_3.level_7.task_31;

public class Product {
    double regularPrice;
    double actualPrice;
    double discount;
    String computer;

    public double getRegularPrice() {
        return regularPrice;
    }


    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


    Product(String computer) {
        this.computer = computer;

    }

    public String getComputer() {
        return computer;
    }

}


/*

Свойства:
- Наименование (String name)
- Стандартная цена (double regularPrice)
- Скидка в процентах (double discount)

Методы:
1. Расчет актуальной стоимости с учетом скидки (
Вывод информации о продукте в консоль (void printInformation())1P
2. Название продукта нужно задавать через конструктор, а стоимость и скидку через оператор ".".

Класс с объявлением продукта должен называться "Product".
Класс с демонстрацией работы должен называться "ProductDemo".

 */