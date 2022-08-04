package week6JavaFinalCodingProject;

public class Card {
	
	// fields for card
	private static int value;
	private static String name;
	
	
	// methods for card
	public static int getValue() {
		return value;
	}

	public static void setValue(int value) {
		Card.value = value;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Card.name = name;
	}
	

}
