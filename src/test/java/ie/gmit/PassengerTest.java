package ie.gmit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PassengerTest {
    Passenger passenger;

    @BeforeAll
    static void startingTests(){
        System.out.println("Starting tests");
    }

    @BeforeEach
    void printDisplayNames(TestInfo testInfo, TestReporter testReporter) {
        testReporter.publishEntry((testInfo.getDisplayName()));
    }

    @AfterAll
    static void testingComplete(){
        System.out.println("Testing Complete");
    }

    @DisplayName("Testing constructor initialisation success")
    @Test
    void testingConstuctorSuccess(){
        passenger = new Passenger("Mr", "Sandarva Baral", "0123456789", "0892079008", 21);
        assertEquals("Mr",passenger.getTitle());
        assertEquals("Sandarva Baral", passenger.getName());
        assertEquals("0123456789", passenger.getId());
        assertEquals(21,passenger.getAge());
    }

    @DisplayName("Testing Invalid Title Entry")
    @Test
    void testingInvalidTitle(){
        Exception e = assertThrows(IllegalArgumentException.class,()->{
            passenger = new Passenger("Mrr","Sandarva Baral", "0123456789", "0892079008", 21);
            });
        assertEquals("Invalid title provided",e.getMessage());
    }

    @DisplayName("Testing Invalid Name Entry")
    @Test
    void testingInvalidName(){
        Exception e = assertThrows(IllegalArgumentException.class,()->{
            passenger = new Passenger("Mr", "S","0123456789", "0892079008",21);
        });
        assertEquals("Name must have a minimum of 3 characters",e.getMessage());
    }

    @DisplayName("Testing Invalid ID Entry")
    @Test
    void testingInvalidID(){
        Exception e = assertThrows(IllegalArgumentException.class,()->{
            passenger = new Passenger("Mr", "Sandarva Baral", "2", "0892079008", 21);
        });
        assertEquals("ID must have a minimum of 10 characters",e.getMessage());
    }

    @DisplayName("Testing Invalid Phone Number")
    @Test
    void testingInvalidPhone(){
        Exception e = assertThrows(IllegalArgumentException.class,()->{
            passenger = new Passenger("Mr", "Sandarva Baral", "0123456789", "12",21);
        });
        assertEquals("Phone number must have a minimum of 10 characters", e.getMessage());
    }

    @DisplayName("Testing Invalid Age Entry")
    @Test
    void testingInvalidAge(){
        Exception e = assertThrows(IllegalArgumentException.class,()->{
            passenger = new Passenger("Mrs", "Siwani Baral","1234567899", "0892079008",15 );
        });
        assertEquals("Passenger must be older than 16 to fly",e.getMessage());

    }

}
