package student_ilya_tihonov.lesson_12.level_2;

import java.util.List;

public class UserCredentials extends Throwable {

    private List<Role> roles;

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
