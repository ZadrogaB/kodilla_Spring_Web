package com.crud.tasks.service;

import com.crud.tasks.config.AdminConfig;
import com.crud.tasks.trello.client.CreatedTrelloCardDto;
import com.crud.tasks.trello.client.TrelloBoardDto;
import com.crud.tasks.trello.client.TrelloCardDto;
import com.crud.tasks.trello.client.TrelloClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrelloService {
    private static final String SUBJECT = "Tasks: New Trello card";
    private final TrelloClient trelloClient;
    private final SimpleEmailService emailService;
    private final AdminConfig adminConfig;

    public List<TrelloBoardDto> fetchTrelloBoards() {
        return trelloClient.getTrelloBoards();
    }

    public CreatedTrelloCardDto createTrelloCard(final TrelloCardDto trelloCardDto) {
        CreatedTrelloCardDto newCard = trelloClient.createNewCard(trelloCardDto);
        /*ofNullable(newCard).ifPresent(card -> emailService.send(
                new Mail(
                adminConfig.getAdminMail(),
                SUBJECT,
                "New card: " + trelloCardDto.getName() + " has been created on your Trello account",
                null
        )));*/
        return newCard;
    }
}
