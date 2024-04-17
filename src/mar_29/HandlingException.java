package mar_29;

public class HandlingException {

	public static void main(String[] args) {
		//divide any number with zero
	   try{
		int x=234,y=0,z;
		z=x/y;
		System.out.println(z);
		}catch(Throwable t)
	   {
			System.out.println(t.getMessage());
	   }
		{
		int a=24,b=2,c;
		c=a/b;
		System.out.println(c);
		}
	}

}
