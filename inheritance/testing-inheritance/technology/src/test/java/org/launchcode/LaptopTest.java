import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LaptopTest {

    private Laptop laptop;

    @BeforeEach
    public void setUp() {
        laptop = new Laptop("LCD", "White", "Bill");
    }

    @Test
    public void testPowerOn() {
        assertDoesNotThrow(() -> laptop.powerOn());
    }

    @Test
    public void testGetWeight() {
        assertEquals("1.6lbs", laptop.getWeight(), "The weight should be 1.6lbs");
    }

    @Test
    public void testFoldOrNot() {
        assertDoesNotThrow(() -> laptop.foldOrNot(true));  // No exception should be thrown
    }
}