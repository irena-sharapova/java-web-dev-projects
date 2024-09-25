public class ComputerTest {
    private Computer computer;

    @BeforeEach
    public void data() {
        computer = new Computer ("LCD", "Black", "John");
    }

    @Test
    public void testPowerOn(){
        assertDoesNotThrow() -> computer.powerOn());
    }

    @Test
    public void testGetScreen(){
        assertEquals("LCD", computer.getScreen(), "The screen type should be LCD");
    }

    @Test
    public void testGetOwner(){
        assertEquals("John", computer.getOwner(), "The owner should be John");
    }
}