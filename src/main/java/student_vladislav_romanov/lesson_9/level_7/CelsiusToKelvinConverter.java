package student_vladislav_romanov.lesson_9.level_7;

class CelsiusToKelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double temperature) {
        return temperature + 273.15;
    }

}