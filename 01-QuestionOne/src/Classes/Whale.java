package Classes;

import java.util.Collections;
import java.util.Comparator;

public class Whale extends Animal {
	
	private String mainOcean;
	private int weight;
	private int maxSpeed;
	private int length;
	
	public Whale() {
		super();
	}

	public Whale(String name, String mainOcean, int weight, int maxSpeed, int length) {
		super(name);
		this.mainOcean = mainOcean;
		this.weight = weight;
		this.maxSpeed = maxSpeed;
		this.length = length;
	}

	public String getMainOcean() {
		return mainOcean;
	}

	public void setMainOcean(String mainOcean) {
		this.mainOcean = mainOcean;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	//Method to display whale class
    public void displayWhale()
    {
    	System.out.println("------------------------------------");
        System.out.println("Whale Name   :" + this.getName());
        System.out.println("Main Ocean   :" + this.getMainOcean());
        System.out.println("Weight (tonnes :)" + this.getWeight());
        System.out.println("Max Speed    :" + this.getMaxSpeed());
        System.out.println("Length       :" + this.getLength());
        System.out.println("------------------------------------");

    }
    
    //Method to display the Whales in the Atlantic
    public void displayAtlantic() {
    	
    	if(this.getMainOcean() == "Atlantic") {
    		System.out.println("------------------------------------");
            System.out.println("Whale Name   :" + this.getName());
            System.out.println("Main Ocean   :" + this.getMainOcean());
            System.out.println("Weight (tonnes :)" + this.getWeight());
            System.out.println("Max Speed    :" + this.getMaxSpeed());
            System.out.println("Length       :" + this.getLength());
            System.out.println("------------------------------------");
    	}
    	
    }
    
    //Method to display the Fast whales
    public void displayFastest() {
    	
    	
    	//W.I.P
    	//I need to pull the value out of the array for max speed using the Collections.max
//    	if() {
//    		System.out.println("------------------------------------");
//            System.out.println("Whale Name   :" + this.getName());
//            System.out.println("Main Ocean   :" + this.getMainOcean());
//            System.out.println("Weight (tonnes :)" + this.getWeight());
//            System.out.println("Max Speed    :" + this.getMaxSpeed());
//            System.out.println("Length       :" + this.getLength());
//            System.out.println("------------------------------------");
//    	}
    	
    }
    
    //Method to display the average length of whales
    public void displayAverageLengthWhale() {
    	
    	//W.I.P
    	
    }
    
    //Method to display the heaviest whales
    public void displayHeaviestWhale() {
    	
    	//W.I.P
    	
    }
}
