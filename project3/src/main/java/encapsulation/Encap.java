package encapsulation;

public class Encap {

	public static void main(String[] args) {
		Encapclass obj = new Encapclass();
		obj.set_method("sid",123);
		System.out.println(obj.get_method());
		System.out.println(obj.get_method1());

	}

}
