package student_anastasiia_bokareva.lesson12.level2;

import java.util.List;

public class UserCredentials {

    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    UserCredentials (List<Role> roles){
        this.roles=roles;
    }

    public boolean hasRole (Role role){
        return roles.contains(role);
    }

}
