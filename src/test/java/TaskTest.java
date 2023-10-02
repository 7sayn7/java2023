import static org.junit.Assert.assertEquals;

import education.Task;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

public class TaskTest {
    @Test
    public void testGetMaxPointsTask() {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task.Builder()
                .setDescription("Task 1")
                .setDeadLine(LocalDate.of(2023, 1, 15))
                .setMaxPoints(100)
                .build());
        tasks.add(new Task.Builder()
                .setDescription("Task 2")
                .setDeadLine(LocalDate.of(2023, 1, 20))
                .setMaxPoints(90)
                .build());
        tasks.add(new Task.Builder()
                .setDescription("Task 3")
                .setDeadLine(LocalDate.of(2023, 2, 10))
                .setMaxPoints(110)
                .build());

        Task maxPointsTask = new Task().getMaxPointsTask(tasks);

        assertEquals("Task 3", maxPointsTask.getDescription());
        assertEquals(110, maxPointsTask.getMaxPoints());
    }
}