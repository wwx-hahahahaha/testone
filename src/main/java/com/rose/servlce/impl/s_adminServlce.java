package com.rose.servlce.impl;

import com.rose.domain.System_admin;
import com.rose.mapper.System_adminMapper;
import com.rose.servlce.system_adminServlce;
import com.rose.utils.MybasicUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class s_adminServlce implements system_adminServlce{
    private System_adminMapper mapper(){
        SqlSessionFactory nun = MybasicUtils.nun();
        SqlSession session = nun.openSession();
        return session.getMapper(System_adminMapper.class);
    }

    @Override
    public System_admin seleone(System_admin sd) {
        return mapper().seleone(sd);
    }

    @Override
    public List<System_admin> sele() {
        return mapper().sele();
    }
}
