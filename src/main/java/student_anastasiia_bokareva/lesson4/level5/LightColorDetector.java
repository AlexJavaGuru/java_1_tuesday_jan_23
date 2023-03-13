package student_anastasiia_bokareva.lesson4.level5;

public class LightColorDetector {
    public String detect(int wavelength) {
        String color;
        if ((380 <= wavelength) & (wavelength <= 449)) {
            color = "Violet";
        } else if ((450 <= wavelength) & (wavelength <= 494)) {
             color = "Blue";
        } else if ((495 <= wavelength) & (wavelength <= 569)) {
            color = "Green";
        } else if ((570 <= wavelength) & (wavelength <= 589)) {
            color = "Yellow";
        } else if ((590 <= wavelength) & (wavelength <= 619)) {
            color = "Orange";
        } else if ((620 <= wavelength) & (wavelength <= 750)) {
            color = "Red";
        } else {
            color = "Invisible Light";
        }
            return color;

    }
}


