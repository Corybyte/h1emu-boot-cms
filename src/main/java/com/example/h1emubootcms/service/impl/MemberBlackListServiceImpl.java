package com.example.h1emubootcms.service.impl;

import com.example.h1emubootcms.entity.MemberBlackList;
import com.example.h1emubootcms.mapper.MemberBlackListMapper;
import com.example.h1emubootcms.service.MemberBlackListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberBlackListServiceImpl implements MemberBlackListService {
    @Autowired
    MemberBlackListMapper mapper;

    @Override
    public int addMemberBlackList(MemberBlackList entity) {
        return mapper.addMemberBlackListMapper(entity);
    }

    @Override
    public List<MemberBlackList> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public int deleteMemberBlackList(String QQID) {
        return mapper.deleteMemberBlackListMapper(QQID);
    }
}
