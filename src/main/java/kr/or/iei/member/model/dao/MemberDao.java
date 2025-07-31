package kr.or.iei.member.model.dao;

import kr.or.iei.member.model.vo.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

// Mapper
@Mapper
public interface MemberDao { // interface 로 생성
    public ArrayList<Member> getList();
}
