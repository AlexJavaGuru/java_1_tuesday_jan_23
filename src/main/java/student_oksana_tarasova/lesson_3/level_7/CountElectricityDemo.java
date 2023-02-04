package student_oksana_tarasova.lesson_3.level_7;
// Task 29
import java.util.concurrent.Callable;

class CountElectricityDemo {
    public static void main(String[] agrs) {
        CountElectricity user = new CountElectricity("Bob", "Wolf", "str. Forest, 22");
        user.subscriber();
        user.date("April", 2023);
        user.count(1234, 1345);

        CountElectricity user2 = new CountElectricity("Alisa", "Fox", "str. Forest, 25");
        user2.subscriber();
        user2.date("April", 2023);
        user2.count(1353, 1412);


    }
}
