package student_aleksandrs_lezhennikovs.lesson_12.level_2;

import java.util.ArrayList;
import java.util.List;

class BankApiImplTest {
    public static void main(String[] args) {
        testCorrectCredentials();
        testNotCorrectCredentials();
    }

    public static void testCorrectCredentials() {
        List<BankClient> clients = new ArrayList();
        BankApi api = new BankApiImpl(clients);

        List<Role> roles = new ArrayList();
        roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials credentials = new UserCredentials(roles);


        BankClient bankClient = new BankClient("1234", "Alex Lee");
        clients.add(bankClient);

        try {
            System.out.println(api.findByUid(credentials, "1234"));
            System.out.println("TEST correct user credential has PASSED");
        } catch(AccessDeniedException e) {
            System.out.println("TEST correct user credential has FAILED");
        }
    }

    public static void testNotCorrectCredentials() {
        List<BankClient> clients = new ArrayList();
        BankApi api = new BankApiImpl(clients);

        List<Role> roles = new ArrayList();

        UserCredentials credentials = new UserCredentials(roles);


        BankClient bankClient = new BankClient("1234", "Alex Lee");
        clients.add(bankClient);

        try {
            api.findByUid(credentials, "1234");
            System.out.println("Correct credentials");
        } catch(AccessDeniedException e) {
            System.out.println("TEST not correct user credentials has PASSED");
        }
    }
}
