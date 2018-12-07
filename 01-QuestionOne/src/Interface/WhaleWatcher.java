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
		
	}
	
	
	//Method to display all the whales in the array list
	public static void displayWhale() {
		
		for(Whale w:whales) {
			System.out.println("-----------------------------------");
	        System.out.println("Whale Name   :" + w.getName());
	        System.out.println("Main Ocean   :" + w.getMainOcean());
	        System.out.println("Weight (tonnes :)" + w.getWeight());
	        System.out.println("Max Speed    :" + w.getMaxSpeed());
	        System.out.println("Length       :" + w.getLength());
	        System.out.println("-----------------------------------");
        }
		
	}
	
	

}
