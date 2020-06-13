package example2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable{
	
	transient int a;
	static int b;
	int age;
	String name;

	public Emp(int a, int b, int age, String name) {
		this.a = a;
		this.b = b;
		this.age = age;
		this.name = name;
	}

}

public class SerialExample {

	static void printData(Emp object1) {
		System.out.println(object1.a);
		System.out.println(object1.b);
		System.out.println(object1.age);
		System.out.println(object1.name);
	}

	public static void main(String[] args) {

		Emp emp = new Emp(1, 2, 24, "GeeksforGeeks");
		String file = "test2.txt";

		// Serialization
		try {

			FileOutputStream out = new FileOutputStream(file);
			ObjectOutputStream object = new ObjectOutputStream(out);
			
			object.writeObject(emp);

			out.close();
			object.close();

			System.out.println("Object has been Serialized successfully. " + "Data before serialization ");
			printData(emp);
			
			emp.b = 10;

		} catch (IOException e) {
			e.printStackTrace();
		}

		// DeSerialization
		try {
			FileInputStream out = new FileInputStream(file);
			ObjectInputStream in = new ObjectInputStream(out);

			Emp emp1 = (Emp) in.readObject();

			out.close();
			in.close();
			
			System.out.println("Object has been DeSerialized. " + "Data After DeSerialization ");
			printData(emp1);

		} catch (IOException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
