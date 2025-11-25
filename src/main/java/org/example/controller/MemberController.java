package org.example.controller;

import org.example.Model.DTO.MemberDTO;
import org.example.Service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {
    MemberService memberService = new MemberService();

    @PostMapping("add/member")
    public void addMember(@RequestBody MemberDTO memberDTO){
        memberService.addMember(memberDTO);
    }

    @GetMapping("get/member/{id}")
    public MemberDTO getMember(@PathVariable String id){
        return memberService.getMember(id);
    }

    @DeleteMapping("delete/member/{id}")
    public void deleteMember(@PathVariable String id){
        memberService.deleteMember(id);
    }

    @PostMapping("update/member")
    public void updateMember(@RequestBody MemberDTO memberDTO){
        memberService.updateMember(memberDTO);
    }

    @GetMapping("member/getAll")
    public List<MemberDTO> getAll(){
        return memberService.getAll();
    }
}
