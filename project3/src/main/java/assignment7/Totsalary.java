package assignment7;

public class Totsalary extends Calculatehrapf{
	double totalsalary;
	public void saltotal() {
	 totalsalary=basic_pay+hra+bonus-pf-deduction;
	}
	public void salary_slip() {
		System.out.println("basic pay:"+" " + basic_pay);
		System.out.println("deduction:"+" " +deduction);
		System.out.println("hra:"+" " +hra);
		System.out.println("pf:"+" " +pf);
		System.out.println("bonus:"+" " +bonus);
		System.out.println("total salary by hand:"+" "+totalsalary);
	}

	public static void main(String[] args) {
		Totsalary obj = new Totsalary ();
		obj.Calculate();
		obj.saltotal();
		obj.salary_slip();

	}

}
