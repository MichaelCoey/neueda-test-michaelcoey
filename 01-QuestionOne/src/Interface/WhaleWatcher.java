package Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Classes.Whale;

public class WhaleWatcher {
	
	//Creating the whale array
	static ArrayList<Whale> whales = new ArrayList<Whale>();

	public static void main(String[] args) {

		//Storing the information to the ArrayList
		whales.add(new Whale("Right", "Atlantic", 2001, 21, 16));
		whales.add(new Whale("Blue", "Pacific", 2001, 23, 20));
		whales.add(new Whale("Sperm", "Atlantic", 1900, 20, 40));
		whales.add(new Whale("Humpback", "Antartic", 919, 13, 13));
		
		//Please uncomment the code below to run the method you would like.
		
		//displayWhale();
		atlanticWhales();
		//fastWhales();				--Work in progress
		//averageLengthWhales();	--Work in progress
		//heaviestWhales();			--Work in progress
		
		
		
	}
	
	
	//Method to display all the whales in the array list
	public static void displayWhale() {
		
		for(Whale w:whales) {
			
			w.displayWhale();
			
        }
		
	}
	
	//Method to display Atlantic Whales
	public static void atlanticWhales() {
		
		for(Whale w:whales) {

			w.displayAtlantic();

        }

	}
	
	//Method to display Fast whales
	public static void fastWhales() {
		
		for(Whale w:whales) {
			
			//Works but outputs the one whale and outputs 4 times (due to comparing to the array size)
			w =  Collections.max(whales, Comparator.comparing(ws -> ws.getMaxSpeed()));
			System.out.println("The fastest whale is : " + w.getName());
        }

	}
	
	//Method to display average length whales
	public static void averageLengthWhales() {
		
		//W.I.P
		//I need to pull out the length value for each whale in the array and divide by the number of whales currently in the arraylist

	}
	
	//Method to display heaviest whales
	public static void heaviestWhales() {
		
		//W.I.P
		//I need to do the same with the length and pull out the largest length of the whale in the arraylist.

	}

	
	

}
