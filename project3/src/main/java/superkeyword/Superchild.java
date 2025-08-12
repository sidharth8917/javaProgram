package superkeyword;

public class Superchild extends Superpaaent{
	int a=2;
	public void display()
	{
		System.out.println(a);
		System.out.println(super.a);
		
	}
	public static void main(String[] args) {
		Superchild obj = new Superchild();
		obj.display();

	}

}
