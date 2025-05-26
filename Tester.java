package HandlingArrayException;

public class Tester {

	public static void main(String[] args) throws ClassNotFoundException {

        ParentClass p=new ChildClass();
        if(args.length ==0) {
        	System.out.println("ClassNot found");
        	return;
        }
        p.loadingClass(args[0]);
	}

}
