import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
    String name;
    int id;
    int age;

    public Employee(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

}

class NameComparator implements Comparator<Employee> {

    public int compare(Employee s1, Employee s2) {
        return s1.name.compareTo(s2.name);
    }
}

class AgeComparator implements Comparator<Employee> {
    public int compare(Employee s1, Employee s2) {
        if (s1.age == s2.age) return 0;
        else if (s1.age > s2.age) return 1;
        else return -1;
    }
}

public class Comparator_Impl {

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Maruf", 15006, 25));
        list.add(new Employee("Faiha", 11, 4));
        list.add(new Employee("Raisa", 1, 9));
        list.add(new Employee("Aarhan", 10, 3));

//        ArrayList<Employee> list2 = (ArrayList<Employee>) list.clone();

        Collections.sort(list, new NameComparator());

        for (Employee e : list) {
            System.out.println(e);
        }


        System.out.println("--------------------------------------");

        Collections.sort(list, new AgeComparator());

        for (Employee e : list) {
            System.out.println(e);
        }

//        System.out.println(list2);

    }
}
