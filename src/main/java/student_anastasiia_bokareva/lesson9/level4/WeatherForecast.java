package student_anastasiia_bokareva.lesson9.level4;

public class WeatherForecast {
    public static void main(String[] args) {
        WeatherForecast weather = new WeatherForecast();
        double degreesKelvin = weather.degreesKelvin(23);
        double degreesFahrenheit = weather.degreesFahrenheit(23);

    }
    public double degreesKelvin (double degreesCelsuis){
        System.out.println("Kelvin degrees : "+ (degreesCelsuis+273.15));
        return  (degreesCelsuis+273.15);
    }
    public double degreesFahrenheit (double degreesCelsuis){
        System.out.println("Fahrenheit degrees : "+ ((degreesCelsuis * 9/5) + 32 ));
        return   ((degreesCelsuis * 9/5) + 32 );
    }
}
