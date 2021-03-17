package com.crud.tasks.service;

import java.util.*;
import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import com.crud.tasks.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DbService {

    private final TaskRepository repository;

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task getTaskById(Long id) {
        Optional<Task> task = repository.findById(id);

        if (task.isPresent()) {
            return new Task(task.get().getId(), task.get().getTitle(), task.get().getContent());
        } else  {
            return null;
        }
    }

}