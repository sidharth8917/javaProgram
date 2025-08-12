package agrregationExample;

public class Student {
	int student_id;
	String student_name;
	
	Student(int student_id, String student_name )
	{
		this.student_id=student_id;
		this.student_name=student_name;
	}
public void displayInfo()
{
	System.out.println("The student details are:");
	System.out.println("student_id" + student_id);
	System.out.println("student_name"+ student_name);
}
}
