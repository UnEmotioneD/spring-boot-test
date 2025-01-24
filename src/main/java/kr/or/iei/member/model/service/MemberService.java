package kr.or.iei.member.model.service;

import kr.or.iei.member.model.dao.MemberDao;
import kr.or.iei.member.model.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MemberService {

    @Autowired
    private MemberDao dao;

    public ArrayList<Member> getList() {
        return dao.getList();
    }

}
