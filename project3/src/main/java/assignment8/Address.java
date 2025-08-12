package assignment8;

public class Address  {
	String address;
	Student obj;
	public  Address(String address,Student obj ) {
		this.address=address;
		this.obj=obj;
	}
	
	public String  get_address() {
		return address;
	}
	public void print() {
		System.out.println("Student name:"+ "" + obj.getname());
		System.out.println("Rollno:"+ "" + obj.getrollno());
		System.out.println("Address:"+"" + address);
	}
	public static void main(String[] args) {
		Student s = new Student("Sidhardh",109);
		Address a = new Address("PATHANAMTHITTA ,KERALA",s);
		a.print();
		
						
		
		
		
		
		

	}

}
