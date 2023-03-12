package student_oksana_tarasova.lesson_7.level_7;

public class RepositoryDemo {
    public static void main(String[] args) {
        UserEntity userFirst = new UserEntity(1000000, "Ivan", "Ivanov", 11111111);
        UserEntity userSecond = new UserEntity(2000000, "Petr", "Petrov", 22222222);
        UserEntity userThird = new UserEntity(3000000, "Sidor", "Sidorov", 33333333);
        UserEntity userFour = new UserEntity(4000000, "Ivan", "Ivanov", 44444444);
        System.out.println(userFirst.toString());
        UserEntity[] users = new UserEntity[1];
        Repository userRepository = new Repository(users);
        userRepository.addUser(userFirst);
        System.out.println(userRepository.toString());
        userRepository.addUser(userSecond);
        System.out.println(userRepository.toString());
        userRepository.addUser(userThird);
        System.out.println(userRepository.toString());
        userRepository.addUser(userFour);
        System.out.println(userRepository.toString());
        System.out.println(userRepository.getUserId(1000000));
        System.out.println(userRepository.getUserSurname("Petrov"));
        userRepository.deleteUser(2000000);
        System.out.println(userRepository.toString());
        UserEntity userFive = new UserEntity(5000000, "Ivan", "Ivanov", 55555555);
        userRepository.addUser(userFive);
        System.out.println(userRepository.toString());
        userRepository.deleteUser(4000000);
        System.out.println(userRepository.toString());
        userRepository.correctedUserData();
        System.out.println(userRepository.toString());
        //System.out.println(userRepository.getUserId(6));
    }
}
