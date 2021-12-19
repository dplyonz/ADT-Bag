package edu.ualbany.Project1;

/**
 * Define subclass of java.lang.runtime exception.
 * @author Derren Lyons
 * @version 1.0
 */
public class GroceryListException extends java.lang.RuntimeException{

	/**
	 * Defines an exception to be thrown if there is an attempt to add to a full bag or subtract from an empty bag.
	 * @param message A message that defines why the exception is being thrown.
	 */
	public GroceryListException(String message){
		super(message);
	}

}
