package polymorphism;

public class Compiletime {
	public void Compiletime() {
		System.out.println("hello");
	}
	public void Compiletime(int id ,int age) {
		System.out.println("id:"+ id );
		System.out.println("age:"+age);
	}
	public void Compiletime(long num ,String name)
	{
		System.out.println("num:"+num);
		System.out.println("name:"+name);
	}

	public static void main(String[] args) {
		Compiletime c = new Compiletime();
		c.Compiletime();
		c.Compiletime(4,20);
		c.Compiletime(86745357,"sid");
	}

}
