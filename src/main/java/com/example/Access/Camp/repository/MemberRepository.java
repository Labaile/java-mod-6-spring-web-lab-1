package com.example.Access.Camp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Access.Camp.model.Campers;


@Repository
public interface MemberRepository extends JpaRepository<Campers, Integer> {

}