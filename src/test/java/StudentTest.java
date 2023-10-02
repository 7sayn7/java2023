import static org.junit.Assert.assertEquals;

import education.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    @Test
    public void testGetStudentInGroup() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(Student.builder()
                .name("Alice")
                .groupName("GroupA")
                .age(20)
                .build());
        students.add(Student.builder()
                .name("Bob")
                .groupName("GroupB")
                .age(21)
                .build());
        students.add(Student.builder()
                .name("Charlie")
                .groupName("GroupA")
                .age(19)
                .build());
        students.add(Student.builder()
                .name("David")
                .groupName("GroupC")
                .age(22)
                .build());

        List<Student> studentsInGroupA = Student.getStudentInGroup(students, "GroupA");

        assertEquals(2, studentsInGroupA.size());
        assertEquals("Alice", studentsInGroupA.get(0).getName());
        assertEquals("Charlie", studentsInGroupA.get(1).getName());
    }
}