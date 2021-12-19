package edu.ualbany.Project1;

/**
 * Define subclass of IndexOutOfBoundsException.
 * @author Derren Lyons
 * @version 1.0
 */
public class GroceryListIndexOutOfBoundsException extends IndexOutOfBoundsException{
	
	/**
	 * If index value for ADT bag is out of range, throw this exception.
	 * @param message String that identifies the reason of the exception being thrown.
	 */
	public GroceryListIndexOutOfBoundsException(String message){
		super(message);
	}

}
