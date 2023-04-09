package student_aleksandrs_lezhennikovs.lesson_7.level_7;

class UserRepoTDD {

    public static void main(String[] args) {
        UserRepoTDD userRepoTDD = new UserRepoTDD();
        userRepoTDD.testFindUserById();
        userRepoTDD.testGetAllUsers();
        userRepoTDD.testFindUserByIdWhichDoesNotExist();
    }

    public void testFindUserById() {
        UserEntity[] users = {
                new UserEntity(1, "Aleksandrs", "Ivanovs", "010285-20315"),
                new UserEntity(2, "Olegs", "Petrovs", "151275-10685"),
                new UserEntity(3, "Petrs", "Sidorovs", "250459-11487")
        };
        UserEntity expectedUser = users[1];
        UsersRepository usersRepository = new UsersRepository(users);
        UserEntity realUser = usersRepository.getUserById(2);
        if (realUser.equals(expectedUser)) {
            System.out.println("Test1 Passed");
        }
    }

    public void testFindUserByIdWhichDoesNotExist() {
        UserEntity[] users = {};
        UsersRepository usersRepository = new UsersRepository(users);
        UserEntity realUser = usersRepository.getUserById(5);
        if (realUser == null) {
            System.out.println("Test2 Passed");
        }
    }

    public void testGetAllUsers() {
        UserEntity[] expectedUsers = {
                new UserEntity(1, "Aleksandrs", "Ivanovs", "010285-20315"),
                new UserEntity(2, "Olegs", "Petrovs", "151275-10685"),
                new UserEntity(3, "Petrs", "Sidorovs", "250459-11487")
        };
        UsersRepository usersRepository = new UsersRepository(expectedUsers);
        UserEntity[] allUsers = usersRepository.getAllUsers();
        if (checkIfArraysAreEqual(expectedUsers, allUsers)) {
            System.out.println("Test1 Passed");
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

//    public static void main(String[] args) {
//        UserEntity firstUser = new UserEntity(1, "Aleksandrs", "Ivanovs", "010285-20315");
//        UserEntity secondUser = new UserEntity(2, "Olegs", "Petrovs", "151275-10685");
//        UserEntity thirdUser = new UserEntity(3, "Petrs", "Sidorovs", "250459-11487");
//        System.out.println("");
//        System.out.println("Add users to Repo:");
//        UserEntity[] users = new UserEntity[1];
//        UsersRepository usersRepository = new UsersRepository(users);
//        usersRepository.add(firstUser);
//        usersRepository.add(secondUser);
//        usersRepository.add(thirdUser);
//        System.out.println("");
//        System.out.println("Get user by ID:");
//        UserEntity firstTestUserId = usersRepository.getUserById(1);
//        UserEntity secondTestUserId = usersRepository.getUserById(2);
//        UserEntity thirdTestUserId = usersRepository.getUserById(3);
//        System.out.println(firstTestUserId.getLastName());
//        System.out.println(secondTestUserId.getFirstName());
//        System.out.println(thirdTestUserId.getPersonalCode());
//        System.out.println("");
//        System.out.println("Get user by WRONG ID:");
//        UserEntity userWrongId = usersRepository.getUserById(5);
//        if (userWrongId != null) {
//            System.out.println(userWrongId.getLastName());
//        } else {
//            System.out.println("Wrong User ID");
//        }
//
//        System.out.println("");
//        System.out.println("Get user by Name:");
//        UserEntity firstTestUser = usersRepository.getUserByLastName("Sidorovs");
//        UserEntity secondTestUser = usersRepository.getUserByLastName("Ivanovs");
//        UserEntity thirdTestUser = usersRepository.getUserByLastName("Petrovs");
//        System.out.println(firstTestUser.getId());
//        System.out.println(secondTestUser.getFirstName());
//        System.out.println(thirdTestUser.getPersonalCode());
//        System.out.println("");
//        System.out.println("Get user by WRONG Name:");
//        UserEntity firstUserWrongName = usersRepository.getUserByLastName("Vasechkin");
//        if (firstUserWrongName != null) {
//            System.out.println(firstUserWrongName.getId());
//        } else {
//            System.out.println("Wrong User Name");
//        }
//        System.out.println("");
//        System.out.println("Print all users:");
//        UserEntity[] allUsers = usersRepository.getAllUsers();
//        for (UserEntity user : allUsers) {
//            System.out.println(user.getId());
//            System.out.println(user.getFirstName());
//            System.out.println(user.getLastName());
//            System.out.println(user.getPersonalCode());
//        }
//        System.out.println("");
//        System.out.println("Test change user's data Aleksandrs to Sasha':");
//        secondTestUser.setFirstName("Sasha");
//        for (UserEntity user : allUsers) {
//            System.out.println(user.getId());
//            System.out.println(user.getFirstName());
//            System.out.println(user.getLastName());
//            System.out.println(user.getPersonalCode());
//        }
//        System.out.println("");
//        System.out.println("Test delete user by ID 2:");
//        usersRepository.deleteUserById(2);
//        allUsers = usersRepository.getAllUsers(); // why need to call .getAllUsers() to refresh users?
//        for (UserEntity user : allUsers) {
//            System.out.println(user.getId());
//            System.out.println(user.getFirstName());
//            System.out.println(user.getLastName());
//            System.out.println(user.getPersonalCode());
//        }
//        System.out.println("");
//        System.out.println("Test delete user by WRONG ID 5:");
//        usersRepository.deleteUserById(5);
//        allUsers = usersRepository.getAllUsers(); // why need to call .getAllUsers() to refresh users?
//        for (UserEntity user : allUsers) {
//            System.out.println(user.getId());
//            System.out.println(user.getFirstName());
//            System.out.println(user.getLastName());
//            System.out.println(user.getPersonalCode());
//        }
//        System.out.println("");
//        System.out.println("Test add user with existing ID 3:");
//        UserEntity wrongIdUser = new UserEntity(3, "Janis", "Ozols", "230388-10457");
//        usersRepository.add(wrongIdUser);
//        allUsers = usersRepository.getAllUsers();
//        for (UserEntity user : allUsers) {
//            System.out.println(user.getId());
//            System.out.println(user.getFirstName());
//            System.out.println(user.getLastName());
//            System.out.println(user.getPersonalCode());
//        }
//        System.out.println("");
//        System.out.println("Test add user with not existing ID 2:");
//        UserEntity correctIdUser = new UserEntity(2, "Janis", "Ozols", "230388-10457");
//        usersRepository.add(correctIdUser);
//        allUsers = usersRepository.getAllUsers();
//        for (UserEntity user : allUsers) {
//            System.out.println(user.getId());
//            System.out.println(user.getFirstName());
//            System.out.println(user.getLastName());
//            System.out.println(user.getPersonalCode());
//        }
//    }
}
