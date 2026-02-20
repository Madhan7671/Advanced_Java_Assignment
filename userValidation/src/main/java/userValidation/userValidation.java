/**
 * 
 */
package userValidation;

/**
 * 
 */
public class userValidation {
	boolean validUsername(String name)
	{
		if(name==null || !name.matches("[a-zA-Z0-9]+") || name.isEmpty() || name.length()<5 ||  name.length()>15)
		{
			return false;
		}
		return true;
	}
	boolean validPassword(String password)
	{
		if(password==null || password.length()<8 || password.isEmpty())
		{
			return false;
		}
		boolean hasLetter=password.matches(".*[a-zA-Z].*");
		boolean hasDigit=password.matches(".*[0-9].*");
		boolean hasAlpha=password.matches(".*[!@#$%&*].*");
		return hasLetter && hasDigit && hasAlpha;
	}
	boolean validLogin(String name,String password)
	{
		return(validPassword(password) && validUsername(name));
	}
}
