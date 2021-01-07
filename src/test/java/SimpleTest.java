import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

        @Test
        void successTest() {
            assertEquals(10/5, 2);
        }

        @Test
        void negativeTest() {
            assertEquals(10/5, 4);

        }

}
