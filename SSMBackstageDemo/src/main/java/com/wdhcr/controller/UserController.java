package com.wdhcr.controller;

import com.wdhcr.po.User;
import com.wdhcr.service.UserServicesImp;
import com.wdhcr.tools.MailUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Random;

@Controller
public class UserController {
    @Resource(name = "userServicesImp")
    private UserServicesImp userServicesImp;

    //用户登录
    @RequestMapping(value = "/LoginServlet")
    public void login(String username, String password, String check, HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&" + username + "\t" + password+"\t"+check);
        //后台打印数据库信息
        List<User> allUser = userServicesImp.getAllUser();
        for (User user : allUser) {
            System.out.println(user.toString());
        }
        //获取请求会话 的session域
        HttpSession session = request.getSession(true);
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (allUser.size() != 0) {

            for (User user : allUser) {
                //判断用户名，密码
                if (username.equals(user.getName()) && password.equals(user.getPassword())) {
                    //创建session域的对象，获取域中的数据
                    if (session.getAttribute("randCheckCode").toString().equalsIgnoreCase(check)) {
                        try {
                            //验证成功后，转发到index页面
                            request.getRequestDispatcher("index.jsp").forward(request, response);
                        } catch (ServletException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }else {

                        //验证码输入错误，弹窗提示，并返回到login页面
                        writer.println("<script>alert('登录失败了！验证码错误！！！');window.location='login.jsp';</script>");


                    }
                } else {

                    //失败页面弹窗提示，并返回到登陆页面
                    writer.println("<script>alert('登录失败了！请你检查你的用户名字！！！');window.location='login.jsp';</script>");
                }
            }
        } else {
            writer.println("<script>alert('登录失败了！请你检查你的用户名字！！！');window.location='login.jsp';</script>");

        }
    }

    //用户注册
    @RequestMapping(value = "/regist")
    public void regist(User user, HttpServletResponse response) {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&" + user.getPassword() + "\t" + user.getName());
        //name，password做有前端验证，
        int row = userServicesImp.addUser(user);
//        创建打印流对象
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (row > 0) {
            //添加成功，提示并返回到登录页面
            writer.println("<script>\n" +
                    "    alert(\"注册成功！！\");\n" +
                    "    window.location = \"login.jsp\";\n" +
                    "</script>");
        } else {

            writer.println("<script>\n" +
                    "    alert(\"注册失败！！\");\n" +
                    "    window.location = \"login.jsp\";\n" +
                    "</script>");
        }
    }

    //找回密码
    @RequestMapping(value = "/PasswordFindServlet")
    public void PasswordFindServlet(String username, String email, HttpServletResponse response) {


        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$" + username + email);
        Random random = new Random();
        String rpassword = String.valueOf(Math.abs(random.nextInt()) % 1000000);
        System.out.println("*******************" + rpassword);
        //根据emil修改用户的密码
        User user = new User();
        user.setName(username);
        user.setPassword(rpassword);
        user.setEmail(email);
        int row = userServicesImp.updatePassword(user);
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (row > 0) {

            System.out.println("修改成功");
            //调用tools中的mailutil方法
            MailUtil.sendMail(email, username, rpassword);
            writer.println("<script>\n" +
                    "    alert(\"修改成功！！\");\n" +
                    "    window.location = \"login.jsp\";\n" +
                    "</script>");

        } else {
            writer.println("<script>\n" +
                    "    alert(\"修改失败！！\");\n" +
                    "    window.location = \"login.jsp\";\n" +
                    "</script>");

        }


    }

    //添加用户
    @RequestMapping(value = "/addUser")
    public void addUser(User user, HttpServletResponse response) {

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        System.out.println("*********" + user.getName() + user.getPassword());
        //调用service层信息
        int row = userServicesImp.addUser(user);
        //创建页面打印对象
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (row > 0) {
            writer.println("<script>\n" +
                    "    alert(\"添加成功！！\");\n" +
                    "    window.location = \"index.jsp\";\n" +
                    "</script>");

        } else {
            writer.println("<script>\n" +
                    "    alert(\"添加失败！！\");\n" +
                    "    window.location = \"index.jsp\";\n" +
                    "</script>");
        }

    }

    //查询所有用户
    @RequestMapping(value = "/UserAll")
    public ModelAndView getAllUser() {
        List<User> allUser = userServicesImp.getAllUser();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("ulist", allUser);
        modelAndView.setViewName("user-list.jsp");
        return modelAndView;
    }

    //修改用户信息
    //首先根据id查询用户信息，
    @RequestMapping(value = "/findUserById")
    public ModelAndView findUserById(int id) {
        User userById = userServicesImp.findUserById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", userById);
        modelAndView.setViewName("user-edit.jsp");
        return modelAndView;
    }

    @RequestMapping(value = "/updateUser")
    public void updateUser(User user, HttpServletResponse response) {
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        int row = userServicesImp.updateUser(user);
        //获取页面打印对象
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (row > 0) {
            writer.println("<script>\n" +
                    "    alert(\"修改成功！！\");\n" +
                    "    window.location = \"index.jsp\";\n" +
                    "</script>");
        } else {
            writer.println("<script>\n" +
                    "    alert(\"修改失败！！\");\n" +
                    "    window.location = \"index.jsp\";\n" +
                    "</script>");
        }

    }

    //删除用户
    @RequestMapping(value = "/deleteUser")
    public void deleteUser(int id, HttpServletResponse response) {
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        int row = userServicesImp.deleteUser(id);
        //获取页面打印对象
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (row > 0) {
            writer.println("<script>\n" +
                    "    alert(\"删除成功！！\");\n" +
                    "    window.location = \"index.jsp\";\n" +
                    "</script>");
        } else {
            writer.println("<script>\n" +
                    "    alert(\"删除失败！！\");\n" +
                    "    window.location = \"index.jsp\";\n" +
                    "</script>");
        }
    }


}
