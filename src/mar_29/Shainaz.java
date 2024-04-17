package mar_29;

public class Shainaz {
	public static void addition(int a,int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	public static String verify_String(String str1,String str2)
	{
		String res;
		if(str1.equalsIgnoreCase(str2))
		{
			res="Both strings are equal";
		}
		else
		{
			res="Both strings are not equal";
		}
		return res;
	}
		public static boolean compare_values(int x , int y)
		{
			if(x==y)
			{
				return true;
		}
			else 
			{
				
			}
			return false;
		
	}

	public static void main(String[] args) {
		Shainaz.addition(123, 345);
		String q= Shainaz.verify_String("hello", "hello");
		System.out.println(q);
		boolean w= Shainaz.compare_values(10, 10);
		System.out.println(w);

	}

}
