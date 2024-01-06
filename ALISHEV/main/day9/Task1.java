package main.day9;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "1A");
        Teacher teacher = new Teacher("Petro", "Math");
        System.out.println("Student: " + student.getLearnGroup() + "\nTeacher: " + teacher.getObject());
        student.printInfo();
        teacher.printInfo();
    }
}