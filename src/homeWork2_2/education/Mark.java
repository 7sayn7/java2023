package education;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mark {
    private int grade;
    private String feedBack;
    private LocalDate date;

    private Mark(int grade, String feedBack, LocalDate date) {
        this.grade = grade;
        this.feedBack = feedBack;
        this.date = date;
    }

    public Mark() {

    }

    public static Mark createMark(int grade, String feedBack, LocalDate date) {
        return new Mark(grade, feedBack, date);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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