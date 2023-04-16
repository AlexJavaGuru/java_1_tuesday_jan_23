package student_vladislav_romanov.lesson_12.level_2;

import java.util.Arrays;
import java.util.List;

class UserCredentials {

    private List<Role> roles;

    public UserCredentials() {
        roles = Arrays.asList(Role.values());
    }

    public List<Role> getRoles() {
        return roles;
    }

    @Override
    public String toString() {
        return "UserCredentials{" +
                "roles=" + roles +
                '}';
    }
}