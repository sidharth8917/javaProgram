package inheritance;

public class singleinheritancechild extends singleinheritanceparent {
public void displayInfo()
{
	System.out.println("hello");
}
public static void main(String args[]) {
	singleinheritancechild obj =new singleinheritancechild();
	obj.display();
	obj.displayInfo();
}
}
