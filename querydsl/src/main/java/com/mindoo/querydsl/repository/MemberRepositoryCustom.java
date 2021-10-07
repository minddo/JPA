package com.mindoo.querydsl.repository;

import com.mindoo.querydsl.dto.MemberSearchCondition;
import com.mindoo.querydsl.dto.MemberTeamDto;
import com.mindoo.querydsl.entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {
    List<Member> findAll_Querydsl();
    List<Member> findByUsername_Querydsl(String username);
    List<MemberTeamDto> searchByBuilder(MemberSearchCondition condition);
    List<MemberTeamDto> search(MemberSearchCondition condition);    }
