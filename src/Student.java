import java.util.*;

public class Student {

    String name;
    String group;
    int course;
    List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double getAverage() {
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return (double) sum / grades.size();
    }

    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add(new Student("Ivan", "A1", 1, Arrays.asList(4, 5, 3)));
        students.add(new Student("Anna", "A1", 1, Arrays.asList(2, 2, 3)));

        printStudents(students, 1);
    }

    public static void printStudents(Set<Student> students, int course) {
        for (Student s : students) {
            if (s.course == course) {
                System.out.println(s.name);
            }
        }
    }
}