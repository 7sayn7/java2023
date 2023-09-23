import static org.junit.Assert.assertEquals;

import education.Mark;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

public class MarkTest {
    @Test
    public void testGetGradesForDate() {
        ArrayList<Mark> marks = new ArrayList<>();
        marks.add(new Mark(90, "Good", LocalDate.of(2023, 1, 15)));
        marks.add(new Mark(85, "Excellent", LocalDate.of(2023, 1, 15)));
        marks.add(new Mark(75, "Satisfactory", LocalDate.of(2023, 2, 20)));
        marks.add(new Mark(95, "Outstanding", LocalDate.of(2023, 2, 20)));

        ArrayList<Mark> gradesForDate = Mark.getGradesForDate(marks, LocalDate.of(2023, 1, 15));

        assertEquals(2, gradesForDate.size());
        assertEquals(90, gradesForDate.get(0).getGrade());
        assertEquals(85, gradesForDate.get(1).getGrade());
    }
}