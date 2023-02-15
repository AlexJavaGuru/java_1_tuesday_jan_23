package student_oleg_gryazev._lesson_3.level_7;

public class Product {
    double regularPrice;
    double discount;
    String computer;

    public double getRegularPrice() {
        return regularPrice;
    }


    public void setRegularPrice(double regP) {
        this.regularPrice = regP;
    }

    public void setDiscount(double disC) {
        this.discount = disC;
    }


    Product(String computer) {
        this.computer = computer;

    }

    public String getComputer() {
        return computer;
    }
    // public void setComputer(double regP){


    // double actualPrice(){
    //return actualPrice;
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