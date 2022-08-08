package com.example.Access.Camp.controller;


import com.example.Access.Camp.model.Signups;
import com.example.Access.Camp.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;



@RestController
@RequestMapping("/api")
public class SignUpController {
    @Autowired
    SignUpService signUpService;

    @PostMapping("/signups")
    public ResponseEntity<Signups> createMember(@Valid @RequestBody Signups member) {
        Signups newMember = signUpService.createMember(member);
        return ResponseEntity.ok(newMember);
    }
    @GetMapping("/signups")
    public List<Signups> readMembers() {
        return signUpService.getMembers();
    }

    @GetMapping("/signups/{memberId}")
    public Signups readMember(@PathVariable(value = "memberId") Integer id) {
        return signUpService.getMember(id);
    }

    @PutMapping("/signups/{memberId}")
    public Signups updateMember(@PathVariable(value = "memberId") Integer id, @RequestBody Signups memberData) {
        return signUpService.updateMember(id, memberData);
    }

    @DeleteMapping("/signups/{memberId}")
    public void deleteMember(@PathVariable(value = "memberId") Integer id) {
        signUpService.deleteMember(id);
    }




}