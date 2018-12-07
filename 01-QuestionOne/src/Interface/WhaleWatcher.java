package Interface;

import java.util.ArrayList;

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
		
		displayWhale();
		//atlanticWhales();
		
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
	
	

}
