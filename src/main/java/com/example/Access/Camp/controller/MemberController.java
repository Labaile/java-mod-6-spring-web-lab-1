package com.example.Access.Camp.controller;

import com.example.Access.Camp.model.Campers;
import com.example.Access.Camp.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("/members")
    public ResponseEntity<Campers> createMember(@Valid @RequestBody Campers member) {
        Campers newMember = memberService.createMember(member);
        return ResponseEntity.ok(newMember);
    }

    @GetMapping("/members")
    public List<Campers> readMembers() {
        return memberService.getMembers();
    }

    @GetMapping("/members/{memberId}")
    public Campers readMember(@PathVariable(value = "memberId") Integer id) {
        return memberService.getMember(id);
    }

    @PutMapping("/members/{memberId}")
    public Campers updateMember(@PathVariable(value = "memberId") Integer id, @RequestBody Campers memberData) {
        return memberService.updateMember(id, memberData);
    }

    @DeleteMapping("/members/{memberId}")
    public void deleteMember(@PathVariable(value = "memberId") Integer id) {
        memberService.deleteMember(id);
    }
}


