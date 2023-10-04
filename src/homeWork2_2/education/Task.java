package education;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;

@Builder
@Data
public class Task {
    private String description;
    private LocalDate deadLine;
    private int maxPoints;

    public static Task getMaxPointsTask(ArrayList<Task> tasks) {
        Task max = tasks.get(0);
        for (Task task : tasks) {
            if (task.maxPoints > max.maxPoints) {
                max = task;
            }
        }
        return max;
    }
}
