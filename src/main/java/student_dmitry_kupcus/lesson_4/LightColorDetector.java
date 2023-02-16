package student_dmitry_kupcus.lesson_4;

class LightColorDetector {

    public String detect(int wavelength) {

        if (wavelength >= 380 && wavelength <= 449) {
            return "Violet color";
        } else if (wavelength >= 450 && wavelength <= 494) {
            return "Blue color";
        } else if (wavelength >= 495 && wavelength <= 569) {
            return "Green color";
        } else if (wavelength >= 570 && wavelength <= 589) {
            return "Yellow color";
        } else if (wavelength >= 590 && wavelength <= 619) {
            return "orange color";
        } else if (wavelength >= 620 && wavelength <= 750) {
            return "Red color";
        } else {
            return "Invisible light";
        }
    }

}