package com.example.Access.Camp.service;

import com.example.Access.Camp.model.Activities;

import com.example.Access.Camp.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ActivitiesService {


    @Autowired
    ActivityRepository activityRepository;

    public Activities createMember(Activities member) {
        return activityRepository.save(member);
    }

    public List<Activities> getMembers() {
        return activityRepository.findAll();
    }

    public Activities getMember(Integer id) {
        return activityRepository.findById(id).get();
    }

    public Activities updateMember(Integer id, Activities memberData) {
        Activities member = activityRepository.findById(id).get();
        member.setName(memberData.getName());

        return activityRepository.save(member);
    }

    public void deleteMember(Integer id) {
        activityRepository.deleteById(id);
    }

}
