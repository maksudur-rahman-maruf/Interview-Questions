package double_checking_lock;

public class SingletonDemo {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable()
				{

					@Override
					public void run() {
						ABC obj = ABC.getInstance();
						
					}
			
				});
		
		Thread t2 = new Thread(new Runnable()
		{

			@Override
			public void run() {
				ABC obj = ABC.getInstance();
				
			}
	
		});
		
		t1.start();
		t2.start();
		
	}

}

class ABC
{
	public static ABC obj;
	
	private ABC()
	{
		System.out.println("Instance created!");
	}
	
	public static ABC getInstance()   // Using Synchronized or Thread.sleep are also valid in this case
	{
		if(obj == null)
		{
			synchronized(ABC.class)
			{
				if(obj == null)
				obj = new ABC();
			}
			
		}
		return obj;
	}
}
