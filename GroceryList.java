package edu.ualbany.Project1;

import java.util.Random;

/**
 * Implementation of methods of GroceryInterface via linked list
 * @author Derren Lyons
 * @version 1.0
 */
public class GroceryList implements GroceryInterface {
	
	/**
	 * Defines Node to be used as the head of the linked list.
	 */
	private Node head;
	
	/**
	 * Declares integer variable to increment/decrement any time an object is added/subtracted from the bag.
	 */
	private int count;
	
	/**
	 * Creates an empty linked list.
	 */
	public GroceryList(){
		this.head = null;
		this.count = 0;
	}
	
	/**
	 * Checks how many items there are in this bag.
	 * @return An integer specifying the number of items in the bag.
	 */
	public int size(){
		return this.count;
	}
	
	/**
	 * Checks to see if this bag is empty.
	 * @return A boolean value 1 if empty 0 if not.
	 */
	public boolean isEmpty(){
		return this.count == 0;
	}
	
	/**
	 * Empties this bag.
	 * @throws GroceryListException if the size() is 0.
	 */
	public void makeEmpty() throws GroceryListException{
		if(this.size()==0){
			throw new GroceryListException("The bag is already empty");
		}
		if(this.size() != 0){
			this.head = null;
			this.count = 0;
		}
	}
	
	/**
	 * Gets a reference to an item at specific position index of this bag.
	 * @param index An integer number to find an item at that position in the list.
	 * @throws GroceryListIndexOutOfBoundsException if index < 0 or if index > size().
	 * @throws GroceryListException if size() is 0.
	 * @return The item stored at this index.
	 */
	public Object get(int index) throws GroceryListIndexOutOfBoundsException, GroceryListException{
		if(index < 0 || index > this.size()){
			throw new GroceryListIndexOutOfBoundsException("The index requested is not valid");
		}
		if(this.size() == 0){
			throw new GroceryListException("The bag is empty");
		}
		else{
			int i = 0;
			Node temp = this.head;
			while(i != index){
				i++;
				temp = temp.getNext();
			}
			return temp.getItem();
		}
	}
	
	/**
	 * Gets the index of the first occurrence of an item from this bag.
	 * @param item The item to look for in the bag.
	 * @return The index of the first occurrence of the item.
	 * @throws GroceryListException if there is no occurrence of the item in the bag.
	 */
	public int getIndex(Object item) throws GroceryListException{
		int index=-1;
		String itemName;
		Node temp = this.head;
		Object itemInBag;
		for(int i = 0; i < this.size(); i++){
			itemInBag = temp.getItem();
			itemName = itemInBag.toString();
			if(itemName.equals(item)){
				index = i;
				i=this.size();
			}
			temp = temp.getNext();
		}
		if(index == -1){
			throw new GroceryListException("There is no occurence of that item in this bag");
		}
		System.out.println(index);
		return index;
	}
	
	/**
	 * Inserts an item to the end of the list of this bag.
	 * @param item The item to be added to the list.
	 * @throws GroceryListIndexOutOfBoundsException if the size() is 100.
	 */
	public void insert(Object item) throws GroceryListIndexOutOfBoundsException{
		//if the bag is empty
		if(this.size() == 0){
			this.head = new Node(item,null);
		}
		//if the bag has only one item
		if(this.size() > 0 && this.size() < 2){
			this.head.setNext(new Node(item, null));
		}
		//if bag has more than one item
		if(this.size() > 1 && this.size() < 100){
			int i = 0;
			Node temp = this.head;
			while(i != this.size()-1){
				i++;
				temp = temp.getNext();
			}
			temp.setNext(new Node(item, null));
		}
		//if bag is full
		if(this.size() == 100){
			throw new GroceryListIndexOutOfBoundsException("The bag contains its max limit of 100 items");
		}
		this.count++;
	}
	
	/**
	 * Removes the last item in the bag.
	 * @throws GroceryListException if size() is 0.
	 */
	public void removelast() throws GroceryListException{
		//if bag is empty
		if(this.size() == 0){
			throw new GroceryListException("The bag is empty");
		}
		//if bag has only one item
		if(this.size() == 1){
			makeEmpty();
		}
		//if bag has two or more items
		if(this.size()>1){
			int i = 0;
			Node temp = this.head;
			while(i != this.size()-2){
				i++;
				temp = temp.getNext();
			}
			temp.setNext(null);
		}
		this.count--;
		}
	
	/**
	 * Removes a random item in the bag.
	 * @throws GroceryListException if size() is 0.
	 */
	public void removeRandom() throws GroceryListException{
		//If the bag is empty.
		if(this.size() == 0){
			throw new GroceryListException("The bag is empty.");
		}
		//If there is only one item in the list.
		if(this.size() == 1){
			this.makeEmpty();
		}
		
		//Generates a random number between 0 and the size of the list.
		Random rand = new Random();
		int index = rand.nextInt(this.size());
		//If index is 0 remove first node in the list.
		if(index == 0 && this.size() != 1){
			Node temp = this.head;
			this.head = this.head.getNext();
			temp.setNext(null);
		}
		//If index > 0 && index < the current size of the bag remove a node in the middle.
		if(index > 0 && index < this.size() && this.size() != 1){
			int i = 0;
			int j = 0;
			Node temp = this.head;
			Node temp2;
			//Create a reference to the nodes predecessor.
			while(i != index-1){
				i++;
				temp = temp.getNext();
			}
			//Create a reference to the node to be removed.
			temp2 = this.head;
			while(j != index){
				j++;
				temp2 = temp.getNext();
			}
			temp.setNext(temp2.getNext());
			temp2.setNext(null);
		}
		//If index is equal to the size of the list remove the last node.
		if(index == this.size()){
			this.removelast();
		}
		this.count--;
	}
	}