package org.example.Service;

import org.example.Model.DTO.MemberDTO;
import org.example.Repository.MemberRepository;

import java.util.List;

public class MemberService {

    MemberRepository memberRepository = new MemberRepository();

    public void addMember(MemberDTO memberDTO) {
        memberRepository.addMember(memberDTO);
    }

    public MemberDTO getMember(String id) {
        return memberRepository.getMember(id);
    }

    public void deleteMember(String id) {
        memberRepository.deleteMember(id);
    }

    public void updateMember(MemberDTO memberDTO) {
        memberRepository.updateMember(memberDTO);
    }

    public List<MemberDTO> getAll() {
        return memberRepository.getAll();
    }
}
