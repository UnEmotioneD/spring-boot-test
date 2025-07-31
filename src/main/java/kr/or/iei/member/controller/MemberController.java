package kr.or.iei.member.controller;

import kr.or.iei.member.model.service.MemberService;
import kr.or.iei.member.model.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class MemberController {
    @Autowired
    private MemberService service;

    @GetMapping("/getList")
    public void getList() {
        ArrayList<Member> list = service.getList();

        for (Member member : list) {
            System.out.println("member_id: "+ member.getMemberId());
            System.out.println("member_pw: "+ member.getMemberPw());
        }
    }
}
