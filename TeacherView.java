import java.util.ArrayList;
import java.util.List;

public class TeacherView {
    public List<Teacher> getAllTeachers() {
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Анна Ивановна", "Математика"));
        teachers.add(new Teacher("Елена Петровна", "Английский"));
        teachers.add(new Teacher("Мария Алексеевна", "История"));
        teachers.add(new Teacher("Раиса Борисовна", "Литература"));
        teachers.add(new Teacher("Михаил Петрович", "Технология"));
        return teachers;
    }
}

