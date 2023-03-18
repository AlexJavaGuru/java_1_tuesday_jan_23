package student_oksana_tarasova.lesson_7.level_7;

import java.util.Arrays;
import java.util.Objects;

class RepositoryTest {
    public static void main(String[] args) {
        RepositoryTest test = new RepositoryTest();
        test.addUserTest();
        test.getUserIdTest();
        test.noUserWithThisId();
        test.deleteUserTest();
    }

    public void addUserTest() {
        UserEntity user2 = new UserEntity(3000000, "Sidor", "Sidorov", 33333333);
        UserEntity[] users = {new UserEntity(1000000, "Ivan", "Ivanov", 11111111)};
        Repository repository = new Repository(users);
        UserEntity[] expectedArray = {
                new UserEntity(1000000, "Ivan", "Ivanov", 11111111),
                new UserEntity(3000000, "Sidor", "Sidorov", 33333333)
        };
        UserEntity[] realArray = repository.addUser(user2);
        if (Arrays.equals(expectedArray, realArray)) {
            System.out.println( "Test add user passed");
        }
    }

    public void getUserIdTest() {
        UserEntity[] users = {
                new UserEntity(1000000, "Ivan", "Ivanov", 11111111),
                new UserEntity(2000000, "Petr", "Petrov", 22222222),
                new UserEntity(3000000, "Sidor", "Sidorov", 33333333)
        };

        Repository repositories = new Repository(users);
        UserEntity expectedResult = users[2];
        UserEntity realResult = repositories.getUserId(3000000);
        if (expectedResult.equals(realResult)) {
            System.out.println("Test getUserId passed");
        }
    }

    public void noUserWithThisId() {
        UserEntity[] users = {
                new UserEntity(1000000, "Ivan", "Ivanov", 11111111),
                new UserEntity(2000000, "Petr", "Petrov", 22222222),
                new UserEntity(3000000, "Sidor", "Sidorov", 33333333)
        };
        Repository repositories = new Repository(users);
        UserEntity realResult = repositories.getUserId(4000000);
        if (realResult == null) {
            System.out.println("Test No exist user passed");

        }
    }

    public void deleteUserTest() {
        UserEntity[] users = {
                new UserEntity(1000000, "Ivan", "Ivanov", 11111111),
                new UserEntity(2000000, "Petr", "Petrov", 22222222),
                new UserEntity(3000000, "Sidor", "Sidorov", 33333333)
        };
        Repository repositories = new Repository(users);
        UserEntity[] realArray = repositories.deleteUser(2000000);
        if (realArray[1] == null) {
            System.out.println("Test delete user passed");
        }
    }
}
