package student_julija_raudive.lesson_12.level_2;

import java.util.Optional;

interface BankApi {

     Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
