package student_aleksandrs_lezhennikovs.lesson_9.level_7.task_28;

class Context {
    private TemperatureConverter tempConverter;

    public Context(TemperatureConverter tempConverter) {
        this.tempConverter = tempConverter;
    }

    public double executeTemperatureConverter(double temperature) {
        return tempConverter.convert(temperature);
    }
}
