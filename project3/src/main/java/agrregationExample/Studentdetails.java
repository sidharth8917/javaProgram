package agrregationExample;

public class Studentdetails {
	String place;
	String country;
	
	Student obj;//agrregate
	
	Studentdetails(String place ,String country, Student obj)
	{
		this.place=place;
		this.country=country;
		this.obj=obj;
	}
	public void display()
	{
		System.out.println("adress");
		System.out.println("place" + place);
		System.out.println("country"+ country);
		obj.displayInfo();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s= new Student(100,"sidharth");
Studentdetails details = new Studentdetails("pta","india",s);
details.display();
	}

}
