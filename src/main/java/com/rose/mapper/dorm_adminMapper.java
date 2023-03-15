package com.rose.mapper;

import com.rose.domain.dorm_admin;
import org.apache.ibatis.annotations.Select;

public interface dorm_adminMapper {
    @Select("select * from dorm_admin where username=#{username} and password=MD5(#{password})")
    dorm_admin seleone(dorm_admin ad);
}
