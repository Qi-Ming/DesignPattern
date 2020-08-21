package TransferObjectPattern;

public class TransferObjectPattern {
    public static void main(String[] args) {
        StudentBO studentBO = new StudentBO();

        for(StudentVO studentVO : studentBO.getAllStudents()) {
            System.out.println(studentVO.getRollNo() + studentVO.getName());
        }

        StudentVO studentVO = new StudentVO("Eric", 2);
        studentBO.addStudent(studentVO);

        StudentVO studentVO1 = studentBO.getAllStudents().get(0);
        studentVO1.setName("Bob");
        studentBO.updateStudent(studentVO1);

        studentBO.deleteStudent(studentVO1);
    }
}
