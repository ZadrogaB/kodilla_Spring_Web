package com.crud.tasks.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class CompanyConfig {
    @Value("${info.company.name}")
    private String name;
    @Value("${info.company.email}")
    private String mail;
    @Value("${info.company.phone}")
    private String phone;
    @Value("${info.company.goal}")
    private String goal;
}
