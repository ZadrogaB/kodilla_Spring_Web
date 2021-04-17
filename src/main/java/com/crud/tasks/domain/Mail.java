package com.crud.tasks.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@Getter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Mail {
    private final String mailTo;
    private final String subject;
    private final String message;
    private String toCc;
}