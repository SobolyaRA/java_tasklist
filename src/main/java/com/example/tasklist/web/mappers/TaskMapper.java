package com.example.tasklist.web.mappers;

import com.example.tasklist.domain.task.Task;
import com.example.tasklist.web.DTO.task.TaskDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper extends Mappable<Task, TaskDTO> {
}
