import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private int num1;
    private int num2;

    @Before
    public void setUp() {
        System.out.println("Setup Method Executed");
        num1 = 10;
        num2 = 20;
    }

    @Test
    public void testAddition() {

        // Arrange
        int expected = 30;

        // Act
        int result = num1 + num2;

        // Assert
        assertEquals(expected, result);
    }

    @After
    public void tearDown() {
        System.out.println("Teardown Method Executed");
    }
}
