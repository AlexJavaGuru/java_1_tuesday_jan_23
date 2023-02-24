package student_natalja_semitseva.lesson_4_if_statement.NS_level_1.Ns_Level_5;

class LightColorDetector {

    public LightColorDetector() {

    }


    public String detect(int wavelength) {
        if (wavelength >= 380 && wavelength <= 449) {
            return "Violet";
        } else if (wavelength > 449 && wavelength <= 494) {
            return "Blue";
        } else if (wavelength > 494 && wavelength <= 569) {
            return "Green";
        } else if (wavelength > 569 && wavelength <= 589) {
            return "Yellow";
        } else if (wavelength > 589 && wavelength <= 619) {
            return "Orange";
        } else if (wavelength > 619 && wavelength <= 750) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }


}
