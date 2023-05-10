package Day4.enumswitch;

public class Calculators {
	
	public static void main(String[]args) {
		Operations operations = Operations.DIVISION;
		switch(operations) {

		case ADD:
			System.out.println("Adding");
			break;
		case SUBTRACT:
			System.out.println("Subtracting");
			break;
		case MULTIPLY:
			System.out.println("Multiplying");
			break;
		case DIVISION:
			System.out.println("dividing");
			break;
		default:
			System.out.println("Not in the list provided");
			break;

		}
	}

}
