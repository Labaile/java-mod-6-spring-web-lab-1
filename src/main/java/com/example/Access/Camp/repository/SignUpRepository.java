package com.example.Access.Camp.repository;


import com.example.Access.Camp.model.Signups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SignUpRepository extends JpaRepository<Signups, Integer> {

}
