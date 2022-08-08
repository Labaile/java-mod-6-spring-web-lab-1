package com.example.Access.Camp.service;

import com.example.Access.Camp.model.Signups;
import com.example.Access.Camp.repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignUpService {
    @Autowired
    SignUpRepository signUpRepository;

    public Signups createMember(Signups member) {
        return signUpRepository.save(member);
    }

    public List<Signups> getMembers() {
        return signUpRepository.findAll();
    }

    public Signups getMember(Integer id) {
        return signUpRepository.findById(id).get();
    }

    public Signups updateMember(Integer id, Signups memberData) {
        Signups member = signUpRepository.findById(id).get();
        member.setCamper_id(memberData.getActivity_id());

        return signUpRepository.save(member);
    }

    public void deleteMember(Integer id) {
        signUpRepository.deleteById(id);
    }
}
