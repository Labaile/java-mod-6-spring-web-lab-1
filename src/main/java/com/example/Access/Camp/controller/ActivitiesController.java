package com.example.Access.Camp.controller;


import com.example.Access.Camp.model.Activities;
import com.example.Access.Camp.service.ActivitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ActivitiesController {

    @Autowired
    ActivitiesService activitiesService;

    @PostMapping("/activities")
    public ResponseEntity<Activities> createMember(@Valid @RequestBody Activities member) {
        Activities newMember = activitiesService.createMember(member);
        return ResponseEntity.ok(newMember);
    }
    @GetMapping("/activities")
    public List<Activities> readMembers() {
        return activitiesService.getMembers();
    }

    @GetMapping("/activities/{memberId}")
    public Activities readMember(@PathVariable(value = "memberId") Integer id) {
        return activitiesService.getMember(id);
    }

    @PutMapping("/activities/{memberId}")
    public Activities updateMember(@PathVariable(value = "memberId") Integer id, @RequestBody Activities memberData) {
        return activitiesService.updateMember(id, memberData);
    }

    @DeleteMapping("/activities/{memberId}")
    public void deleteMember(@PathVariable(value = "memberId") Integer id) {
        activitiesService.deleteMember(id);
    }


}
