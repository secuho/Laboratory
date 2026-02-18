package com.secuho.springstudy;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.ToString;

@Entity
@ToString
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;
    public String title;
    public String Date;
}
