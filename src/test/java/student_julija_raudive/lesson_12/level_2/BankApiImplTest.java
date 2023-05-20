package student_julija_raudive.lesson_12.level_2;



import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class BankApiImplTest {

    List<Role> roles = new ArrayList<>();
    UserCredentials credentials = new UserCredentials();


    List<BankClient> clientList = List.of(
            new BankClient("1", "Santa"),
            new BankClient("2", "Julija"),
            new BankClient("3", "Olga")
    );
    BankApiImpl bankApi = new BankApiImpl(clientList);


    @Test
    void findByUidOkTest() throws AccessDeniedException {
        Optional<BankClient> result = bankApi.findByUid(credentials, "5");
        Optional<BankClient> expected = Optional.empty();
        assertEquals(expected, result);



    }

    @Test
    void findByUidFailTest() throws AccessDeniedException {

        Optional<BankClient> result = bankApi.findByUid(credentials, "2");
        Optional<BankClient> expected = Optional.of(clientList.get(1));
        assertEquals(expected, result);
    }

    @Test
    void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() throws AccessDeniedException {
        UserCredentials userCredentials = new UserCredentials(roles);
        AccessDeniedException exception = assertThrows(AccessDeniedException.class,
                () -> bankApi.findByUid(userCredentials, "2"));
        assertEquals("Access denied", exception.getMessage());

    }
    }

