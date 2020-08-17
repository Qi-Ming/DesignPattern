package DataAccessObjectPattern;

public class DataAccessObjectPatternDemo {
    public static void main(String[] args) {
        StudentDAOIml studentDAOIml = new StudentDAOIml();
        for(Student student : studentDAOIml.getAllStudent()) {
            System.out.println("rollNumber： " + student.getRollNumber() + " name: "+ student.getName());
        }

        //更新
        Student student = studentDAOIml.getStudent(1);
        student.setName("Harry");
        studentDAOIml.updateStudent(student);

        //删除
        studentDAOIml.deleteStudent(student);
    }
}
