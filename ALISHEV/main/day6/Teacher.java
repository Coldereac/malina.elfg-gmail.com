package main.day6;

class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student){
        int grade = (int) (Math.random() * 4 + 2);
        switch (grade){
            case 5:
                System.out.println("Преподаватель" + this.name + " оценил студента с именем " + student.getName()
                        + " по предмету " + this.subject + " на оценку Отлично");
                break;
            case 4:
                System.out.println("Преподаватель" + this.name + " оценил студента с именем " + student.getName()
                        + " по предмету " + this.subject + " на оценку Хорошо");
                break;
            case 3:
                System.out.println("Преподаватель" + this.name + " оценил студента с именем " + student.getName()
                        + " по предмету " + this.subject + " на оценку Удовлетворительно");
                break;
            case 2:
                System.out.println("Преподаватель" + this.name + " оценил студента с именем " + student.getName()
                        + " по предмету " + this.subject + " на оценку Неудовлетворительно");
                break;
        }
    }

}
