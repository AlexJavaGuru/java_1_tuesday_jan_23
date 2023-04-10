package student_anastasiia_bokareva.lesson7.level7;

import java.sql.Array;

public class UserTDD {
    public static void main(String[] args) {
        UserTDD test = new UserTDD();
        test.testFindUserById();
        test.testFindUserByName();
        test.getAllUsers();

    }
    public void testFindUserById() {
        UserEntity[] users = {
                new UserEntity(1, "Anastasiia", "Rain", 2012),
                new UserEntity(2, "Aleksandr", "Koln", 2401),
                new UserEntity(3, "Elena", "Kolna", 2100)
        };
        UserEntity expectedUser = users[2];
        UserRepository userRepository = new UserRepository(users);
        UserEntity realUser = userRepository.getUserById(3);
        check(expectedUser,realUser," find user by id");

    }
    public void testFindUserByName() {
        UserEntity[] users = {
                new UserEntity(1, "Anastasiia", "Rain", 2012),
                new UserEntity(2, "Aleksandr", "Koln", 2401),
                new UserEntity(3, "Elena", "Kolna", 2100)
        };
        UserEntity expectedUser = users[2];
        UserRepository userRepository = new UserRepository(users);
        UserEntity realUser = userRepository.getUserByName("Elena");
        check(expectedUser,realUser," find user by name");

    }

    void check (UserEntity realUser, UserEntity expectedResult, String testName){
        if (realUser==expectedResult){
            System.out.println("Test"+testName+" is ok");
        } else {
            System.out.println("Test "+ testName+ " is fail");
        }
    }
    public void getAllUsers(){
        UserEntity[] expectedUsers = {
                new UserEntity(1, "Anastasiia", "Rain", 2012),
                new UserEntity(2, "Aleksandr", "Koln", 2401),
                new UserEntity(3, "Elena", "Kolna", 2100)
        };
        UserRepository repository = new UserRepository(expectedUsers);
        UserEntity[] realResult = repository.getAllUsers();
        if (expectedUsers.equals(realResult)){
            System.out.println("Test get all users is ok");
        } else {
            System.out.println("Test get all users is fail");
        }
    }

}
