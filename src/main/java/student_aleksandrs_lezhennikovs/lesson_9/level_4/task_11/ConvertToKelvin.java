package student_aleksandrs_lezhennikovs.lesson_9.level_4.task_11;

class ConvertToKelvin implements WeatherStation {

    @Override
    public double showTemperature(double temperature) {
        return temperature + 273.15;
    }
}
