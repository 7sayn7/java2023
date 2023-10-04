import static org.junit.Assert.assertEquals;

import education.Task;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

public class TaskTest {
    @Test
    public void testGetMaxPointsTask() {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(Task.builder()
                .description("Task 1")
                .deadLine(LocalDate.of(2023, 1, 15))
                .maxPoints(100)
                .build());
        tasks.add(Task.builder()
                .description("Task 2")
                .deadLine(LocalDate.of(2023, 1, 20))
                .maxPoints(90)
                .build());
        tasks.add(Task.builder()
                .description("Task 3")
                .deadLine(LocalDate.of(2023, 2, 10))
                .maxPoints(110)
                .build());

        Task maxPointsTask = Task.getMaxPointsTask(tasks);

        assertEquals("Task 3", maxPointsTask.getDescription());
        assertEquals(110, maxPointsTask.getMaxPoints());
    }
}