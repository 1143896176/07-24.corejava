package “Ï≥£.thro;

public class OracleConnection {
	
	
	public static void main(String[] args) {
		
		try {
			createConnection();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (NullPointerException e) {
		
			e.printStackTrace();
		}
		
	}
	

	public static void createConnection() throws ClassNotFoundException , NullPointerException {
		// º”‘ÿ«˝∂Ø 
		Class.forName("com.oracle.jdbc.Drivers");

	}

}
