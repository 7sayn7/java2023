import static org.junit.Assert.assertEquals;

import education.Student;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {
    @Test
    public void testGetStudentInGroup() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student.Builder()
                .setName("Alice")
                .setGroupName("GroupA")
                .setAge(20)
                .build());
        students.add(new Student.Builder()
                .setName("Bob")
                .setGroupName("GroupB")
                .setAge(21)
                .build());
        students.add(new Student.Builder()
                .setName("Charlie")
                .setGroupName("GroupA")
                .setAge(19)
                .build());
        students.add(new Student.Builder()
                .setName("David")
                .setGroupName("GroupC")
                .setAge(22)
                .build());

        ArrayList<Student> studentsInGroupA = new Student().getStudentInGroup(students, "GroupA");

        assertEquals(2, studentsInGroupA.size());
        assertEquals("Alice", studentsInGroupA.get(0).getName());
        assertEquals("Charlie", studentsInGroupA.get(1).getName());
    }
}