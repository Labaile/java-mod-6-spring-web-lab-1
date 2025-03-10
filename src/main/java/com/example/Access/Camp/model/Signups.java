package com.example.Access.Camp.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Signups {
    @Id
    @GeneratedValue
    private int id;
    private int camper_id;
    private int activity_id;
    private int time;
    //private created_at;
    //private updated_at;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCamper_id() {
        return camper_id;
    }

    public void setCamper_id(int camper_id) {
        this.camper_id = camper_id;
    }

    public int getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(int activity_id) {
        this.activity_id = activity_id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void add(Signups signups) {
    }

    @ManyToOne
    private Campers campers;



}
