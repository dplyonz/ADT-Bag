package edu.ualbany.Project1;

/**
 * Definition and implementation of Node for linked list GroceryList.
 * @author Derren Lyons
 * @version 1.0
 */
public class Node {
	
	/**
	 * Declares an object to be stored into the node.
	 */
	private Object item;
	
	/**
     * Declares next node to be used in the linked list.
	 */
	private Node next;
	
	/**
	 * Constructs a newly created Node that represents a Node with two null values.
	 */
	public Node(){
		this(null,null);
	}
	
	/**
	 * Constructs a newly created Node with an Object passed in and another Node to be linked in the list.
	 * @param item The Object to be passed into the Node.
	 * @param next The next Node to be linked in the list.
	 */
	public Node(Object item, Node next){
		this.item = item;
		this.next = next;
	}
	
	/**
	 * Gets the data stored at this node.
	 * @return The item at this node.
	 */
	public Object getItem(){
		return this.item;
	}
	
	/**
	 * Sets the item stored at this node.
	 * @param item The data to be stored at this node.
	 */
	public void setItem(Object item){
		this.item = item;
	}
	
	/**
	 * Gets the next node linked in the list.
	 * @return Reference to the node following the current node.
	 */
	public Node getNext(){
		return this.next;
	}
	
	/**
	 * Sets the next node to be linked in the list.
	 * @param next The next node to be linked in the list.
	 */
	public void setNext(Node next){
		this.next = next;
	}
	
	
	

}
