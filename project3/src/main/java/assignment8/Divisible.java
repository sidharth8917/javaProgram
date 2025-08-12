package assignment8;

public class Divisible extends Addition_result{
	public void Check_divisible(int a ,int b) {
		int sum = this.num(a, b);
		if(sum%10==0) {
		System.out.println("Addition result is divisible by 10");	
		}
		else {
			System.out.println("addition result is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		Divisible obj = new Divisible();
		obj.Check_divisible(23, 14);
		obj.Check_divisible(20, 10);
				

	}

}
