package teacher.lesson_13_junit.lessoncode.multilayer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ServiceImplTest {

    @Spy
    private DataBaseImpl dataBaseMock;

    @Captor
    ArgumentCaptor<Integer> integerArgumentCaptor;

    @InjectMocks
    private ServiceImpl service;

    @Test
    void testPutIntoDB() {
        doNothing().when(dataBaseMock).save(anyInt());
        int input = 10;
        service.putIntoDB(input);
        verify(dataBaseMock).save(integerArgumentCaptor.capture());
        Integer capturedValue = integerArgumentCaptor.getValue();
        assertThat(capturedValue).isEqualTo(10);
    }

    @Test
    void readFromDB() {
        doReturn(Optional.of(10)).when(dataBaseMock).read(10);
        String result = service.readFromDB(10);
        assertThat(result).isEqualTo("10");
    }
}