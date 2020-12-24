package com.marwit23.TaskManager.task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long taskId;
    private String taskName;
    private String actionTarget;
    private double amount;
    private ArrayList<String> subTasks;
    private ArrayList<LocalDate> localDates;
    private ArrayList<LocalTime> localTimes;
    private TimeOfDay timeOfDay;
    private Priority priority;
    private TaskCategory taskCategory;
    private TaskType taskType;
    private TaskStatus taskStatus;

}
