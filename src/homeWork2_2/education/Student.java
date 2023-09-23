package education;

import java.util.ArrayList;

public class Student {
    public Student(String name, String groupName, int age) {
        this.name = name;
        this.groupName = groupName;
        this.age = age;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private String groupName;
    private int age;

    public ArrayList<Student> getStudentInGroup(ArrayList<Student> students, String groupName) {
        ArrayList<Student> studentsInGroup = new ArrayList<>();
        for (Student student : students) {
            if (student.groupName.equals(groupName)) {
                studentsInGroup.add(student);
            }
        }
        return studentsInGroup;
    }
}
