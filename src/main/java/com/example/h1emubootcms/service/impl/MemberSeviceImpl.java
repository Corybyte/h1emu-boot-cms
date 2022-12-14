package com.example.h1emubootcms.service.impl;

import com.example.h1emubootcms.entity.MemberEntity;
import com.example.h1emubootcms.mapper.MemberMapper;
import com.example.h1emubootcms.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;
import java.util.List;

@Service
public class MemberSeviceImpl  implements MemberService {
    @Autowired
    MemberMapper mapper;

    @Override
    public List<MemberEntity> InsertMember(MemberEntity entity) {
        return  mapper.InsertMember(entity);
    }
}
