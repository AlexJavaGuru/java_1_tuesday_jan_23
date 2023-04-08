package student_aleksandrs_lezhennikovs.lesson_9.level_4.task_11;

class ConverterDemo {
    public static void main(String[] args) {
        WeatherStation convertToCelsius = new ConvertToCelsius();
        WeatherStation convertToKelvin = new ConvertToKelvin();
        WeatherStation convertToFahrenheit = new ConvertToFahrenheit();

        ConsoleUI consoleUI = new ConsoleUI();
        double temperature = consoleUI.userInput();

        String resultCelsius = " " + convertToCelsius.showTemperature(temperature) + " C";
        consoleUI.outputToConsole(resultCelsius);


        String resultKelvin = " " +  convertToKelvin.showTemperature(temperature) + " K";
        consoleUI.outputToConsole(resultKelvin);

        String resultFahrenheit = " " +  convertToFahrenheit.showTemperature(temperature) + " F";
        consoleUI.outputToConsole(resultFahrenheit);
    }
}
