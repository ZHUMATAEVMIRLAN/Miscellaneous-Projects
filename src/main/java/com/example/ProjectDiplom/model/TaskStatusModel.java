package com.example.ProjectDiplom.model;

import com.example.ProjectDiplom.enam.TaskStatus;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class TaskStatusModel {
    private Long id;
    private TaskStatus taskStatus;
}