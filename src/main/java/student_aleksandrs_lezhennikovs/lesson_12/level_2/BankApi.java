package student_aleksandrs_lezhennikovs.lesson_12.level_2;

import java.util.Optional;

public interface BankApi {
    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
