package Week5CodingAssignment;

public class SpacedLogger implements Logger {
	
	

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			sb.append(log.charAt(i)).append(" ");
		}
		System.out.println(sb.toString().trim());
		
	}

	@Override
	public void error(String error) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			sb.append(error.charAt(i)).append(" ");
		}
		System.out.println("ERROR: " + sb.toString().trim());
		
	}

}
