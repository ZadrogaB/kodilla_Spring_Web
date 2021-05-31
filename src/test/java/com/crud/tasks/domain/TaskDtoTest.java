package com.crud.tasks.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskDtoTest {

    @Test
    void setAndGetTaskDto() {
        //Given
        TaskDto taskDto = new TaskDto(1L, "Name", "description");

        //When
        Long id = taskDto.getId();
        String name = taskDto.getTitle();
        String description = taskDto.getContent();

        //Then
        assertEquals(1, id);
        assertEquals("Name", name);
        assertEquals("description", description);
    }
}
