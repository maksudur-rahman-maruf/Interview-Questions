package runnable;

class MyClass implements Runnable
{
	
	public void run()
	{
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		    for(int i=0; i < 1000000; i++) {

		    

		    }

		endTime = System.currentTimeMillis();

		long timeneeded =  ((startTime - endTime) /1000);
		System.out.println(timeneeded);
	}
	
}

public class Demo {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyClass());
		Thread t2 = new Thread(new MyClass());
		t1.start();
		//t2.start();

	}

}
