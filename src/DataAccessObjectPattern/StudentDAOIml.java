package DataAccessObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOIml implements StudentDAO {
    //模拟数据库
    private List<Student> students;

    public StudentDAOIml() {
        students = new ArrayList<>();
        Student student = new Student("Robert", 0);
        Student student1 = new Student("Tom", 1);
        students.add(student);
        students.add(student1);
    }

    @Override
    public List<Student> getAllStudent() {
        return students;
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student);
        System.out.println("Student: Roll No " + student.getRollNumber()
                +", deleted from database");
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNumber()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNumber()
                +", updated in the database");
    }

    @Override
    public Student getStudent(int rollNumber) {
        return students.get(rollNumber);
    }
}
