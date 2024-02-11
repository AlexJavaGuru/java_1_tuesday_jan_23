package student_anastasiia_bokareva.lesson12.level2;

import java.util.Optional;

public interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid)
            throws AccessDeniedException;
}
