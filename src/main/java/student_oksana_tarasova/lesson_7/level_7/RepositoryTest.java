package student_oksana_tarasova.lesson_7.level_7;

import java.util.Arrays;
import java.util.Objects;

class RepositoryTest {
    public static void main(String[] args) {
        RepositoryTest test = new RepositoryTest();
        test.addUserTest();
    }

    public void  addUserTest() {
        Repository repository = new Repository(new UserEntity[1]);
        UserEntity userFirst = new UserEntity(1000000, "Ivan", "Ivanov", 11111111);
        UserEntity[] expectedResult = {userFirst};
        UserEntity[] realResult = repository.addUser(userFirst);
        check(Arrays.equals(expectedResult, realResult), "Add new user");

    }
/* Кроме одного теста больше ничего не запускается.
Хотя демо работает. Как только патаюсь проверить методы с null,
все красное и пишет "Cannot invoke". Подскажите, где ошибка.

    public void getUserIdTest() {
        Repository repository = new Repository(new UserEntity[3]);
        UserEntity userFirst = new UserEntity(1000000, "Ivan", "Ivanov", 11111111);
        UserEntity userSecond = new UserEntity(2000000, "Petr", "Petrov", 22222222);
        UserEntity userThird = new UserEntity(3000000, "Sidor", "Sidorov", 33333333);
        UserEntity[] users = new UserEntity[]{userFirst, userSecond, userThird};
        UserEntity expectedResult = userFirst;
        UserEntity realResult = repository.getUserId(1000000);
        check(Objects.equals(expectedResult, realResult), "user output by id");
    }


    public void getUserIdTest1() {
        Repository repository = new Repository(new UserEntity[3]);
        UserEntity userFirst = new UserEntity(1000000, "Ivan", "Ivanov", 11111111);
        UserEntity userSecond = new UserEntity(2000000, "Petr", "Petrov", 22222222);
        UserEntity userThird = new UserEntity(3000000, "Sidor", "Sidorov", 33333333);
        UserEntity[] users = new UserEntity[]{userFirst, userSecond, userThird};
        UserEntity realResult = repository.getUserId(4000000);
        check(Objects.equals(null, realResult), "not user output by id");
    }

    public void deleteUserTest() {
        Repository repository = new Repository(new UserEntity[3]);
        UserEntity userFirst = new UserEntity(1000000, "Ivan", "Ivanov", 11111111);
        UserEntity userSecond = new UserEntity(2000000, "Petr", "Petrov", 22222222);
        UserEntity userThird = new UserEntity(3000000, "Sidor", "Sidorov", 33333333);
        UserEntity[] users = new UserEntity[]{userFirst, userSecond, userThird};
        UserEntity[] expectedResult = {userFirst, null, userThird};
        UserEntity[] realResult = repository.deleteUser(2000000);
        check(Arrays.equals(expectedResult, realResult), "Delete user");
    }
*/

    void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }
}
