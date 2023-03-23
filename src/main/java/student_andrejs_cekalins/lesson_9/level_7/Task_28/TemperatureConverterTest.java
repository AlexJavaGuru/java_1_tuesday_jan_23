package student_andrejs_cekalins.lesson_9.level_7.Task_28;



class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverterTest test = new TemperatureConverterTest();
    }
    public void isCelsius () {
        AllTemperatureConverter temperatureConverter = new AllTemperatureConverter(10.00);
        Double expectedTemperature = 10.00;
        Double realTemperature = AllTemperatureConverter.Temperature.Celsius.convert(10.00);
        if (expectedTemperature.equals(realTemperature)) {
            System.out.println("Celsius converter test Passed");
        }
    }
}
