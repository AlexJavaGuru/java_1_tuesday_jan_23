package student_vladislav_romanov.lesson_7.level_7;

class UserRepoTest {

    int succeedTests;
    int failedTests;

    public static void main(String[] args) {
        UserRepoTest userRepoTest = new UserRepoTest();

        userRepoTest.saveUserToDataBaseTest();
        userRepoTest.getUserByIdTest();
        userRepoTest.getUsersByNameTest();
        userRepoTest.getUserEntitiesTest();
        userRepoTest.editUserTest();
        userRepoTest.deleteUserTest();
        userRepoTest.printStat();
    }

    public void saveUserToDataBaseTest() {
        UserEntity userEntity1 = new UserEntity("Jarmene", "Jones", "224213-32145");
        UserRepo expected = new UserRepo(userEntity1);
        UserRepo current = new UserRepo();
        current.saveUserToDataBase(userEntity1);
        printResult(current.equals(expected), "saveUserToDataBaseTest");
    }

    public void getUserByIdTest() {
        UserEntity userEntity2 = new UserEntity("Ian", "Smith", "545263-43456");
        UserEntity userEntity3 = new UserEntity("Mike", "Hoar", "243956-97923");
        UserEntity userEntity4 = new UserEntity("John", "Dee", "123465-23456");
        UserRepo userRepo = new UserRepo();
        userRepo.saveUserToDataBase(userEntity2);
        userRepo.saveUserToDataBase(userEntity3);
        userRepo.saveUserToDataBase(userEntity4);
        UserEntity expected = userEntity4;
        UserEntity current = userRepo.getUserById(4);
        printResult(current.equals(expected), "getUserByIdTest");
    }

    public void getUsersByNameTest() {
        UserEntity userEntity1 = new UserEntity("Ian", "Smith", "545263-43456");
        UserEntity userEntity2 = new UserEntity("John", "Travolta", "545263-43456");
        UserEntity userEntity3 = new UserEntity("Mike", "Hoar", "243956-97923");
        UserEntity userEntity4 = new UserEntity("John", "Dee", "123465-23456");
        UserEntity userEntity5 = new UserEntity("John", "Connor", "123465-23456");
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
        UserEntity userEntity1 = new UserEntity("Ian", "Smith", "545263-43456");
        UserEntity userEntity2 = new UserEntity("John", "Travolta", "545263-43456");
        UserEntity userEntity3 = new UserEntity("Mike", "Hoar", "243956-97923");
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
