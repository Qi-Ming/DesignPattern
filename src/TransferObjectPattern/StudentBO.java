package TransferObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {
    private List<StudentVO> studentVOS;

    public StudentBO() {
        StudentVO studentVO = new StudentVO("Tom", 0);
        StudentVO studentVO1 = new StudentVO("Robert", 1);
        studentVOS = new ArrayList<>();
        studentVOS.add(studentVO);
        studentVOS.add(studentVO1);
    }

    public List<StudentVO> getAllStudents() {
        return studentVOS;
    }

    public void addStudent(StudentVO studentVO) {
        studentVOS.add(studentVO);
        System.out.println("增加一个学生"+studentVO.getName());
    }

    public void deleteStudent(StudentVO studentVO) {
        studentVOS.remove(studentVO);
        System.out.println("删除了一个学生" + studentVO.getName());
    }

    public void updateStudent(StudentVO studentVO) {
        studentVOS.get(studentVO.getRollNo()).setName(studentVO.getName());
        System.out.println("更新了一个学生"+studentVO.getName());
    }


}
