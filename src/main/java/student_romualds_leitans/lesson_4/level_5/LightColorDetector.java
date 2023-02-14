package student_romualds_leitans.lesson_4.level_5;

class LightColorDetector {

    public String detect(int wavelenght) {
        String resultLightor = null;
        if (wavelenght >= 380 && wavelenght <= 449) {
            resultLightor = "Violet";
        } else if (wavelenght >= 450 && wavelenght <= 494) {
            resultLightor = "Blue";
        } else if (wavelenght >= 495 && wavelenght <= 569) {
            resultLightor = "Green";
        } else if (wavelenght >= 570 && wavelenght <= 589) {
            resultLightor = "Yellow";
        } else if (wavelenght >= 590 && wavelenght <= 619) {
            resultLightor = "Orange";
        } else if (wavelenght >= 620 && wavelenght <= 750) {
            resultLightor = "Red";
        } else if (wavelenght > 750){
            resultLightor = "Max Invisible Light";
        } else if (wavelenght < 380){
            resultLightor = "Min Invisible Light";
        }
        return resultLightor;
    }
}



