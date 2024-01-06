package main.day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Ivan");
        Teacher teacher = new Teacher("Pedro", "Math");
        teacher.evaluate(student);
    }
}
