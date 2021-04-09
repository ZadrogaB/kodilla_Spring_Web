package com.crud.tasks.domain;

import lombok.Data;

@Data
public class TrelloBadgesDto {
    private int votes;
    private TrelloAttachmentsByTypeDto attachmentsByType;
}
