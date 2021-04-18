package com.crud.tasks.scheduler;

import com.crud.tasks.config.AdminConfig;
import com.crud.tasks.domain.Mail;
import com.crud.tasks.repository.TaskRepository;
import com.crud.tasks.service.SimpleEmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailScheduler {

    private static final String SUBJECT = "Tasks: Once a day email";
    private final SimpleEmailService simpleEmailService;
    private final TaskRepository taskRepository;
    private final AdminConfig adminConfig;

    @Scheduled(fixedDelay = 10000)/*(cron = "0 0 10 * * *")*/
    public void sendInformationEmail() {
        long size = taskRepository.count();
        simpleEmailService.send(
                new Mail(
                        adminConfig.getAdminMail(),
                        SUBJECT,
                        this.messageBody(size),
                        null
                )
        );
    }

    private String messageBody(long size){
        String body;
        if (size==0){
            body = "Currently in database you don't have any tasks";
        } else if (size==1){
            body = "Currently in database you got: " + size + " task";
        } else {
            body = "Currently in database you got: " + size + " tasks";
        }
        return body;
    }
}