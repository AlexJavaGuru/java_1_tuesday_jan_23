package student_andrejs_cekalins.lesson_4.level_5;

class LightColorDetector {
    public String detect(int wavelength) {
        String resultLightColor;
        if (wavelength >= 380 && wavelength <= 449) {
            resultLightColor = "Violet";
        } else if (wavelength >= 450 && wavelength <= 494) {
            resultLightColor = "Blue";
        } else if (wavelength >= 495 && wavelength <= 569) {
            resultLightColor = "Green";
        } else if (wavelength >= 570 && wavelength <= 589) {
            resultLightColor = "Yellow";
        } else if (wavelength >= 590 && wavelength <= 619) {
            resultLightColor = "Orange";
        } else if (wavelength >= 620 && wavelength <= 750) {
            resultLightColor = "Red";
        } else {
            resultLightColor = "Invisible Light";
        }
        return resultLightColor;
    }
}
