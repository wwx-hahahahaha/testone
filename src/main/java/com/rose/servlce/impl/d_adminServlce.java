package com.rose.servlce.impl;

import com.rose.domain.dorm_admin;
import com.rose.mapper.dorm_adminMapper;
import com.rose.servlce.dorm_adminServlce;
import com.rose.utils.MybasicUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class d_adminServlce implements dorm_adminServlce {
    public dorm_adminMapper mapper(){
        SqlSessionFactory nun = MybasicUtils.nun();
        SqlSession session = nun.openSession();
        return session.getMapper(dorm_adminMapper.class);
    }
    @Override
    public dorm_admin seleone(dorm_admin da) {
        return mapper().seleone(da);
    }
}
