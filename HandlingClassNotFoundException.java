package HandlingArithmeticException;
import java.util.Scanner;
public class HandlingClassNotFoundException {
	public static void  ClassNotFoundException( String className) {
		Class<?>cls;
		try {
			cls= Class.forName(className);
			System.out.println("Class'"+className+"'loaded successfull: "+cls.getName());
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class not found:"+className);
			e.printStackTrace();
		}
		}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the fully qualified name to load:");
		String className= sc.nextLine();
		new ClassNotFoundException(className);
		sc.close();
	}

}
