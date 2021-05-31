package com.crud.tasks.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrelloBadgesDtoTests {

    @Test
    void setAndGetTrelloBadgesDtoTest() {
        //Given
        TrelloAttachmentsByTypeDto attachmentsByTypeDto = new TrelloAttachmentsByTypeDto();
        TrelloBadgesDto trelloBadgesDto = new TrelloBadgesDto();
        trelloBadgesDto.setVotes(1);
        trelloBadgesDto.setAttachmentsByType(attachmentsByTypeDto);

        //When
        int result1 = trelloBadgesDto.getVotes();
        TrelloAttachmentsByTypeDto result2 = trelloBadgesDto.getAttachmentsByType();

        //Then
        assertEquals(1, result1);
        assertEquals(attachmentsByTypeDto, result2);
    }
}
