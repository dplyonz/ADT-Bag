package edu.ualbany.Project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Class to test design of the ADT list.
 * @author Derren Lyons
 * @version 1.0
 */
public class Helper {
	
	
	public static void start() throws FileNotFoundException{
		//Creates a newly constructed grocery bag.
		GroceryList bag = new GroceryList();
	
		create(bag);
		display(bag);
		System.out.println("--------------------------------------------");
		System.out.println("Current size of bag");
		sizeOf(bag);
		System.out.println("--------------------------------------------");
		System.out.println("Removing last item in the list");
		removeLast(bag);
		display(bag);
		System.out.println("--------------------------------------------");
		System.out.println("Current size of bag");
		sizeOf(bag);
		System.out.println("--------------------------------------------");
		System.out.println("Removing random item in the list");
		removeRandomItem(bag);
		display(bag);
		System.out.println("--------------------------------------------");
		System.out.println("Current size of bag");
		sizeOf(bag);
		System.out.println("--------------------------------------------");
		System.out.println("Getting the tenth item in the list");
		getItem(bag, 9);
		System.out.println("--------------------------------------------");
		System.out.println("Getting the third item in the list");
		getItem(bag, 3);
		System.out.println("--------------------------------------------");
		System.out.println("Getting index of first occurence of eraser in the list");
		getIndexofItem(bag, "cup");
		System.out.println("--------------------------------------------");
		System.out.println("Inserting yarn to the end of the list");
		insertItem(bag, "yarn");
		display(bag);
		System.out.println("--------------------------------------------");
		System.out.println("Current size of bag");
		sizeOf(bag);
		System.out.println("--------------------------------------------");
		System.out.println("Emptying bag");
		empty(bag);
		System.out.println("--------------------------------------------");
		System.out.println("Is the bag empty? (T/F)");
		isEmpty(bag);
		System.out.println("--------------------------------------------");
		System.out.println("Current size of bag");
		sizeOf(bag);
		}
	
	/**
	 * Fills the ADT list.
	 * @param bag The ADT list to be filled.
	 */
	private static void create(GroceryList bag) throws FileNotFoundException{
		Scanner scanner = new Scanner(new File("GroceryItems.txt"));
		int i = 0;
		while(i!=100){
			bag.insert(scanner.next());
			i++;
		}
		scanner.close();
	}
	
	/**
	 * Displays the contents of the bag.
	 * @param bag The ADT list to be displayed.
	 */
	private static void display(GroceryList bag){
		   for(int i = 0; i < bag.size(); i++){
			   System.out.println(bag.get(i));
		   }
		}
	
	/**
	 * Display how many items there currently are in the bag.
	 * @param bag The ADT list to be counted.
	 * @return The number of items in the bag.
	 */
	private static void sizeOf(GroceryList bag){
		int size = bag.size();
		System.out.println(size);
	}

	/**
	 * Removes the last item in the bag.
	 * @param bag The ADT list to be subtracted.
	 */
	private static void removeLast(GroceryList bag){
		bag.removelast();
	}

	/**
	 * Removes a random item from the bag.
	 * @param bag The ADT list to be subtracted.
	 */
	private static void removeRandomItem(GroceryList bag){
		bag.removeRandom();
	}
	
	/**
	 * Gets the item stored at a specified index.
	 * @param bag The ADT list to be traversed.
	 * @param index The data stored at this specified index will be displayed.
	 */
	private static Object getItem(GroceryList bag, int index){
		Object item = bag.get(index);
		System.out.println(item);
		return item;
	}
	
	/**
	 * Gets the index of the first occurrence of that item in the bag.
	 * @param bag The ADT list to be traversed.
	 * @param item The item to be searched for in the bag.
	 */
	private static void getIndexofItem(GroceryList bag, Object item){
		bag.getIndex(item);
	}
	
	/**
	 * Inserts an item to the end of the bag.
	 * @param bag The ADT list to added to.
	 * @param item The item to be added into the bag.
	 */
	private static void insertItem(GroceryList bag, String item){
		bag.insert(item);
	}
	
	/**
	 * Empties the bag.
	 * @param bag The ADT list to be emptied.
	 */
	private static void empty(GroceryList bag){
		bag.makeEmpty();
	}
	
	/**
	 * Checks to see if the bag is empty.
	 * @param bag The ADT list to be checked.
	 */
	private static void isEmpty(GroceryList bag){
		boolean isEmpty;
		isEmpty = bag.isEmpty();
		System.out.println(isEmpty);
	}
	
}
