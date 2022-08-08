package com.example.Access.Camp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

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


    public void add(List<Activities> activity) {
    }

    @OneToMany//(mappedBy = "")
    private List<Signups> signups = new ArrayList<>();

    public void addSignups(Signups signups){
        signups.add(signups);
    }


}
