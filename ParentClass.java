package HandlingArrayException;

public class ParentClass {
	public void   loadingClass(String str)throws ClassNotFoundException {
		
		Class.forName(str);
	
		
	}

}

class ChildClass extends ParentClass{
	
	public void loadingClass(String str) {
		
		if(str==null||str.isEmpty()) {
			throw new IllegalArgumentException("Class name cannot be empty");
		}
		
		try {
			super.loadingClass(str);
			System.out.println("Class loading success");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Error : Class not found : " +str);
//		catch(IllegalArgumentException e) {
//			e.printStackTrace();
		}
	}
