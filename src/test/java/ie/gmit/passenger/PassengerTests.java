package ie.gmit.passenger;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class PassengerTests {
    private Passenger pass;

    @Test
    void testTitle(){
        pass = new Passenger("Mr", "Shane", "123456", 87780077, 22);
        assertEquals("Mr", pass.getTitle());
    }

    @Test
    void testInvalidTitle(){
        final String invalid = "Invalid title";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> new Passenger("", "Shane", "123456", 87780077, 22));
        assertEquals(invalid,exceptionThrown.getMessage());
    }

}
