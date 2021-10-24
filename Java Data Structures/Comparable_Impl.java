import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    String name;
    int roll;
    int age;

    public Student(String name, int roll, int age) {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", age=" + age +
                '}';
    }

    public int compareTo(Student student) {
        return name.compareTo(student.name);
    }

//    public int compareTo(Student student) {
//        if (age == student.age) return 0;
//        else if (age > student.age) return 1;
//        else return -1;
//    }
}


public class Comparable_Impl {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Maruf", 15006, 25));
        list.add(new Student("Faiha", 11, 4));
        list.add(new Student("Raisa", 1, 9));
        list.add(new Student("Aarhan", 10, 3));

        Collections.sort(list);

        for (Student s : list) {
            System.out.println(s);
        }


    }

}
