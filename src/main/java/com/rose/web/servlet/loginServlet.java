package com.rose.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.rose.domain.System_admin;
import com.rose.domain.dorm_admin;
import com.rose.servlce.impl.d_adminServlce;
import com.rose.servlce.impl.s_adminServlce;
import com.rose.servlce.system_adminServlce;
import com.rose.servlce.dorm_adminServlce;

@WebServlet("/login")
public class loginServlet extends HttpServlet {
    protected system_adminServlce sd=new s_adminServlce();
    protected dorm_adminServlce da=new d_adminServlce();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf8");
        HttpSession session = request.getSession();
        PrintWriter rw = response.getWriter();
        String name = request.getParameter("name");//获取用户名
        String pwd = request.getParameter("pwd");//获取密码
        String rad = request.getParameter("rad");//获取用户选择的是系统管理员还是宿舍管理员
        if ("1".equals(rad)){//1是系统管理员
            System_admin systemAdminm=new System_admin();
            systemAdminm.setUsername(name);
            systemAdminm.setPassword(pwd);
            System_admin seleone = sd.seleone(systemAdminm);
            if (seleone==null){
                rw.write("用户名或密码错误");
            }else {
                rw.write("用户登录成功");
                session.setAttribute("s_admin",seleone);
            }
        }else {
            dorm_admin das=new dorm_admin();
            das.setUsername(name);
            das.setPassword(pwd);
            dorm_admin admin = da.seleone(das);
            if (admin==null){
                rw.write("用户名或密码错误");
            }else {
                rw.write("用户登录成功");
                session.setAttribute("s_admin",admin);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
