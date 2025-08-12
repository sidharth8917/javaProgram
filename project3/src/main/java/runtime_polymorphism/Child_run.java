package runtime_polymorphism;

public class Child_run extends Parent_run {
	public void method1() {
		System.out.println("sidharth");
	}

	public static void main(String[] args) {
		
		Child_run obj = new Child_run();
		obj.method1();
		Parent_run objj = new Child_run();
		objj.method1();

	}

}
