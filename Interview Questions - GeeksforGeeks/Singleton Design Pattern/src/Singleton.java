
public class Singleton {

	public static void main(String[] args) {
		Abc obj1 = Abc.getInstance();
	    Abc obj2 = Abc.obj;
	}

}

class Abc
{
    public static Abc obj = new Abc();
	
	private Abc()
	{
		System.out.println("Instance created!");
	}
	
	public static Abc getInstance()
	{
		return obj;
	}
}
