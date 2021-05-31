package com.crud.tasks.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreatedTrelloCardDtoTests {

    @Test
    void setAndGetCreatedTrelloCardDto() {
        //Given
        CreatedTrelloCardDto createdTrelloCardDto = new CreatedTrelloCardDto();
        createdTrelloCardDto.setId("1");
        createdTrelloCardDto.setName("Name");
        createdTrelloCardDto.setShortUrl("TestUrl");

        //When
        String id = createdTrelloCardDto.getId();
        String name = createdTrelloCardDto.getName();
        String url = createdTrelloCardDto.getShortUrl();

        //Then

        assertEquals("1", id);
        assertEquals("Name", name);
        assertEquals("TestUrl", url);
    }
}
