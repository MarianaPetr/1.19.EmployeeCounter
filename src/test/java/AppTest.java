/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class AppTest {
    @Test public void checkCounting() {
        Employees classUnderTest = new Employees();
        assertEquals(classUnderTest.getCount(), 1);
    }
    
    @Test public void checkCounting3() {
        Employees classUnderTest = new Employees();
        Employees classUnderTest2 = new Employees();
//        Employees classUnderTest3 = new Employees();
        assertEquals(classUnderTest.getCount(), 3);
    }
}
