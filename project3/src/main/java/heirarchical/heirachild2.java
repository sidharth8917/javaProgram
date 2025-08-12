package heirarchical;

public class heirachild2 extends hieraparent{
	public void heiramethod3() {
		System.out.println("daughter");
	}

public static void main (String args[]) {
	heirachild2 obj =new heirachild2 ();
	heirachild1 objj = new heirachild1();
	obj.hieramethod1();
	obj.heiramethod3();
	objj.heiramethod2();
}
}
