package student_andrejs_cekalins.lesson_9.level_7.Task_28;

class AllTemperatureConverter  {
    enum Temperature implements TemperatureConverter{
        Celsius() {
            @Override
            public double convert(double celsiusTemperature) {
                return celsiusTemperature;
            }
        },
        Fahrenheit {
            @Override
            public double convert(double celsiusTemperature) {
                return 1.8 * celsiusTemperature + 32;
            }
        },
        Kelvin {
            @Override
            public double convert(double celsiusTemperature) {
                return celsiusTemperature + 273.15;
            }
        }
    };
    private double temperature;
    AllTemperatureConverter(Double temperature) {
        this.temperature = temperature;
    }
   public double convert(double temperature) {
        return temperature;
    }

    public static void main(String[] args) {
            System.out.println(Temperature.Celsius);
        }
    }

