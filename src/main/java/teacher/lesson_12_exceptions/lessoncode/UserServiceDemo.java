package teacher.lesson_12_exceptions.lessoncode;

import java.util.List;
import java.util.Optional;

public class UserServiceDemo {

    public static void main(String[] args) {

        UserService userService = new UserService();

        Optional<User> result = Optional.empty();
        try {
            result = userService.getUserByName(null, "12345");
        } catch (TokenInvalidException e) {
            System.out.println("Something wrong... " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Runtime");
        }

        if (result.isPresent()) {
            User user = result.get();
            System.out.println(user);
        }

    }
}
