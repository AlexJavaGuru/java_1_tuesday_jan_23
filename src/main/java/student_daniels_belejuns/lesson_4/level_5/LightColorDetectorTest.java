package student_daniels_belejuns.lesson_4.level_5;

import student_daniels_belejuns.lesson_4.level_7.LightColorDetector;

public class LightColorDetectorTest {
    public static LightColorDetector lightColorDetector = new LightColorDetector();
    public static void main(String[] args) {
        violetMin();
        violetMax();
        blueMin();
        blueMax();
        greenMin();
        greenMax();
        yellowMin();
        yellowMax();
        orangeMin();
        orangeMax();
        redMin();
        redMax();
        InvisibleLightMin();
        InvisibleLightMax();

    }
    static void violetMin(){
        int wave = 380;
        String expectedResult = "Violet";
        String actualResult = lightColorDetector.detect(wave);
        if(expectedResult.equals(actualResult)){
            System.out.println("Violet minimum passed");
        }else {
            System.out.println("Violet maximum passed");
        }
    }
    static void violetMax(){
        int wave = 449;
        String expectedResult = "Violet";
        String actualResult = lightColorDetector.detect(wave);
        if(expectedResult.equals(actualResult)){
            System.out.println("Violet maximum passed");
        }else {
            System.out.println("Violet minimum failed");
        }

    }
    static void blueMin(){
        int wave = 450;
        String expectedResult = "blue";
        String actualResult = lightColorDetector.detect(wave);
        if(expectedResult.equals(actualResult)){
            System.out.println("blue minimum passed");
        }else {
            System.out.println("blue minimum passed");
        }
    }
    static void blueMax() {
        int wave = 494;
        String expectedResult = "blue";
        String actualResult = lightColorDetector.detect(wave);
        if (expectedResult.equals(actualResult)) {
            System.out.println("blue maximum passed");
        } else {
            System.out.println("blue maximum failed");
        }
    }
    static void greenMin(){
        int wave = 495;
        String expectedResult = "green";
        String actualResult = lightColorDetector.detect(wave);
        if(expectedResult.equals(actualResult)){
            System.out.println("green minimum passed");
        }else {
            System.out.println("green minimum failed");
        }

    }
    static void greenMax(){
        int wave = 569;
        String expectedResult = "green";
        String actualResult = lightColorDetector.detect(wave);
        if(expectedResult.equals(actualResult)){
            System.out.println("green maximum passed");
        }else {
            System.out.println("green maximum passed");
        }
    }
    static void yellowMin(){
        int wave = 570;
        String expectedResult = "yellow";
        String actualResult = lightColorDetector.detect(wave);
        if(expectedResult.equals(actualResult)){
            System.out.println("yellow minimum passed");
        }else {
            System.out.println("yellow minimum passed");
        }
    }
    static void yellowMax(){
        int wave = 589;
        String expectedResult = "yellow";
        String actualResult = lightColorDetector.detect(wave);
        if(expectedResult.equals(actualResult)){
            System.out.println("yellow maximum passed");
        }else {
            System.out.println("yellow maximum passed");
        }
    }
    static void orangeMin(){
        int wave = 590;
        String expectedResult = "orange";
        String actualResult = lightColorDetector.detect(wave);
        if(expectedResult.equals(actualResult)){
            System.out.println("orange minimum passed");
        }else {
            System.out.println("orange minimum passed");
        }
    }
    static void orangeMax(){
        int wave = 619;
        String expectedResult = "orange";
        String actualResult = lightColorDetector.detect(wave);
        if(expectedResult.equals(actualResult)){
            System.out.println("orange maximum passed");
        }else {
            System.out.println("orange maximum passed");
        }
    }
    static void redMin(){
        int wave = 620;
        String expectedResult = "red";
        String actualResult = lightColorDetector.detect(wave);
        if(expectedResult.equals(actualResult)){
            System.out.println("red minimum passed");
        }else {
            System.out.println("red minimum passed");
        }
    }
    static void redMax(){
        int wave = 750;
        String expectedResult = "red";
        String actualResult = lightColorDetector.detect(wave);
        if(expectedResult.equals(actualResult)){
            System.out.println("red maximum passed");
        }else {
            System.out.println("red maximum passed");
        }
    }
        static void InvisibleLightMin(){
        int wave = 379;
        String expectedResult = "Invisible Light";
        String actualResult = lightColorDetector.detect(wave);
        if(expectedResult.equals(actualResult)){
            System.out.println("Invisible Light passed");
        }else{
            System.out.println("Invisible Light failed");
        }
}
static void InvisibleLightMax(){
        int wave = 751;
        String expectedResult = "Invisible Light";
        String actualResult = lightColorDetector.detect(wave);
        if(expectedResult.equals(actualResult)){
            System.out.println("Invisible Light passed");
        }else{
            System.out.println("Invisible Light failed");
        }
}
}
