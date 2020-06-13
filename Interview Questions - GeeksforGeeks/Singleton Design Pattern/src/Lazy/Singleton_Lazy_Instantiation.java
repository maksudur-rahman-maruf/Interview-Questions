package Lazy;

public class Singleton_Lazy_Instantiation {

	public static void main(String[] args) {
		ABC obj1 = ABC.getInstance();
		ABC obj2 = ABC.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);

	}

}

class ABC
{
	public static ABC obj;
	
	private ABC()
	{
		System.out.println("Instance created!");
	}
	
	public static ABC getInstance()
	{
		if(obj == null)
		{
			obj = new ABC();
		}
		return obj;
	}
}