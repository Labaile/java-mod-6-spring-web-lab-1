package com.example.Access.Camp.service;

import com.example.Access.Camp.model.Campers;
import com.example.Access.Camp.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public Campers createMember(Campers member) {
        return memberRepository.save(member);
    }

    public List<Campers> getMembers() {
        return memberRepository.findAll();
    }

    public Campers getMember(Integer id) {
        return memberRepository.findById(id).get();
    }

    public Campers updateMember(Integer id, Campers memberData) {
        Campers member = memberRepository.findById(id).get();
        member.setName(memberData.getName());

        return memberRepository.save(member);
    }

    public void deleteMember(Integer id) {
        memberRepository.deleteById(id);
    }
}
