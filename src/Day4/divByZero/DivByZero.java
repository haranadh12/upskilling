package Day4.divByZero;

public class DivByZero {
	
	public static void main(String[]args) {
		int a = 11;
		
		try {
			int b=a/0;
			System.out.println(b);
		}
		catch(Exception e){
			System.out.println("pakkakelli aaduko " +e);
			
		}
	}

}
