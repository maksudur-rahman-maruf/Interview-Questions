package example1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable {
	int a;
	String b;

	Demo(int a, String b) {
		this.a = a;
		this.b = b;
	}
}

public class Test {

	public static void main(String[] args) {
		Demo object = new Demo(1, "GeeksforGeeks");
		String filename = "file1.txt";

		// Serialization
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(object);

			out.close();
			file.close();

			System.out.println("Object has been serialized");

		} catch (IOException e) {
			e.printStackTrace();
		}

		// DeSerialization
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			Demo object1 = (Demo) in.readObject();
			
			file.close();
			in.close();
			
			System.out.println("Object has been deserialized");
			System.out.println(object1.a);
			System.out.println(object1.b);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
