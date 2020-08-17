package DataAccessObjectPattern;

import java.util.List;

public interface StudentDAO {
    List<Student> getAllStudent();
    void deleteStudent(Student student);
    void updateStudent(Student student);
    Student getStudent(int rollNumber);
}
