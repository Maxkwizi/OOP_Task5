
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherView teacherView = new TeacherView();
        List<Teacher> teachers = teacherView.getAllTeachers();
        for (Teacher teacher : teachers) {
            System.out.println("Учитель: " + teacher.getName() + ", предмет: " + teacher.getSubject());
        }
    }
}
