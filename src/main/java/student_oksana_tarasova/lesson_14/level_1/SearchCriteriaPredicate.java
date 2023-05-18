package student_oksana_tarasova.lesson_14.level_1;

public class SearchCriteriaPredicate implements ApplePredicate {

    ApplePredicate applePredicate;
    ApplePredicate applePredicate1;

    SearchCriteriaPredicate(ApplePredicate applePredicate, ApplePredicate applePredicate1) {
        this.applePredicate = applePredicate;
        this.applePredicate1 = applePredicate1;
    }

    @Override
    public boolean test(Apple apple) {
        return applePredicate.test(apple) &&
                applePredicate1.test(apple);
    }
}
