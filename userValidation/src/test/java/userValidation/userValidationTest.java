/**
 * 
 */
package userValidation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 
 */
public class userValidationTest {
	private userValidation user;
	@BeforeEach()
	void setUp()
	{
		user=new userValidation();
	}
	@Test
	@DisplayName("Check weather it is valid username or not")
	void testValidUsername()
	{
		assertTrue(user.validUsername("madhan123"));
	}
	
	@Test
	@DisplayName("Test username with special characters")
	void testWithSpecialCharacters() {
		assertFalse(user.validUsername("mad@123"));
	}
	
	@Test
	@DisplayName("Test username shorter than minimum length")
	void testUsernameShorterName() {
		assertFalse(user.validUsername("mad"));
	}
	
	@Test
	@DisplayName("Test username withempty")
	void testUsernameEmpty() {
		assertFalse(user.validUsername(""));
	}
	
	@Test
	@DisplayName("Test username with null")
	void testUsernameWithNull() {
		assertFalse(user.validUsername(null));
	}
	
	@Test
	@DisplayName("Check weather the user and password is valid")
	void TestUsernameAndPassword()
	{
		assertTrue(user.validLogin("madhan123","Mad@12345"));
	}
}
