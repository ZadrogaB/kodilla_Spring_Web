//package com.crud.tasks.domain;
//
//import com.crud.tasks.mapper.TaskMapper;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class taskMapperTest {
//
//    @Test
//    void taskMapperTest() {
//        //Given
//        TaskMapper taskMapper = new TaskMapper();
//        Task task = new Task(1L, "Name", "description");
//        Task task2 = new Task(2L, "Name2", "description2");
//        TaskDto taskDto = new TaskDto(1L, "Name", "description");
//        List<Task> taskList = new ArrayList<>();
//        taskList.add(task);
//        taskList.add(task2);
//
//        //When
//        Task result1 = taskMapper.mapToTask(taskDto);
//        TaskDto result2 = taskMapper.mapToTaskDto(task);
//        List<TaskDto> result3 = taskMapper.mapToTaskDtoList(taskList);
//
//        //Then
//        assertEquals("description", result1.getContent());
//        assertEquals("description", result1.getContent());
//        assertEquals(2, result3.size());
//    }
//}
