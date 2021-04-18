package com.crud.tasks.controller;

import com.crud.tasks.domain.CreatedTrelloCard;
import com.crud.tasks.domain.TrelloBoardDto;
import com.crud.tasks.domain.TrelloCardDto;
import com.crud.tasks.service.TrelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/trello")
@RequiredArgsConstructor
public class TrelloController {

    private final TrelloService trelloService;

    @GetMapping(value = "getTrelloBoards")
    public List<TrelloBoardDto> getTrelloBoards() {
        return trelloService.fetchTrelloBoards();
    }

    @PostMapping(value = "createTrelloCard")
    public CreatedTrelloCard createTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
        return trelloService.createTrelloCard(trelloCardDto);
    }

}