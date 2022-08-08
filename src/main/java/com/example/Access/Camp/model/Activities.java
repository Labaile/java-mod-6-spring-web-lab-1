package com.example.Access.Camp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Activities {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @NotBlank
    private String name;

    private int difficulty;
    //private created_at;
    //private updated_at;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }



}
