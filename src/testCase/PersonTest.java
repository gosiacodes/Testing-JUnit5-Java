package testCase;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonTest {
	
	static String firstName;
	static String lastName;
	static int age;

	// I chose method @BeforeEach, but it can also be @BeforeAll
	@BeforeEach
	public void setUpUser() {
        firstName = "Gosia";
        lastName = "Pick";
        age = 45;
    }
	
	@Test
	@DisplayName("Test first name")
	public void testFirstName() {
        assertEquals("Gosia", firstName, "First name is not Gosia");
    }

	@Test
	@DisplayName("Test last name")
	public void testLastName() {
        assertEquals("Pick", lastName, "Last name is not Pick");
    }

	@Test
	@DisplayName("Test age")
	public void testAge() {
        assertEquals(45, age, "Age is not 45");
    }
	
	// Alternative solutions:	
	@Test
	@DisplayName("Test first name 2")
	public void testFirstName2() {
        assertSame("Gosia", firstName, "First name doesn't match");
    }

	@Test
	@DisplayName("Test last name 2")
	public void testLastName2() {
        assertSame("Pick", lastName, "Last name doesn't match");
    }
	
	@Test
	@DisplayName("Test age 2")
	public void testAge2() {
		assertSame(45, age, "Age doesn't match");
	}

}
