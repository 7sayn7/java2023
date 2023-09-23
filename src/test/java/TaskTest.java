import static org.junit.Assert.assertEquals;

import education.Task;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

public class TaskTest {
    @Test
    public void testGetMaxPointsTask() {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Task 1", LocalDate.of(2023, 1, 15), 100));
        tasks.add(new Task("Task 2", LocalDate.of(2023, 1, 20), 90));
        tasks.add(new Task("Task 3", LocalDate.of(2023, 2, 10), 110));

        Task maxPointsTask = new Task().getMaxPointsTask(tasks);

        assertEquals("Task 3", maxPointsTask.getDescription());
        assertEquals(110, maxPointsTask.getMaxPoints());
    }
}