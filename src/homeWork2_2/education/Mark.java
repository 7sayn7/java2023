package education;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;

@Builder
@Data
public class Mark {
    private int grade;
    private String feedBack;
    private LocalDate date;

    public static Mark createMark(int grade, String feedBack, LocalDate date) {
        return new Mark(grade, feedBack, date);
    }

    public static ArrayList<Mark> getGradesForDate(ArrayList<Mark> marks, LocalDate date) {
        ArrayList<Mark> gradesForDate = new ArrayList<>();
        for (Mark mark : marks) {
            if (mark.date.equals(date)) {
                gradesForDate.add(mark);
            }
        }
        return gradesForDate;
    }
}