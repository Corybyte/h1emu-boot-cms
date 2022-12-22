package com.example.h1emubootcms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.h1emubootcms.entity.MemberBlackList;
import com.example.h1emubootcms.entity.WelcomeEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WelcomeMapper extends BaseMapper<WelcomeEntity>{
    @Insert(value = {"insert into QQWelcome values (#{QQID},#{QQGroupID},#{content})"})
    public  int addWelcomeMapper(WelcomeEntity welcome);

    @Select(value = {"select * from QQWelcome"})
    public List<WelcomeEntity> queryAll();

    @Delete(value = {"delete from QQWelcome where QQID = #{QQID}"})
    public int deleteWelcomeMapper(String id);


    @Update(value = {"update QQWelcome set QQGroupID = #{QQGroupID},content = #{content} where QQID = #{QQID}"})
    public int updateWelcomeMapper(WelcomeEntity welcome);
}
