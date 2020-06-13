import java.util.LinkedList;

public class ThreadExample {
	public static void main(String[] args) throws InterruptedException {
		PC pc = new PC();
		
		// Create producer thread
		Thread t1 = new Thread(new Runnable()
				{

					@Override
					public void run() {
						try {
							pc.produce();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
			
				});
		
		// Create Consumer Thread
		Thread t2 = new Thread(new Runnable()
				{

					@Override
					public void run() {
						try {
							pc.consume();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
			
				});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("lol");
		
	}

}

class PC
{
	LinkedList<Integer> list = new LinkedList<Integer>();
	int limit = 2;
	
	public void produce() throws InterruptedException
	{
		int value = 0;
		while(true)
		{
			synchronized(this)
			{
				while(list.size() == limit)  // here if valid too
					wait();
				
				System.out.println("Producer produced-" + value);
				
				list.add(value++);
				
				notify();
				
				Thread.sleep(1000);
			}
		}
	}
	
	public void consume() throws InterruptedException
	{
		while(true)
		{
			synchronized(this)
			{
				while(list.size() == 0) // here if valid too
					wait();
				
				int val =  list.removeFirst();
				
				System.out.println("Consumer consumed-" + val);
				
				notify();
				
				Thread.sleep(1000);
			}
		}
		
	}
}
