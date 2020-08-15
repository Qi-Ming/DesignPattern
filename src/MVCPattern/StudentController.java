package MVCPattern;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentRollNumber(String rollName) {
        model.setRollNumber(rollName);
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public void updateView() {
        view.showDetails(model.getRollNumber(), model.getName());
    }
}
