package com.secuho.springstudy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.xml.crypto.Data;
import java.util.Date;

@Entity //DB Table 생성 <- JPA
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String title;
    public Integer price; //int랑 동일, but JPA에서는 Integer 강요.

}

@Entity
class Announcement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    String title;
    String Date;
}
