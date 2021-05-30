package com.crud.tasks.mapper;

import com.crud.tasks.domain.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TrelloMapperTests {

    @Autowired
    private TrelloMapper mapper;

    @Test
    void mapToBoardsTest(){
        //Given
        TrelloBoardDto trelloBoardDto1 = new TrelloBoardDto("1", "TestName1", new ArrayList<>());
        TrelloBoardDto trelloBoardDto2 = new TrelloBoardDto("2", "TestName2", new ArrayList<>());
        List<TrelloBoardDto> trelloBoardDtoList = new ArrayList<>();
        trelloBoardDtoList.add(trelloBoardDto1);
        trelloBoardDtoList.add(trelloBoardDto2);

        //When
        List<TrelloBoard> result = mapper.mapToBoards(trelloBoardDtoList);

        //Then
        assertEquals(2, result.size());
    }

    @Test
    void mapToBoardsDtoTest(){
        //Given
        TrelloBoard trelloBoard1 = new TrelloBoard("1", "TestName1", new ArrayList<>());
        TrelloBoard trelloBoard2 = new TrelloBoard("2", "TestName2", new ArrayList<>());
        List<TrelloBoard> trelloBoardList = new ArrayList<>();
        trelloBoardList.add(trelloBoard1);
        trelloBoardList.add(trelloBoard2);

        //When
        List<TrelloBoardDto> result = mapper.mapToBoardsDto(trelloBoardList);

        //Then
        assertEquals(2, result.size());
    }

    @Test
    void mapToListTest(){
        //Given
        TrelloListDto trelloListDto1 = new TrelloListDto("1", "TestName1", false);
        TrelloListDto trelloListDto2 = new TrelloListDto("2", "TestName2", false);
        List<TrelloListDto> trelloListDtoList = new ArrayList<>();
        trelloListDtoList.add(trelloListDto1);
        trelloListDtoList.add(trelloListDto2);

        //When
        List<TrelloList> result = mapper.mapToList(trelloListDtoList);

        //Then
        assertEquals(2, result.size());
    }

    @Test
    void mapToListDtoTest(){
        //Given
        TrelloList trelloList1 = new TrelloList("1", "TestName1", false);
        TrelloList trelloList2 = new TrelloList("2", "TestName2", false);
        List<TrelloList> list = new ArrayList<>();
        list.add(trelloList1);
        list.add(trelloList2);

        //When
        List<TrelloListDto> result = mapper.mapToListDto(list);

        //Then
        assertEquals(2, result.size());
    }

    @Test
    void mapToCardDtoTest(){
        //Given
        TrelloCard trelloCard = new TrelloCard("TestName","testDescription","test","1");

        //When
        TrelloCardDto result = mapper.mapToCardDto(trelloCard);

        //Then
        assertEquals("TestName", result.getName());
    }

    @Test
    void mapToCardTest(){
        //Given
        TrelloCardDto trelloCardDto = new TrelloCardDto("TestName","testDescription","test","1");

        //When
        TrelloCard result = mapper.mapToCard(trelloCardDto);

        //Then
        assertEquals("TestName", result.getName());
    }

}
