package com.example.Access.Camp.repository;

import com.example.Access.Camp.model.Activities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



    @Repository
    public interface ActivityRepository extends JpaRepository<Activities, Integer> {

    }

