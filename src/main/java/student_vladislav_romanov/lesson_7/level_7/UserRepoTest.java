package student_vladislav_romanov.lesson_7.level_7;

class UserRepoTest {

    int succeedTests;
    int failedTests;

    public static void main(String[] args) {
        UserRepoTest userRepoTest = new UserRepoTest();

        userRepoTest.saveUserToDataBaseTest();
        userRepoTest.isIdNotUniqueTestSuccess();
        userRepoTest.isIdNotUniqueTestFailed();
        userRepoTest.createUniqueIdTest();
        userRepoTest.getUserByIdTest();
        userRepoTest.getUsersByNameTest();
        userRepoTest.getUserEntitiesTest();
        userRepoTest.editUserTest();
        userRepoTest.deleteUserTest();
        userRepoTest.printStat();
    }

    public void saveUserToDataBaseTest() {
        UserEntity userEntity1 = new UserEntity(1, "Jarmene", "Jones", "224213-32145");
        UserRepo expected = new UserRepo(userEntity1);
        UserRepo current = new UserRepo();
        current.saveUserToDataBase(userEntity1);
        printResult(current.equals(expected), "saveUserToDataBaseTest");
    }

    public void isIdNotUniqueTestSuccess() {
        UserRepo userRepo = new UserRepo();
        UserEntity userEntity1 = new UserEntity(1, "Ian", "Smith", "545263-43456");
        UserEntity userEntity2 = new UserEntity(2, "Mike", "Hoar", "243956-97923");
        userRepo.saveUserToDataBase(userEntity1);
        userRepo.saveUserToDataBase(userEntity2);
        boolean expected = true;
        boolean current = userRepo.isIdNotUnique(2);
        printResult(current == expected, "isIdNotUniqueTestSuccess");
    }

    public void isIdNotUniqueTestFailed() {
        UserRepo userRepo = new UserRepo();
        UserEntity userEntity1 = new UserEntity(1, "Ian", "Smith", "545263-43456");
        UserEntity userEntity2 = new UserEntity(2, "Mike", "Hoar", "243956-97923");
        userRepo.saveUserToDataBase(userEntity1);
        userRepo.saveUserToDataBase(userEntity2);
        boolean expected = false;
        boolean current = userRepo.isIdNotUnique(2);
        printResult(current != expected, "isIdNotUniqueTestFailed");
    }

    public void createUniqueIdTest() {
        UserRepo userRepo = new UserRepo();
        UserEntity userEntity1 = new UserEntity(12, "Ian", "Smith", "545263-43456");
        UserEntity userEntity2 = new UserEntity(2563712, "Mike", "Hoar", "243956-97923");
        userRepo.saveUserToDataBase(userEntity1);
        userRepo.saveUserToDataBase(userEntity2);
        int expected = 2563713;
        int current = userRepo.createUniqueId();
        printResult(current == expected, "createUniqueIdTest");
    }

    public void getUserByIdTest() {
        UserEntity userEntity1 = new UserEntity(1, "Ian", "Smith", "545263-43456");
        UserEntity userEntity2 = new UserEntity(2, "Mike", "Hoar", "243956-97923");
        UserEntity userEntity3 = new UserEntity(2, "John", "Dee", "123465-23456");
        UserRepo userRepo = new UserRepo();
        userRepo.saveUserToDataBase(userEntity1);
        userRepo.saveUserToDataBase(userEntity2);
        userRepo.saveUserToDataBase(userEntity3);
        UserEntity expected = userEntity3;
        UserEntity current = userRepo.getUserById(3);
        printResult(current.equals(expected), "getUserByIdTest");
    }

    public void getUsersByNameTest() {
        UserEntity userEntity1 = new UserEntity(1, "Ian", "Smith", "545263-43456");
        UserEntity userEntity2 = new UserEntity(2, "John", "Travolta", "545263-43456");
        UserEntity userEntity3 = new UserEntity(3, "Mike", "Hoar", "243956-97923");
        UserEntity userEntity4 = new UserEntity(4, "John", "Dee", "123465-23456");
        UserEntity userEntity5 = new UserEntity(5, "John", "Connor", "123465-23456");
        UserRepo userRepo = new UserRepo();
        userRepo.saveUserToDataBase(userEntity1);
        userRepo.saveUserToDataBase(userEntity2);
        userRepo.saveUserToDataBase(userEntity3);
        userRepo.saveUserToDataBase(userEntity4);
        userRepo.saveUserToDataBase(userEntity5);
        UserEntity[] expected = {userEntity2, userEntity4, userEntity5};
        UserEntity[] current = userRepo.getUsersByName("John");
        printResult(checkUserRepo(current, expected), "getUsersByNameTest");
    }

    public void getUserEntitiesTest() {
        UserEntity userEntity1 = new UserEntity(1, "Ian", "Smith", "545263-43456");
        UserEntity userEntity2 = new UserEntity(2, "John", "Travolta", "545263-43456");
        UserEntity userEntity3 = new UserEntity(3, "Mike", "Hoar", "243956-97923");
        UserRepo userRepo = new UserRepo();
        userRepo.saveUserToDataBase(userEntity1);
        userRepo.saveUserToDataBase(userEntity2);
        userRepo.saveUserToDataBase(userEntity3);
        UserEntity[] expected = {userEntity1, userEntity2, userEntity3};
        UserEntity[] current = userRepo.getUserEntities();
        printResult(checkUserRepo(current, expected), "getUserEntitiesTest");
    }

    public void editUserTest() {
        UserEntity userEntity1 = new UserEntity(1,"Ian", "Smith", "545263-43456");
        UserEntity userEntity2 = new UserEntity(2,"John", "Travolta", "545263-43456");
        UserEntity userEntity3 = new UserEntity(3,"Mike", "Hoar", "243956-97923");
        UserRepo userRepo = new UserRepo();
        userRepo.saveUserToDataBase(userEntity1);
        userRepo.saveUserToDataBase(userEntity2);
        userRepo.saveUserToDataBase(userEntity3);
        UserEntity expected = new UserEntity(2, "Jack", "Jones", "654321-12345");
        userRepo.editUser(2, "Jack", "Jones", "654321-12345");
        UserEntity current = userRepo.getUserById(2);
        printResult(current.equals(expected), "editUserTest");
    }

    public void deleteUserTest() {
        UserEntity userEntity1 = new UserEntity(1,"Ian", "Smith", "545263-43456");
        UserEntity userEntity2 = new UserEntity(2,"John", "Travolta", "545263-43456");
        UserEntity userEntity3 = new UserEntity(3,"Mike", "Hoar", "243956-97923");
        UserRepo userRepo = new UserRepo();
        userRepo.saveUserToDataBase(userEntity1);
        userRepo.saveUserToDataBase(userEntity2);
        userRepo.saveUserToDataBase(userEntity3);
        UserEntity[] expected = {userEntity1, userEntity3};
        userRepo.deleteUser(2);
        UserEntity[] current = userRepo.getUserEntities();
        printResult(checkUserRepo(current, expected), "deleteUserTest");
    }

    public boolean checkUserRepo(UserEntity[] current, UserEntity[] expected) {
        if (current.length != expected.length) {
            return false;
        }
        for (int i =0; i < current.length; i++) {
            if (current[i] != expected[i]) {
                return false;
            }
        }
        return true;
    }

    public void printResult(boolean result, String test) {
        if (result) {
            System.out.println(test + " test SUCCEED");
            succeedTests++;
        } else {
            System.out.println(test + " test FAILED");
            failedTests++;
        }
        System.out.println("----------------------------------------------------------");
    }

    public void printStat() {
        System.out.println(succeedTests + " tests SUCCEED.");
        System.out.println(failedTests + " tests FAILED.");
    }

}
