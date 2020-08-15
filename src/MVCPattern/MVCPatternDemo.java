package MVCPattern;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student student = retrieveStudentFromDataBase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.updateView();
        student.setName("Jack");
        controller.updateView();

    }

    private static Student retrieveStudentFromDataBase() {
        Student student = new Student();
        student.setRollNumber("001");
        student.setName("Robert");
        return student;
    }
}
