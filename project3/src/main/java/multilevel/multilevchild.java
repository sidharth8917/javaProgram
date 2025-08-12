package multilevel;

public class multilevchild extends multilevinter{
	public void multimethod3()
	{
		System.out.println("child");
	}
	public static void main(String[] args) {
		multilevchild obj = new multilevchild();
		obj.multimethod1();
		obj.multimethod2();
		obj.multimethod3();
	}
}

