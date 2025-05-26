package MultiThreading_Scenario_Array_1May;

public class Main {
public static void main(String[] args) {
//	Thread1 student= new Thread();
	
	 Course [] course= {new Course(1,"Math",2000),
	                      new Course(2, "Science", 3000)};
	 
	 Offer []offer= {new Offer("def"),      
			        new Offer("Chem")};
	 }
	 
	 EducationInstitute institute=new EducationInstitute(courses, Offers);
	 Student s1= new Student("Virat", institute);
	 Student s2= new
			 Thread th1= new Thread(() -> {
				 s1.viewCourseAndFee();
				 s1.viewOffer();
				 s1.enrollInCourse(1);
			 });
	 Thread th2= new Thread(() ->{
		 
	 Course result[]= institute.getCourse();
	   for(int i=0;i<result.length;i++) {
		    System.out.println(result[i]);
	   }
	   
	   System.out.println("------------------------------");
	   
	  Offer result1[]= institute.getOffer();
	  for(int i=0;i<result1.length;i++) {
		    System.out.println(result1[i]);
	   }
}
}
