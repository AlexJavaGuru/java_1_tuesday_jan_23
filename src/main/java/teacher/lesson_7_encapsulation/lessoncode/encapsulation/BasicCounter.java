package teacher.lesson_7_encapsulation.lessoncode.encapsulation;

/*
State
1. Current counter value cannot be accessed directly
‣ Behaviour
2. Can increment, decrement and clear counter value
3. Can set counter value to any specified positive
number (otherwise set to 0)
4. Can be constructed only within the same package
 */

public class BasicCounter {

    private int value;

    BasicCounter() {
    }

    void increment() {
        value++;
    }

    void decrement() {
        value--;
    }

    void clear() {
        value = 0;
    }

    public int getValue() {
        return value;
    }

    void setCounterValue(int value) {
        if (value < 0) {
            this.value = 0;
        } else {
            this.value = value;
        }
    }
}
