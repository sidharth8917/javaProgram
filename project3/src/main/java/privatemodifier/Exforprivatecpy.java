package privatemodifier;

public class Exforprivatecpy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exforprivate obj = new Exforprivate();
		//obj.displayInfo();-error; not accessible due to access modifier as "private" can't be accessed outside the class
		obj.welcomemsg();
	}

}
