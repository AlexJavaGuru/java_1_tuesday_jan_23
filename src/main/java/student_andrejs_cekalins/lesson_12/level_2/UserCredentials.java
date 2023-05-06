package student_andrejs_cekalins.lesson_12.level_2;

import java.util.List;

public class UserCredentials {
    private List<Role> roles;

    UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean hasRoles(Role role) {
        return roles.contains(role);
    }
}
