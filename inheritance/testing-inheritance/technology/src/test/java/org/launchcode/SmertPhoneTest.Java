import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SmertPhoneTest {

    private SmertPhone smartphone;

    @BeforeEach
    public void setUp() {
        smertphone = new SmertPhone("LCD", "Pink", "Jill");
    }

    @Test
    public void testPowerOn() {
        assertDoesNotThrow(() -> smertphone.powerOn());
    }

    @Test
    public void testGetWeight() {
        assertEquals("0.5lbs", smertphone.getWeight(), "The weight should be 0.5lbs");
    }

    @Test
    public void testHaveNumber() {
        String phoneNumber = "123-456-7890";
        assertDoesNotThrow(() -> smertphone.haveNumber(phoneNumber));  // No exception should be thrown
    }
}