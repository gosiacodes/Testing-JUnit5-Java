package testCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JUnitTestCase {
	
	// Uppgift 1
	/*
	public void Writing_Sometext_Backwards( ) {
		StringBuilder b = new StringBuilder("Jag");
		AssertEquals("gaJ, b.reverse().toString());
		}
	*/
	
	// Changes: added annotation @Test, changed name of method + camel case,
	// changed AssertEquals to lower case in the beginning,
	// added missing quote sign, changed name of StringBuilder to sb
	@Test
	@DisplayName("Test 1: reversed text")
	public void testReversedText( ) {
		StringBuilder sb = new StringBuilder("Jag");
		assertEquals("gaJ", sb.reverse().toString());
		}
	
	// Uppgift 2
	/*
	@Test
	public String JustASimpleAssert( ) {
		String name = "My name";
		assertEquals("My name", name);
		return "String";
	}
	*/
	
	// Test does not run - String must be changed to void.
	// Changes: String changed to void, void method cannot return a value - deleted return "String", 
	// changed name of method + camel case	
	@Test
	@DisplayName("Test 2: if name matches")
	public void testIfNameMatches( ) {
		String name = "My name";
		assertEquals("My name", name);
	}
	
	// Uppgift 3
	/*
	@Test
	public void TryingDifferentThings() {
		String firstname = "first name";
		String lastname = "last name";
		int phonenumber = 0701111111;
		String streetaddress = "my cool street";
		assertEquals("first name", firstname);
		assertEquals("last name", lastname);
		assertEquals(0701111111, phonenumber);
		assertEquals("my cool street", streetaddress);
	}
	*/
	
	// Statements can be be broken out into several unit tests. 
	// Changes: changed names of methods + camel case, separate methods - for every statement,
	// changed names of variables with camel case	
	@Test
	@DisplayName("Test 3a: first name")
	public void testFirstName() {
		String firstName = "first name";
		assertEquals("first name", firstName);
	}
	
	@Test
	@DisplayName("Test 3b: last name")
	public void testLastName() {
		String lastName = "last name";
		assertEquals("last name", lastName);
	}
	
	@Test
	@DisplayName("Test 3c: phone number")
	public void testPhoneNumber() {
		int phoneNumber = 0701111111;
		assertEquals(0701111111, phoneNumber);
	}
	
	@Test
	@DisplayName("Test 3d: street adress")
	public void testStreetAdress() {
		String streetAddress = "my cool street";
		assertEquals("my cool street", streetAddress);
	}
	
	// Alternative solution:
	// We can also gather data in object and test all attributes together in grouped assertions:
	/*
	@Test
	public void testPersonsInformation() {
		Person person = new Person("first name", "last name", 0701111111, "my cool street");
		assertAll("person",
				() -> assertEquals("first name", person.getFirstname()),
				() -> assertEquals("last name", person.getLastname()),
				() -> assertEquals(0701111111, person.getPhonenumber()),
				() -> assertEquals("my cool street", person.getStreetaddress())
		);	
	}
	*/
	
	// Uppgift 4
	/*
	@Test
	public void TestingAsSimpleAsPossible() {
		System.out.println("Junit 5");
	}
	*/
	
	// Test passes even if there is no code at all in the statement - as long as there are no errors / fails.	
	// Changes: new test with string.length() method, changed name of method + camel case
	@Test
	@DisplayName("Test 4: string length")
	public void testStringLength() {
		String string = "JUnit 5";
		assertEquals(7, string.length());
		System.out.println(string.length());
	}
	
	// Uppgift 5
	/*
	public void GiveMeASimpleVerification2() {
		assertEquals(100, 100);
	}
	*/
	
	// Changes: added annotation @Test to pass the test, changed name of method + camel case	
	@Test
	@DisplayName("Test 5: compare integers")
	public void testCompareInt() {
		assertEquals(100, 100);
	}
	
	// Uppgift 6
	/*
	@Test
	public void CheckingSame() {
		String s1 = new String("S1");
		String s2 = new String("S1");
		assertSame(s1, s2);
	}
	*/
	
	// Test fails because this assertion asserts that two objects refer to the same object - and it's not true in this case.	
	// Changes: changed name of method + camel case, changed value of s2 to s2 = s1
	@Test
	@DisplayName("Test 6: compare strings")
	public void testCompareStrings() {
		String s1 = new String("S1");
		String s2 = s1;
		assertSame(s1, s2);
	}
	
	// Uppgift 7
	/*
	@Test
	public void CheckingBytes() {
		byte smallByte1 = 100;
		byte smallByte2 = smallByte1;
		assertEquals(smallByte1, smallByte2);
	}
	*/
	
	// Changes: changed name of method + camel case, changed assertion to assertTrue with == 	
	@Test
	@DisplayName("Test 7: compare bytes")
	public void testCompareBytes() {
		byte smallByte1 = 100;
		byte smallByte2 = smallByte1;
		assertTrue(smallByte1 == smallByte2);
	}
	
	// Uppgift 8 - missing
	
	// Uppgift 9
	/*
	@Test
	public void CheckingTrue() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		assertTrue(obj1 == obj2);
	}
	*/
	
	// Changes: changed name of method + camel case, changed value of obj2 to obj2 = obj1
	@Test
	@DisplayName("Test 9b: compare objects true 1")
	public void testCompareObjectsTrue() {
		Object obj1 = new Object();
		Object obj2 = obj1;
		assertTrue(obj1 == obj2);
	}
	
	// Alternative solution:
	// Changed assertion to assertFalse
	@Test
	@DisplayName("Test 9a: compare objects true 2")
	public void testCompareObjectsTrue2() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		assertFalse(obj1 == obj2);
	}
			
	// Uppgift 10
	/*
	@Test
	public void CheckingFalse() {
		Object obj1 = new Object()
		Object obj2 = new Object();
		assertFalse(obj1 != obj2)
	}
	*/
	
	// Changes: changed name of method + camel case, added missing semicolons, changed comparison operator != to: ==	
	@Test
	@DisplayName("Test 10a: compare objects false 1")
	public void testCompareObjectsFalse() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		assertFalse(obj1 == obj2);
	}
	
	// Alternative solution:
	// Changed assertion to assertTrue
	@Test
	@DisplayName("Test 10b: compare objects false 2")
	public void testCompareObjectsFalse2() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		assertTrue(obj1 != obj2);
	}
	
}
