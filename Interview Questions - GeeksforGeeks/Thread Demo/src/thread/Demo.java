package thread;

class MyClass extends Thread
{
	public void run() {
		for(int i=1; i<=10; i++)
		{
			System.out.println(Thread.currentThread().getId() + " Value :" + i);
			
		}
	}
}

public class Demo {

	public static void main(String[] args) {
		MyClass t1 = new MyClass();
		t1.start();
		MyClass t2 = new MyClass();
		t2.start();
		

	}

}
