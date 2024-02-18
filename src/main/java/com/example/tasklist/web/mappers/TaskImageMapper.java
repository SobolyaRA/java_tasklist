package com.example.tasklist.web.mappers;

import com.example.tasklist.domain.task.TaskImage;
import com.example.tasklist.web.DTO.task.TaskImageDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskImageMapper extends Mappable<TaskImage, TaskImageDTO> {
}
