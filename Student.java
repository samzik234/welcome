import java.util.Arrays;

public class Student {
    String firstname;
    String lastname;
    int age;

    public Student(String lastname, String firstname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    public static void main(String[] args) {
        Student[] students = new Student[2]; // Change the size to accommodate two students
        students[0] = new Student("Simon", "Azike", 23);
        students[1] = new Student("Titma", "Omatha", 22);

        // Print information about the first student
        System.out.println("First Student: " + students[1].firstname + " " + students[0].lastname + ", Age: " + students[0].age);

        // Print information about the second student
        System.out.println("Second Student: " + students[1].firstname + " " + students[0].lastname + ", Age: " + students[1].age);
    }
}
