package student_andrejs_cekalins.lesson_12.level_2;

import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.List;

public class BankApiImplTest {
    /*
    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole();
    }

    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
       List<BankClient> clients = new ArrayList();
      BankApi bankApi = new BankApiImpl(clients);
       List<Role> roles = new ArrayList();
       UserCredentials credentials = new UserCredentials(roles);
      try {
           bankApi.findByUid(credentials, "1234");
           System.out.println("TEST FAIL"); // потому что если мы дошли до этой строки,
            // значит что метод findByUid() не кинул ошибку, а он был должен сделать это
            // так как в credentials нет нужной роли
        } catch (AccessDeniedException e) {
            System.out.println("TEST OK");
       }
    }

     */
}
