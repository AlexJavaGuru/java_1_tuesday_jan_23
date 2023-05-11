package student_dmitry_kupcus.lesson_8.level_3.Task_13;

public class PhoneTest {
    public static void main(String[] args) {
        Samsung samsung = new Samsung();
        Huawei huawei = new Huawei();
        System.out.println(samsung.name);
        System.out.println(huawei.name);
        huawei.info();
        samsung.info();
    }
}
