package com.crud.tasks.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTests {

    @Test
    void setAndGetTask() {
        //Given
        Task task = new Task(1L, "Name", "description");

        //When
        Long id = task.getId();
        String name = task.getTitle();
        String description = task.getContent();

        //Then
        assertEquals(1, id);
        assertEquals("Name", name);
        assertEquals("description", description);
    }
}
