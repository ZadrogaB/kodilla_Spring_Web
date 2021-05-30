package com.crud.tasks.mapper;

import com.crud.tasks.domain.TrelloBoard;
import com.crud.tasks.domain.TrelloBoardDto;
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
        TrelloBoardDto trelloBoardDto3 = new TrelloBoardDto("3", "TestName3", new ArrayList<>());
        List<TrelloBoardDto> trelloBoardDtoList = new ArrayList<>();
        trelloBoardDtoList.add(trelloBoardDto1);
        trelloBoardDtoList.add(trelloBoardDto2);
        trelloBoardDtoList.add(trelloBoardDto3);

        //When
        List<TrelloBoard> trelloBoardList = mapper.mapToBoards(trelloBoardDtoList);

        //Then
        assertEquals(trelloBoardDto1.getId(), trelloBoardList.get(1).getId());
        assertEquals(trelloBoardDto1.getName(), trelloBoardList.get(1).getName());
    }

    @Test
    void mapToBoardsDtoTest(){
        //Given
        //When
        //Then
    }

    @Test
    void mapToListTest(){
        //Given
        //When
        //Then
    }

    @Test
    void mapToListDtoTest(){
        //Given
        //When
        //Then
    }

    @Test
    void mapToCardDtoTest(){
        //Given
        //When
        //Then
    }

    @Test
    void mapToCardTest(){
        //Given
        //When
        //Then
    }

}
