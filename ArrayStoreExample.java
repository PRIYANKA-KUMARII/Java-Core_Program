package HandlingArrayException;

public class ArrayStoreExample {
	public static void  storeObjects() {

		Object obj[]=new Object[5];
		obj[0]="Hello";
		obj[1]="World";
		obj[2]=123;		
		String str[]=new String[5];
		for(int j=0;j<obj.length;j++)
		{
			for(int i=0;i<str.length;i++)
			{try {
				if(obj[j] instanceof String)
				{
					str[i]=(String)obj[j];
					System.out.println(str[i]);
				}
				else {
					throw new ArrayStoreException();
				}
			}
			catch (ArrayStoreException e) {
				System.out.println("ArrayStoreException occur");
			}	
			break;
			}
		}

	}
	public static void main(String[] args) {
		storeObjects();
	}

}
