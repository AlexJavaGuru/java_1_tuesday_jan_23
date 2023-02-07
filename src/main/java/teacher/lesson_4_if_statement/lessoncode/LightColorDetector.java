package teacher.lesson_4_if_statement.lessoncode;

public class LightColorDetector {

    /*
    380 ... 449 - Фиолетовый ("Violet")
    450 ... 494 - Синий ("Blue")
     */

    public String detect(int wavelength) {
        String resultLightColor;
        if (wavelength >= 380 && wavelength <= 449) {
            resultLightColor = "Violet";
        } else if (wavelength >= 450 && wavelength <= 494) {
            resultLightColor = "Blue";
        } else {
            resultLightColor = "Invisible Light";
        }
        return resultLightColor;
    }
}
