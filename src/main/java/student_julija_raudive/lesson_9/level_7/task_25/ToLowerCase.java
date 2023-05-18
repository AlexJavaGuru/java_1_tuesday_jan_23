package student_julija_raudive.lesson_9.level_7.task_25;


class ToLowerCaseString implements StrategyPatternExample {
    @Override
    public String stringOperation(String word) {
        return word.toLowerCase();
    }
}

class ToUpperCaseString implements StrategyPatternExample {
    @Override
    public String stringOperation(String word) {
        return word.toUpperCase();
    }
}


