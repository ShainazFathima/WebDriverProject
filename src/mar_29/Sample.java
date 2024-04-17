package mar_29;

public class Sample {
//global static variables
 static int x,y,z;
 public static void mul()
 {
	 x=23;
	 y=3;
	 z=x*y;
	 System.out.println(z);
 }
 public static void sub()
 {
	 x=54;
	 y=2;
	 z=x-y;
	 System.out.println(z);
 }
	public static void main(String[] args) {
		Sample.mul();
		Sample.sub();
	}

}
