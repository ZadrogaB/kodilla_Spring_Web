package com.crud.tasks.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrelloDtoTest {
    @Test
    void setTrelloDto() {
        //Given
        TrelloDto trelloDto = new TrelloDto();
        trelloDto.setBoard(0);
        trelloDto.setCard(1);

        //When
        int resultBoard = trelloDto.getBoard();
        int resultCart = trelloDto.getCard();

        //Then
        assertEquals(0,resultBoard);
        assertEquals(1, resultCart);
    }
}
