package student_andrejs_cekalins.lesson_12.level_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BankApiImlp2Test {


    private BankApiImpl bankApi;
    private List<BankClient> clients;

    @BeforeEach
    void setUp() {
        clients = List.of(new BankClient("1", "Andrej"),
                new BankClient("2", "Dmitry"));
        bankApi = new BankApiImpl(clients);
    }

    @Test
    void findByUid() {
        List<Role> roles = new ArrayList<>();
        UserCredentials userCredentials = new UserCredentials(roles);
        assertThrows(AccessDeniedException.class, () -> bankApi.findByUid(userCredentials, "1"));
    }

    @Test
    void findByUiClientExist() throws AccessDeniedException {
        List<Role> role = List.of(Role.CAN_SEARCH_CLIENTS);
        UserCredentials userCredentials = new UserCredentials(role);
        Optional<BankClient> current = bankApi.findByUid(userCredentials, "1");
        assertThat(current).isPresent();


    }

    @Test
    void findByUidNoClient() throws AccessDeniedException {
        List<Role> role = List.of(Role.CAN_SEARCH_CLIENTS);
        UserCredentials userCredentials = new UserCredentials(role);
        Optional<BankClient> current = bankApi.findByUid(userCredentials, "4");
        assertThat(current).isEqualTo(Optional.empty());
    }
}