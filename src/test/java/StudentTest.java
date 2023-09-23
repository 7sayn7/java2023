import static org.junit.Assert.assertEquals;

import education.Student;
import org.junit.Test;
import java.util.ArrayList;

public class StudentTest {
    @Test
    public void testGetStudentInGroup() {
        // Создаем список студентов
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "GroupA", 20));
        students.add(new Student("Bob", "GroupB", 21));
        students.add(new Student("Charlie", "GroupA", 19));
        students.add(new Student("David", "GroupC", 22));

        // Вызываем метод для получения студентов из группы "GroupA"
        ArrayList<Student> studentsInGroupA = new Student().getStudentInGroup(students, "GroupA");

        // Проверяем, что вернулся ожидаемый результат
        assertEquals(2, studentsInGroupA.size());
        assertEquals("Alice", studentsInGroupA.get(0).getName());
        assertEquals("Charlie", studentsInGroupA.get(1).getName());
    }

    // Добавьте еще тесты, включая тесты на случаи, когда группа отсутствует или пуста
}