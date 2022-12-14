package com.example.h1emubootcms.mapper;

import com.example.h1emubootcms.entity.MemberBlackList;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MemberBlackListMapper {
    @Insert(value = {"insert into MemberBlackList(QQID,QQName,exitGroupID,exitGroupName,exitGroupAvatar,QQEmail,QQSign,QQAge,QQLevel) values (#{QQID},#{QQName},#{exitGroupID},#{exitGroupName},#{exitGroupAvatar},#{QQEmail},#{QQSign},#{QQAge},#{QQLevel})"})
    public  int addMemberBlackListMapper(MemberBlackList entity);

    @Select(value = {"select * from MemberBlackList"})
    public List<MemberBlackList> queryAll();

    @Delete(value = {"delete from MemberBlackList where QQID = #{QQID}"})
    public int deleteMemberBlackListMapper(String id);
}
