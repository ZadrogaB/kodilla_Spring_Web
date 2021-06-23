//package com.crud.tasks.mapper;
//
//import com.crud.tasks.domain.*;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
////@SpringBootTest
//public class TrelloMapperTests {
//
////    @Autowired
//    private TrelloMapper mapper = new TrelloMapper();
//
//    @Test
//    void mapToBoardsTest(){
//        //Given
//        TrelloBoardDto trelloBoardDto1 = new TrelloBoardDto("1", "TestName1", new ArrayList<>());
//        TrelloBoardDto trelloBoardDto2 = new TrelloBoardDto("2", "TestName2", new ArrayList<>());
//        List<TrelloBoardDto> trelloBoardDtoList = new ArrayList<>();
//        trelloBoardDtoList.add(trelloBoardDto1);
//        trelloBoardDtoList.add(trelloBoardDto2);
//
//        //When
//        List<TrelloBoard> result = mapper.mapToBoards(trelloBoardDtoList);
//
//        //Then
//        assertEquals(2, result.size());
//        assertEquals("1", result.get(0).getId());
//        assertEquals("TestName1", result.get(0).getName());
//        assertEquals(0, result.get(0).getLists().size());
//        assertEquals("2", result.get(1).getId());
//        assertEquals("TestName2", result.get(1).getName());
//        assertEquals(0, result.get(1).getLists().size());
//        assertEquals(TrelloBoard.class, result.get(0).getClass());
//        assertEquals(TrelloBoard.class, result.get(1).getClass());
//    }
//
//    @Test
//    void mapToBoardsDtoTest(){
//        //Given
//        TrelloBoard trelloBoard1 = new TrelloBoard("1", "TestName1", new ArrayList<>());
//        TrelloBoard trelloBoard2 = new TrelloBoard("2", "TestName2", new ArrayList<>());
//        List<TrelloBoard> trelloBoardList = new ArrayList<>();
//        trelloBoardList.add(trelloBoard1);
//        trelloBoardList.add(trelloBoard2);
//
//        //When
//        List<TrelloBoardDto> result = mapper.mapToBoardsDto(trelloBoardList);
//
//        //Then
//        assertEquals(2, result.size());
//        assertEquals("1", result.get(0).getId());
//        assertEquals("TestName1", result.get(0).getName());
//        assertEquals(0, result.get(0).getLists().size());
//        assertEquals("2", result.get(1).getId());
//        assertEquals("TestName2", result.get(1).getName());
//        assertEquals(0, result.get(1).getLists().size());
//        assertEquals(TrelloBoardDto.class, result.get(0).getClass());
//        assertEquals(TrelloBoardDto.class, result.get(1).getClass());
//    }
//
//    @Test
//    void mapToListTest(){
//        //Given
//        TrelloListDto trelloListDto1 = new TrelloListDto("1", "TestName1", false);
//        TrelloListDto trelloListDto2 = new TrelloListDto("2", "TestName2", false);
//        List<TrelloListDto> trelloListDtoList = new ArrayList<>();
//        trelloListDtoList.add(trelloListDto1);
//        trelloListDtoList.add(trelloListDto2);
//
//        //When
//        List<TrelloList> result = mapper.mapToList(trelloListDtoList);
//
//        //Then
//        assertEquals(2, result.size());
//        assertEquals("1", result.get(0).getId());
//        assertEquals("TestName1", result.get(0).getName());
//        assertEquals(false, result.get(0).isClosed());
//        assertEquals("2", result.get(1).getId());
//        assertEquals("TestName2", result.get(1).getName());
//        assertEquals(false, result.get(1).isClosed());
//        assertEquals(TrelloList.class, result.get(0).getClass());
//        assertEquals(TrelloList.class, result.get(1).getClass());
//
//    }
//
//    @Test
//    void mapToListDtoTest(){
//        //Given
//        TrelloList trelloList1 = new TrelloList("1", "TestName1", false);
//        TrelloList trelloList2 = new TrelloList("2", "TestName2", false);
//        List<TrelloList> list = new ArrayList<>();
//        list.add(trelloList1);
//        list.add(trelloList2);
//
//        //When
//        List<TrelloListDto> result = mapper.mapToListDto(list);
//
//        //Then
//        assertEquals(2, result.size());
//        assertEquals("1", result.get(0).getId());
//        assertEquals("TestName1", result.get(0).getName());
//        assertEquals(false, result.get(0).isClosed());
//        assertEquals("2", result.get(1).getId());
//        assertEquals("TestName2", result.get(1).getName());
//        assertEquals(false, result.get(1).isClosed());
//        assertEquals(TrelloListDto.class, result.get(0).getClass());
//        assertEquals(TrelloListDto.class, result.get(1).getClass());
//    }
//
//    @Test
//    void mapToCardDtoTest(){
//        //Given
//        TrelloCard trelloCard = new TrelloCard("TestName","testDescription","test","1");
//
//        //When
//        TrelloCardDto result = mapper.mapToCardDto(trelloCard);
//
//        //Then
//        assertEquals("TestName", result.getName());
//        assertEquals("testDescription", result.getDescription());
//        assertEquals("test", result.getPos());
//        assertEquals("1", result.getListId());
//        assertEquals(TrelloCardDto.class, result.getClass());
//
//    }
//
//    @Test
//    void mapToCardTest(){
//        //Given
//        TrelloCardDto trelloCardDto = new TrelloCardDto("TestName","testDescription","test","1");
//
//        //When
//        TrelloCard result = mapper.mapToCard(trelloCardDto);
//
//        //Then
//        assertEquals("TestName", result.getName());
//        assertEquals("testDescription", result.getDescription());
//        assertEquals("test", result.getPos());
//        assertEquals("1", result.getListId());
//        assertEquals(TrelloCard.class, result.getClass());
//    }
//
//}
