package education;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
public class Student {
    private String name;
    private String groupName;
    private int age;

    public static List<Student> getStudentInGroup(ArrayList<Student> students, String groupName) {
        List<Student> studentsInGroup = new ArrayList<>();
        for (Student student : students) {
            if (student.groupName.equals(groupName)) {
                studentsInGroup.add(student);
            }
        }
        return studentsInGroup;
    }
}
