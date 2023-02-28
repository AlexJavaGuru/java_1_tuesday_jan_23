package student_oksana_maksimova.lesson_4.level_6;

class Stock {

    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock (String name, int price) {
        companyName = name;
        currentPrice = price;
        minPrice = price;
        maxPrice = price;
    }
    public void updatePrice(int newPrice){
        currentPrice = newPrice;
        if (newPrice < minPrice) {
            minPrice = newPrice;
        }else if (newPrice > maxPrice){
            maxPrice = newPrice;
        }
    }
    public String getPriceInformation(){
        System.out.print("Company = " + companyName);
        System.out.print(", current price = " + currentPrice);
        System.out.print(", Min Price = " + minPrice);
        System.out.print(", Max Price = " + maxPrice);
        return "";
    }
}
    /*
Свойства:
- Имя компании
- Текущая стоимость
- Минимальная стоимость
- Максимальная стоимость
Методы:
- Обновить текущую стоимость акции updatePrice(int newPrice)
- Получить информацию об акции getPriceInformation()

Имя компании и начальную стоимость необходимо
задавать в момент создания акции.
Текущая, минимальная и максимальная стоимость
должны меняться только через метод updatePrice().
Stock (String name, int price) {
        company = name;
        currentPrice = price;
        minPrice = price;
        maxPrice = price;
    }
*/