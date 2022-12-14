package com.example.h1emubootcms.service;

import com.example.h1emubootcms.entity.MemberBlackList;

import java.util.List;

public interface MemberBlackListService {
    public  int addMemberBlackList(MemberBlackList entity);

    public List<MemberBlackList> queryAll();

    public int deleteMemberBlackList(String QQID);
}
