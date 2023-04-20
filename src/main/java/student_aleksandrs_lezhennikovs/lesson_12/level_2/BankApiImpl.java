package student_aleksandrs_lezhennikovs.lesson_12.level_2;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi{
    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {
        if (!credentials.hasRole(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException("Wrong credentials");
        }
        for (BankClient client : clients) {
            if (client.getUid().equals(uid)) {
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }
}
