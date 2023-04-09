package teacher.lesson_12_exceptions.lessoncode;

import java.util.List;
import java.util.Optional;

public class UserService {

    private static final String TOKEN = "12345";
    private List<User> users;

    public UserService() {
        this.users = List.of(
                new User("Alex", Department.DEVELOPMENT),
                new User("Viktor", Department.DEVELOPMENT),
                new User("Paul", Department.MANAGEMENT),
                new User("Liga", Department.FINANCE)
        );
    }

    public Optional<User> getUserByName(String name, String token) {
        if (name == null) {
            throw new IllegalArgumentException("Name is null");
        }

        if (!TOKEN.equals(token)) {
            throw new TokenInvalidException("Token is invalid");
        }

        for (User user : users) {
            if (user.getUserName().equals(name)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
