import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({LaptopTest.class, SmertPhoneTest.class, ComputerTest.class})
@IncludeClassNamePatterns({"^.*Test$"})  // Optional: include all classes ending in 'Test'
public class AllTestsSuite {
}