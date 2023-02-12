package student_natalija_rasponomarjova.lesson_4.level_6;
/*
Методы:
- Обновить текущую стоимость акции updatePrice(int newPrice)
- Получить информацию об акции getPriceInformation()

Имя компании и начальную стоимость необходимо
задавать в момент создания акции.
Текущая, минимальная и максимальная стоимость
должны меняться только через метод updatePrice().*/
class Stock {
    private String companyName;
    private int currentValue;
    private int minValue;
    private int maxValue;


   /* Stock google = new Stock("GOOG", 10);
    String priceInformation = google.getPriceInformation();
    System.out.println(priceInformation);*/

    public int updatePrice(int currentValue) {
        this.currentValue = currentValue;
        return currentValue;
    }

}
