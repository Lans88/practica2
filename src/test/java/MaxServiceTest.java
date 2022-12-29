import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.practica2.MaxService;

public class MaxServiceTest {
    @Test
    public void shouldFindMax() {
        MaxService service = new MaxService();
        int a = 5;
        int b = 3;
        int expected = b;
        int actual = service.max(a, b);
        Assertions.assertEquals(expected, actual);
    }


}
