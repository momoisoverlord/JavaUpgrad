import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class WithArray {
    public static void main(String[] args) {
        List<Student> studentList1 = new ArrayList<Student>();
        List<Student> studentList2 = new LinkedList<Student>();


        Student s1 = new Student("Sujit",1);
        Student s2 = new Student("Siddharth",2);
        Student s3 = new Student("Karanpreet",3);
        Student s4 = new Student("Hari",5);
        Student s5 = new Student("Tricha",4);

        studentList1.add(s1);
        studentList1.add(s2);
        studentList1.add(s3);
        studentList1.add(s4);
        studentList1.add(s5);

        iterateFwdBkwd(studentList1);

//        System.out.println("s1 contained?"+ studentList.contains(s1));
//        System.out.println("s5 contained?"+ studentList.contains(s5));

    }

    public static void iterateFwd(List<Student> students) {
        ListIterator<Student> it = students.listIterator();
        System.out.println("Printing Student list...");
        while (it.hasNext()) {
            System.out.println(it.next().getDetails());
        }
    }

    public static void iterateBkwd(List<Student> students) {
        ListIterator<Student> it = students.listIterator(students.size());
        System.out.println("Printing Student list...");
        while (it.hasPrevious()) {
            System.out.println(it.previous().getDetails());
        }
    }

    public static void iterateFwdBkwd(List<Student> students) {
        ListIterator<Student> it = students.listIterator();
        System.out.println("Printing Student list forward...");
        while (it.hasNext()) {
            System.out.println(it.next().getDetails());
        }
        System.out.println("Printing Student list backward...");
        while (it.hasPrevious()) {
            System.out.println(it.previous().getDetails());
        }
    }
}

class Student {
    private final String name;
    private final int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getDetails() {
        return
                "name = " + this.name + '\n' +
                        "roll number = " + this.rollNumber + '\n';
    }
}

/*
  SUMMARY
  =======
  1. ArrayList Simple way to representation a dataset which is a collection of elementary data items.
  2. This is a type-safe approach of creating containers. Any attempt to add an element which is
      type-incompatible with the declared contained type will fail at the static type checking stage,
      resulting in a compile error.

*/
