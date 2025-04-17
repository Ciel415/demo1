package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor

public class ResponseDto {
    private Long id;
    private String category;
    private String title;
    private String user;
    private LocalDate timedata;
    private int view;
    private int like;
}
