package com.rose.mapper;

import com.rose.domain.System_admin;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface System_adminMapper {
    @Select("select * from System_admin where username=#{username} and password=MD5(#{password})")
    System_admin seleone(System_admin sa);

    @Select("select * from System_admin")
    List<System_admin>sele();
}
