package com.darksoul.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class BookCase {
    private int id;
    private String name;


    public BookCase(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public BookCase(){}

    public int getId() {
        return id;
    }

    @JsonProperty(value = "id")
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BookCase{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
