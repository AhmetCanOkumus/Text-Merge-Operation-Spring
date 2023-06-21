package com.example.yazlab2.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "proje1")
public class Save {
    @Id
    private String id;
    @Field
    private String birlesmismetin;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBirlesmismetin() {
        return birlesmismetin;
    }

    public void setBirlesmismetin(String birlesmismetin) {
        this.birlesmismetin = birlesmismetin;
    }
}
