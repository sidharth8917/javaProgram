package supermethod;

public class Supermethodchild extends Supermethodparent {
	public void display() {
		System.out.println("hello");
		super.display();
	}

	public static void main(String[] args) {
		Supermethodchild obj = new Supermethodchild();
		obj.display();

	}

}
