package mar_29;

public class Demo {
	//global non-static variables
	int x,y,z;
	public void add()
	{
		x=123;
		y=321;
		z=x+y;
		System.out.println(z);
	}
	public void division()
	{
		x=34;
		y=2;
		z=x/y;
		System.out.println(z);
	}
	

	public static void main(String[] args) {
		//create reference object to call  non static methods
		Demo a = new Demo();
		a.add();
		a.division();

	}

}
