package education;

import java.time.LocalDate;
import java.util.ArrayList;

public class Task {
    private String description;
    private LocalDate deadLine;
    private int maxPoints;

    private Task(String description, LocalDate deadLine, int maxPoints) {
        this.description = description;
        this.deadLine = deadLine;
        this.maxPoints = maxPoints;
    }

    public Task() {

    }

    public static class Builder {
        private String description;
        private LocalDate deadLine;
        private int maxPoints;

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setDeadLine(LocalDate deadLine) {
            this.deadLine = deadLine;
            return this;
        }

        public Builder setMaxPoints(int maxPoints) {
            this.maxPoints = maxPoints;
            return this;
        }

        public Task build() {
            return new Task(description, deadLine, maxPoints);
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public Task getMaxPointsTask(ArrayList<Task> tasks) {
        Task max = tasks.get(0);
        for (Task task : tasks) {
            if (task.maxPoints > max.maxPoints) {
                max = task;
            }
        }
        return max;
    }
}
