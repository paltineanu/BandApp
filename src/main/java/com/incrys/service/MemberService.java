package com.incrys.service;

import com.incrys.controller.MemberDTO;
import com.incrys.repository.Band;
import com.incrys.repository.BandRepository;
import com.incrys.repository.Member;
import com.incrys.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by User on 7/27/2017.
 */

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    BandRepository bandRepository;

    public MemberDTO addMember(int id, MemberDTO memberDTO) {
        Member member = new Member();
        member.setName(memberDTO.getMember_name());
        member.setDateOfBirth(memberDTO.getDate_of_birth());
        member.setPosition(memberDTO.getPosition());
        Band band = bandRepository.findOne(id);
        member.setBand(band);
        Member savedMember = memberRepository.save(member);
        return new MemberDTO(savedMember.getId(), savedMember.getName(), savedMember.getDateOfBirth(), savedMember.getPosition(), savedMember.getBand());
    }
}