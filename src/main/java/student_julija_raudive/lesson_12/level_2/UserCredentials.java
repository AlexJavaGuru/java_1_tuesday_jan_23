package student_julija_raudive.lesson_12.level_2;


import java.util.Arrays;
import java.util.List;

class UserCredentials {

    private List<Role> roles;

    public UserCredentials() {
        this.roles = Arrays.asList(Role.values());
    }

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }
}
