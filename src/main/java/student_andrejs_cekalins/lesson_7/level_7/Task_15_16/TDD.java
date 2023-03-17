package student_andrejs_cekalins.lesson_7.level_7.Task_15_16;

class TDD {
    public static void main(String[] args) {
        TDD tdd = new TDD();
        tdd.testFindUserById();
        tdd.testFindUserByIdWhichDoesNotExist();
        tdd.testGetAllUsers();
        tdd.testFindUserByName();
        tdd.testFindUserBySurname();
    }

    public void testFindUserById() {
        UserEntity[] users = {
                new UserEntity(1, "Dimitry", "Smirnov", "180484-112071"),
                new UserEntity(2, "Andrey", "Popov", "061299-100705"),
                new UserEntity(3, "Sergey", "Vasiliev", "270679-104232"),
        };
        UserEntity expectedUser = users[1];
        UsersRepository usersRepository = new UsersRepository(users);
        UserEntity realUser = usersRepository.getUserById(2);
        if (realUser.equals(expectedUser)) {
            System.out.println("Test FindUserById: Passed");
        }
    }

    public void testFindUserByIdWhichDoesNotExist() {
        UserEntity[] users = {};
        UsersRepository usersRepository = new UsersRepository(users);
        UserEntity realUser = usersRepository.getUserById(5);
        if (realUser == null) {
            System.out.println("Test FindUserByIdWhichDoesNotExist: Passed");
        }
    }

    public void testGetAllUsers() {
        UserEntity[] expectedUsers = {
                new UserEntity(1, "Dimitry", "Smirnov", "180484-112071"),
                new UserEntity(2, "Andrey", "Popov", "061299-100705"),
                new UserEntity(3, "Sergey", "Vasiliev", "270679-104232"),
        };
        UsersRepository usersRepository = new UsersRepository(expectedUsers);
        UserEntity[] allUsers = usersRepository.getAllUsers();
        if (checkIfArraysAreEqual(expectedUsers, allUsers)) {
            System.out.println("Test GetAllUsers: Passed");
        }
    }

    private boolean checkIfArraysAreEqual(UserEntity[] expectedUsers, UserEntity[] allUsers) {
        if (expectedUsers.length != allUsers.length) {
            return false;
        }
        for (int i = 0; i < expectedUsers.length; i++) {
            if (expectedUsers[i] != allUsers[i]) {
                return false;
            }
        }
        return true;
    }
    public void testFindUserByName() {
        UserEntity[] users = {
                new UserEntity(1, "Dimitry", "Smirnov", "180484-112071"),
                new UserEntity(2, "Andrey", "Popov", "061299-100705"),
                new UserEntity(3, "Sergey", "Vasiliev", "270679-104232"),
        };
        UserEntity expectedUser = users[2];
        UsersRepository usersRepository = new UsersRepository(users);
        UserEntity realUser = usersRepository.getUserByName("Andrey");
        if (realUser.equals(expectedUser)) {
            System.out.println("Test FindUserByName: Passed");
        }
    }
    public void testFindUserBySurname() {
        UserEntity[] users = {
                new UserEntity(1, "Dimitry", "Smirnov", "180484-112071"),
                new UserEntity(2, "Andrey", "Popov", "061299-100705"),
                new UserEntity(3, "Sergey", "Vasiliev", "270679-104232"),
        };
        UserEntity expectedUser = users[2];
        UsersRepository usersRepository = new UsersRepository(users);
        UserEntity realUser = usersRepository.getUserBySurname("Popov");
        if (realUser.equals(expectedUser)) {
            System.out.println("Test FindUserBySurname: Passed");
        }
    }
}
