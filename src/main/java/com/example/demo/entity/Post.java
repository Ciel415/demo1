package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Post {
    @Id

    @Column
    private Long id;

    @Column
    private String category;

    @Column
    private String title;

    @Column
    private String user;

    @Column
    private LocalDate timedata;

    @Column
    private int view;

    @Column
    private int like;


}
