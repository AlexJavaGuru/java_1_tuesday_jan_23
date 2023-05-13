package student_anastasiia_bokareva.lesson13.level5;

public class AdditionalRules {
    private String ruleOne;
    private String ruleTwo;
    private String ruleThree;
    private String ruleFour;

    AdditionalRules(String ruleOne, String ruleTwo,
                    String ruleThree, String ruleFour){
        this.ruleOne=ruleOne;
        this.ruleTwo = ruleTwo;
        this.ruleThree=ruleThree;
        this.ruleFour = ruleFour;
    }

    String replace(String number) {
        String numberString = number.replace(ruleOne, ",").
                replace(ruleTwo, ",").
                replace(ruleThree, ",").
                replace(ruleFour, ",");
        return numberString;

    }
}
