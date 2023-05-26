package student_ilya_tihonov.lesson_12.level_2;


import java.util.ArrayList;
import java.util.List;

public class BankApiImplTest {

    public static void main(String[] args) {
        testFindByUid();
    }

    public static void testFindByUid() {
        List<BankClient> clients = new ArrayList();
        BankApi api = new BankApiImpl(clients);

        List<Role> roles = new ArrayList();
        roles.add(Role.CAN_SEARCH_CLIENTS);

        UserCredentials userCredentials = new UserCredentials(roles);

        try {
            api.findByUid(userCredentials, "5555");
            System.out.println("Test failed");
        } catch ( AccessDeniedException e) {
            System.out.println("Test ok");
        }
    }
}


