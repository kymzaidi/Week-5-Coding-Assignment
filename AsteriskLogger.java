package Week5CodingAssignment;

public class AsteriskLogger implements Logger {

	

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		System.out.println("*** " + log + " ***");
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		int boxLength = error.length() + 10;
		System.out.println("*".repeat(boxLength));		
		System.out.println("*** ERROR: " + error + " ***");
		System.out.println("*".repeat(boxLength));
		
	}

}

