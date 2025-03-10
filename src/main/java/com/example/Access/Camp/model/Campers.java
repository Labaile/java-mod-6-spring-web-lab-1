package com.example.Access.Camp.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

@Entity
public class Campers {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    @NotBlank
    private String name;

    @Min(value = 8)
    @Max(18)
    private int age;

    //private created_at;
    //private updated_at;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @OneToMany (mappedBy = "campers")
    private List<Activities> activity = new ArrayList<>();





}
