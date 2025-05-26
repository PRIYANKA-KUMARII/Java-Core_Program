package HandlingArithmeticException;
public class ClassCastExceptionDemo {
	public static void  handleClassCastException() {
		try {
			 Object obj[]= {"Hello", true, "Java"};
			 
			 for(int i=0; i<obj.length;i++) {
				 String s= (String)obj[i];
				 System.out.println("Casting successful :"+s);
				 
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		handleClassCastException();
		
			
		}
}

	
	
	