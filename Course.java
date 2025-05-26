package MultiThreading_Scenario_Array_1May;

public class Course {
	int courseId;
	String courseName;
	double courseFee;
	public Course(int courseId, String courseName, double courseFee) {
		super();
		this.courseId= courseId;
		this.courseName=courseName;
		this.courseFee=courseFee;
	}
		public int getCourseId() {
	        return courseId;
	    }
		public String getcourseName() {
			return courseName;
			}
		public double getcourseFee() {
			return courseFee;
		}
		@Override
		public String toString() {
			return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFee=" + courseFee + "]";
		}
}
class Offer{
String offerText;
public Offer(String offerText) {
	this.offerText= offerText;
}
public String getofferText() {
	return offerText;	
}
@Override
public String toString() {
	return "Offer [offerText=" + offerText + "]";
}

}
class EducationInstitute{
	Course[] course;
	Offer[] offer;
	public EducationInstitute(Course[] course, Offer[] offer) {
		super();
		this.course = course;
		this.offer = offer;
	}
	public Course[] getCourse() {
		 return course;
	}
	public Offer[] getOffer() { 
		 return offer;
	}
	public  void enrollStudent( int courseId, String studentname) {
		for(Course courses:course)
		{
			if(courses.getCourseId()==courseId)
			{
				System.out.println(studentname+" enrolled in the course"+courses.getcourseName());
				return;
			}
		}
		System.out.println("Invalid course id..");
	} 
	
}
class Student {
	String name;
	EducationInstitute institute;
	public Student(String name, EducationInstitute institute) {
		this.name=name;
	this. institute= institute;
	}
	public void viewCourseAdd() {
		Course[] courses=  institute.getCourse();
		System.out.println("Available course.");
		for(Course course:courses) {
			System.out.println(courseI.getCourse()+" ."+coursegetCourseName()+"-Fee Rs.");
			}
		
	}
}
