package edu.ualbany.Project1;

/**
 * Interface to be implemented by GroceryList and the methods to be included in this interface.
 * @author Derren Lyons
 * @version 1.0
 */
public interface GroceryInterface {
	
	/**
	 * Inserts an item to the end of the list of this bag.
	 * @param item The item to be added to the list.
	 * @throws GroceryListIndexOutOfBoundsException if the size() is 100.
	 */
	public void insert(Object item) throws GroceryListIndexOutOfBoundsException;
	
	/**
	 * Removes the last item in the bag.
	 * @throws GroceryListException if size() is 0.
	 */
	public void removelast() throws GroceryListException;
	
	/**
	 * Removes a random item in the bag.
	 * @throws GroceryListException if size() is 0.
	 */
	public void removeRandom() throws GroceryListException;
	
	/**
	 * Gets the index of the first occurrence of an item from this bag.
	 * @param item The item to look for in the bag.
	 * @return The index of the first occurrence of the item.
	 * @throws GroceryListException if there is no occurrence of the item in the bag.
	 */
	public int getIndex(Object item) throws GroceryListException;
	
	/**
	 * Gets a reference to an item at specific position index of this bag.
	 * @param index An integer number to find an item at that position in the list.
	 * @throws GroceryListIndexOutOfBoundsException if index < 0 or if index > size().
	 * @throws GroceryListException if size() is 0.
	 * @return The item stored at this index.
	 */
	public Object get(int index) throws GroceryListIndexOutOfBoundsException, GroceryListException;
	
	/**
	 * Checks how many items there are in this bag.
	 * @return An integer specifying the number of items in the bag.
	 */
	public int size();
	
	/**
	 * Checks to see if this bag is empty.
	 * @return A boolean value 1 if empty 0 if not.
	 */
	public boolean isEmpty();
	
	/**
	 * Empties this bag.
	 * @throws GroceryListException if the size() is 0.
	 */
	public void makeEmpty() throws GroceryListException;

}
