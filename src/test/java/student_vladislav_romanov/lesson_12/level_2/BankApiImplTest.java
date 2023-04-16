package student_vladislav_romanov.lesson_12.level_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

class BankApiImplTest {

    private List<BankClient> clients;
    private BankApiImpl bankApi;
    private UserCredentials userCredentials;

    @BeforeEach
    void setUp() {
        clients = List.of(new BankClient("11", "Mister X"), new BankClient("22", "Mister Y"));
        bankApi = new BankApiImpl(clients);
    }

    @Test
    void findByUidSuccess() throws AccessDeniedException {
        userCredentials = new UserCredentials();
        Optional<BankClient> expected = Optional.of(new BankClient("22", "Mister Y"));
        Optional<BankClient> current = bankApi.findByUid(userCredentials, "22");
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void findByUidFailed() throws AccessDeniedException {
        userCredentials = new UserCredentials();
        Optional<BankClient> expected = Optional.of(new BankClient("11", "Mister X"));
        Optional<BankClient> current = bankApi.findByUid(userCredentials, "22");
        assertThat(expected).isNotEqualTo(current);
    }

    @Test
    void findByUidAccessDeniedException() throws AccessDeniedException {
        List<Role> roles = new ArrayList<>();
        userCredentials = new UserCredentials(roles);

        AccessDeniedException thrown = Assertions.assertThrows(AccessDeniedException.class,
                () -> bankApi.findByUid(userCredentials, "22"),
                "Access denied. User cannot search clients.");

        Assertions.assertEquals("Access denied. User cannot search clients.", thrown.getMessage());
    }
}