package com.example.h1emubootcms.mapper;

import com.example.h1emubootcms.entity.MemberEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MemberMapper {

    @Insert(value = {"insert into QQMember(QQID,QQName,JoinTimestamp,lastSpeakTimestamp,QQGroupID) values (#{QQID},#{QQName},#{JoinTimestamp},#{lastSpeakTimestamp},#{QQGroupID})"})
    List<MemberEntity> InsertMember(MemberEntity entity);


}
