/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-11 03:35:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<!--[if IE 8]> <html lang=\"en\" class=\"ie8\"> <![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!--[if IE 9]> <html lang=\"en\" class=\"ie9\"> <![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!--[if !IE]><!-->\r\n");
      out.write("<html lang=\"en\"> <!--<![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!-- BEGIN HEAD -->\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\"/>\r\n");
      out.write("\r\n");
      out.write("    <title>Metronic | 后台登录</title>\r\n");
      out.write("\r\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\"/>\r\n");
      out.write("\r\n");
      out.write("    <meta content=\"\" name=\"description\"/>\r\n");
      out.write("\r\n");
      out.write("    <meta content=\"\" name=\"author\"/>\r\n");
      out.write("\r\n");
      out.write("    <!-- BEGIN GLOBAL MANDATORY STYLES -->\r\n");
      out.write("\r\n");
      out.write("    <link href=\"media/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"media/css/bootstrap-responsive.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"media/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"media/css/style-metro.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"media/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"media/css/style-responsive.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"media/css/default.css\" rel=\"stylesheet\" type=\"text/css\" id=\"style_color\"/>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"media/css/uniform.default.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("    <!-- END GLOBAL MANDATORY STYLES -->\r\n");
      out.write("\r\n");
      out.write("    <!-- BEGIN PAGE LEVEL STYLES -->\r\n");
      out.write("\r\n");
      out.write("    <link href=\"media/css/login-soft.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("    <!-- END PAGE LEVEL STYLES -->\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"media/image/favicon.ico\"/>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- END HEAD -->\r\n");
      out.write("\r\n");
      out.write("<!-- BEGIN BODY -->\r\n");
      out.write("\r\n");
      out.write("<body class=\"login\">\r\n");
      out.write("\r\n");
      out.write("<!-- BEGIN LOGO -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"logo\">\r\n");
      out.write("\r\n");
      out.write("    <!-- <img src=\"media/image/logo-big.png\" alt=\"\" />  -->\r\n");
      out.write("    <h1>后台管理平台</h1>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- END LOGO -->\r\n");
      out.write("\r\n");
      out.write("<!-- BEGIN LOGIN -->\r\n");
      out.write("<script>\r\n");
      out.write("    function d() {\r\n");
      out.write("        var user = document.getElementById(\"user\").value;\r\n");
      out.write("        var password = document.getElementById(\"password\").value;\r\n");
      out.write("        if (user == null || user == \"\") {\r\n");
      out.write("            alert(\"请输入用户名\")\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        if (password == null || password == \"\") {\r\n");
      out.write("            alert(\"请输入密码\")\r\n");
      out.write("\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("    <!-- 验证码图片点击切换 -->\r\n");
      out.write("    <!-- 通过Date来改变每次访问的url不同 -->\r\n");
      out.write("<script>\r\n");
      out.write("    function Reload() {\r\n");
      out.write("        document.getElementById(\"CreateCheckCode\").src =\r\n");
      out.write("            // 获取当前时间使其请求不重复\r\n");
      out.write("            document.getElementById(\"CreateCheckCode\").src + \"?nocache=\" + new Date().getTime() + \".do\";\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("\r\n");
      out.write("    <!-- begin login form -->\r\n");
      out.write("\r\n");
      out.write("    <form class=\"form-vertical login-form\" action=\"LoginServlet.do\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("        <h3 class=\"form-title\">登录到你的账户</h3>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"alert alert-error hide\">\r\n");
      out.write("\r\n");
      out.write("            <button class=\"close\" data-dismiss=\"alert\"></button>\r\n");
      out.write("\r\n");
      out.write("            <span>请你输入你的账号和密码.</span>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("\r\n");
      out.write("            <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->\r\n");
      out.write("\r\n");
      out.write("            <label class=\"control-label visible-ie8 visible-ie9\">用户名</label>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"input-icon left\">\r\n");
      out.write("\r\n");
      out.write("                    <i class=\"icon-user\"></i>\r\n");
      out.write("\r\n");
      out.write("                    <input class=\"m-wrap placeholder-no-fix\" type=\"text\" placeholder=\"用户名/手机号/微信号\" name=\"username\"\r\n");
      out.write("                           id=\"user\"/>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("\r\n");
      out.write("            <label class=\"control-label visible-ie8 visible-ie9\">密码</label>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"input-icon left\">\r\n");
      out.write("\r\n");
      out.write("                    <i class=\"icon-lock\"></i>\r\n");
      out.write("\r\n");
      out.write("                    <input class=\"m-wrap placeholder-no-fix\" type=\"password\" placeholder=\"密码\" name=\"password\"\r\n");
      out.write("                           id=\"password\"/>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("\r\n");
      out.write("            <label class=\"control-label visible-ie8 visible-ie9\">验证码</label>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"input-icon left\">\r\n");
      out.write("\r\n");
      out.write("                    <i class=\"icon-book\"></i>\r\n");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <input style=\"width:49%;float:left;height: 24px;\" type=\"text\" placeholder=\"验证码\" name=\"check\"\r\n");
      out.write("                           id=\"check\"/>\r\n");
      out.write("\r\n");
      out.write("                    <span style=\"cursor:pointer;float: right;height: 34px; width: 30%;\">\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                        <img id=\"CreateCheckCode\" style=\"width: 100%;height:100%;\" src=\"checkCode.do\"\r\n");
      out.write("                             onclick=\"Reload()\"/>\r\n");
      out.write("                    </span>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form-actions\">\r\n");
      out.write("\r\n");
      out.write("            <label class=\"checkbox\">\r\n");
      out.write("\r\n");
      out.write("                <input type=\"checkbox\" name=\"remember\" value=\"1\"/> 记住我\r\n");
      out.write("\r\n");
      out.write("            </label>\r\n");
      out.write("\r\n");
      out.write("            <button type=\"submit\" class=\"btn blue pull-right\" onclick=\"return d()\">\r\n");
      out.write("\r\n");
      out.write("                登录 <i class=\"m-icon-swapright m-icon-white\"></i>\r\n");
      out.write("\r\n");
      out.write("            </button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"forget-password\">\r\n");
      out.write("\r\n");
      out.write("            <h4>忘记了你的密码 ?</h4>\r\n");
      out.write("\r\n");
      out.write("            <p>\r\n");
      out.write("\r\n");
      out.write("                不用担心，点击 <a href=\"javascript:;\" class=\"\" id=\"forget-password\">这里</a>\r\n");
      out.write("\r\n");
      out.write("                找回你的密码！！！\r\n");
      out.write("\r\n");
      out.write("            </p>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"create-account\">\r\n");
      out.write("\r\n");
      out.write("            <p>\r\n");
      out.write("\r\n");
      out.write("                如果你还没有账号 ?&nbsp;\r\n");
      out.write("\r\n");
      out.write("                <a href=\"javascript:;\" id=\"register-btn\" class=\"\">创建账户</a>\r\n");
      out.write("\r\n");
      out.write("            </p>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("    <!-- end login form -->\r\n");
      out.write("\r\n");
      out.write("    <!-- begin forgot password form -->\r\n");
      out.write("    <script>\r\n");
      out.write("        function em() {\r\n");
      out.write("            var name = document.getElementById(\"name1\").value;\r\n");
      out.write("            var email1 = document.getElementById(\"email1\").value;\r\n");
      out.write("            if (name == null || name == \"\") {\r\n");
      out.write("                alert(\"请输入要验证的用户名\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            if (email1 == null || email1 == \"\") {\r\n");
      out.write("                alert(\"请输入要验证的邮箱\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            return true;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    <form class=\"form-vertical forget-form\" action=\"PasswordFindServlet.do\" method=\"post\">\r\n");
      out.write("        <input type=\"hidden\" name=\"do\" value=\"email\">\r\n");
      out.write("        <h3 class=\"\">忘记密码 ?</h3>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <p>请输入您的用户名和电子邮件地址以重置密码.</p>\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("\r\n");
      out.write("            <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->\r\n");
      out.write("\r\n");
      out.write("            <label class=\"control-label visible-ie8 visible-ie9\">用户名</label>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"input-icon left\">\r\n");
      out.write("\r\n");
      out.write("                    <i class=\"icon-user\"></i>\r\n");
      out.write("\r\n");
      out.write("                    <input class=\"m-wrap placeholder-no-fix\" type=\"text\" placeholder=\"用户名/手机号/微信号\" name=\"username\"\r\n");
      out.write("                           id=\"name1\"/>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"input-icon left\">\r\n");
      out.write("\r\n");
      out.write("                    <i class=\"icon-envelope\"></i>\r\n");
      out.write("\r\n");
      out.write("                    <input class=\"m-wrap placeholder-no-fix\" type=\"text\" placeholder=\"email\" name=\"email\" id=\"emil1\"/>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form-actions\">\r\n");
      out.write("\r\n");
      out.write("            <button type=\"button\" id=\"back-btn\" class=\"btn\">\r\n");
      out.write("\r\n");
      out.write("                <i class=\"m-icon-swapleft\"></i> 返回\r\n");
      out.write("\r\n");
      out.write("            </button>\r\n");
      out.write("\r\n");
      out.write("            <button type=\"submit\" class=\"btn blue pull-right\" onclick=\"return em()\">\r\n");
      out.write("\r\n");
      out.write("                提交 <i class=\"m-icon-swapright m-icon-white\"></i>\r\n");
      out.write("\r\n");
      out.write("            </button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("    <!-- end forgot password form -->\r\n");
      out.write("\r\n");
      out.write("    <!-- begin registration form -->\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        function f() {\r\n");
      out.write("            var name = document.getElementById(\"name\").value;\r\n");
      out.write("            var password = document.getElementById(\"register_password\").value;\r\n");
      out.write("            var password1 = document.getElementById(\"password1\").value;\r\n");
      out.write("\r\n");
      out.write("            var age = document.getElementById(\"age\").value;\r\n");
      out.write("            var email = document.getElementById(\"email\").value;\r\n");
      out.write("            //alert(name,password,password1,age,email)\r\n");
      out.write("\r\n");
      out.write("            if (name == null || name == \"\") {\r\n");
      out.write("                alert(\"用户名不能为空\")\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            if (password == null || password == \"\") {\r\n");
      out.write("                alert(\"密码不能为空\")\r\n");
      out.write("                return false;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            if (password1 == null || password1 == \"\") {\r\n");
      out.write("                alert(\"确认密码不能为空！！\")\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            if (password != password1) {\r\n");
      out.write("                alert(\"两次输入的密码不一致！\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            if (age == null || age == \"\") {\r\n");
      out.write("                alert(\"你年龄不能为空\")\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            if (email == null || email == \"\") {\r\n");
      out.write("                alert(\"邮箱不能为空！！\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            //邮箱验证\r\n");
      out.write("            var reg = new RegExp(\"^[a-z0-9]+([._\\\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$\");\r\n");
      out.write("            if (!reg.test(email)) {\r\n");
      out.write("                alert(\"邮箱格式错误！！\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            return true;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    <form class=\"form-vertical register-form\" action=\"regist.do\" method=\"post\"\r\n");
      out.write("    >\r\n");
      out.write("\r\n");
      out.write("        <h3 class=\"\">注册</h3>\r\n");
      out.write("\r\n");
      out.write("        <p>输入您的帐户详情如下：</p>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("\r\n");
      out.write("            <label class=\"control-label visible-ie8 visible-ie9\">username</label>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"input-icon left\">\r\n");
      out.write("\r\n");
      out.write("                    <i class=\"icon-user\"></i>\r\n");
      out.write("\r\n");
      out.write("                    <input class=\"m-wrap placeholder-no-fix\" type=\"text\" placeholder=\"用户名/手机号/微信号\" name=\"name\"\r\n");
      out.write("                           id=\"name\"/>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("\r\n");
      out.write("            <label class=\"control-label visible-ie8 visible-ie9\">password</label>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"input-icon left\">\r\n");
      out.write("\r\n");
      out.write("                    <i class=\"icon-lock\"></i>\r\n");
      out.write("\r\n");
      out.write("                    <input class=\"m-wrap placeholder-no-fix\" type=\"password\" id=\"register_password\" placeholder=\"密码\"\r\n");
      out.write("                           name=\"password\" aria-invalid=\"password\"/>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("\r\n");
      out.write("            <label class=\"control-label visible-ie8 visible-ie9\">重新键入密码</label>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"input-icon left\">\r\n");
      out.write("\r\n");
      out.write("                    <i class=\"icon-ok\"></i>\r\n");
      out.write("\r\n");
      out.write("                    <input class=\"m-wrap placeholder-no-fix\" type=\"password\" placeholder=\"重新键入密码\" name=\"rpassword\"\r\n");
      out.write("                           id=\"password1\"\r\n");
      out.write("                    />\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("\r\n");
      out.write("            <label class=\"control-label visible-ie8 visible-ie9\">年龄</label>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"input-icon left\">\r\n");
      out.write("\r\n");
      out.write("                    <i class=\"icon-ok\"></i>\r\n");
      out.write("\r\n");
      out.write("                    <input class=\"m-wrap placeholder-no-fix\" type=\"text\" placeholder=\"年龄\" name=\"age\" id=\"age\"/>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("\r\n");
      out.write("            <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->\r\n");
      out.write("\r\n");
      out.write("            <label class=\"control-label visible-ie8 visible-ie9\">邮箱</label>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"input-icon left\">\r\n");
      out.write("\r\n");
      out.write("                    <i class=\"icon-envelope\"></i>\r\n");
      out.write("\r\n");
      out.write("                    <input class=\"m-wrap placeholder-no-fix\" type=\"text\" placeholder=\"email\" name=\"email\" id=\"email\"/>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("\r\n");
      out.write("                <label class=\"checkbox\">\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"checkbox\" name=\"tnc\"/>同意 <a href=\"#\">服务条款</a> 和 <a href=\"#\">隐私政策</a>\r\n");
      out.write("\r\n");
      out.write("                </label>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"register_tnc_error\"></div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form-actions\">\r\n");
      out.write("\r\n");
      out.write("            <button id=\"register-back-btn\" type=\"button\" class=\"btn\">\r\n");
      out.write("\r\n");
      out.write("                <i class=\"m-icon-swapleft\"></i> 返回\r\n");
      out.write("\r\n");
      out.write("            </button>\r\n");
      out.write("\r\n");
      out.write("            <button type=\"submit\" id=\"register-submit-btn\" class=\"btn blue pull-right\" onclick=\"return f()\">\r\n");
      out.write("\r\n");
      out.write("                提交 <i class=\"m-icon-swapright m-icon-white\"></i>\r\n");
      out.write("\r\n");
      out.write("            </button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("    <!-- end registration form -->\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- END LOGIN -->\r\n");
      out.write("\r\n");
      out.write("<!-- BEGIN COPYRIGHT -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"copyright\">\r\n");
      out.write("\r\n");
      out.write("    2019 &copy; 通用系统后台管理平台.\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- END COPYRIGHT -->\r\n");
      out.write("\r\n");
      out.write("<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->\r\n");
      out.write("\r\n");
      out.write("<!-- BEGIN CORE PLUGINS -->\r\n");
      out.write("\r\n");
      out.write("<script src=\"media/js/jquery-1.10.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"media/js/jquery-migrate-1.2.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->\r\n");
      out.write("\r\n");
      out.write("<script src=\"media/js/jquery-ui-1.10.1.custom.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"media/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("\r\n");
      out.write("<script src=\"media/js/excanvas.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"media/js/respond.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<![endif]-->\r\n");
      out.write("\r\n");
      out.write("<script src=\"media/js/jquery.slimscroll.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"media/js/jquery.blockui.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"media/js/jquery.cookie.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"media/js/jquery.uniform.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- END CORE PLUGINS -->\r\n");
      out.write("\r\n");
      out.write("<!-- BEGIN PAGE LEVEL PLUGINS -->\r\n");
      out.write("\r\n");
      out.write("<script src=\"media/js/jquery.validate.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"media/js/jquery.backstretch.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- END PAGE LEVEL PLUGINS -->\r\n");
      out.write("\r\n");
      out.write("<!-- BEGIN PAGE LEVEL SCRIPTS -->\r\n");
      out.write("\r\n");
      out.write("<script src=\"media/js/app.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--  <script src=\"media/js/login-soft.js\" type=\"text/javascript\"></script>\r\n");
      out.write("-->\r\n");
      out.write("<!-- END PAGE LEVEL SCRIPTS -->\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("    jQuery(document).ready(function () {\r\n");
      out.write("\r\n");
      out.write("        App.init();\r\n");
      out.write("\r\n");
      out.write("        Login.init();\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    /*丢失密码的时候显示找回页面  */\r\n");
      out.write("    jQuery('#forget-password').click(function () {\r\n");
      out.write("        jQuery('.login-form').hide();\r\n");
      out.write("        jQuery('.forget-form').show();\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    jQuery('#back-btn').click(function () {\r\n");
      out.write("        jQuery('.login-form').show();\r\n");
      out.write("        jQuery('.forget-form').hide();\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    /*没有注册的时候点击跳转到注册页面  */\r\n");
      out.write("    jQuery('#register-btn').click(function () {\r\n");
      out.write("        jQuery('.login-form').hide();\r\n");
      out.write("        jQuery('.register-form').show();\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    jQuery('#register-back-btn').click(function () {\r\n");
      out.write("        jQuery('.login-form').show();\r\n");
      out.write("        jQuery('.register-form').hide();\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    $.backstretch([\r\n");
      out.write("        \"media/image/bg/1.jpg\",\r\n");
      out.write("        \"media/image/bg/2.jpg\",\r\n");
      out.write("        \"media/image/bg/3.jpg\",\r\n");
      out.write("        \"media/image/bg/4.jpg\"\r\n");
      out.write("    ], {\r\n");
      out.write("        fade: 1000,\r\n");
      out.write("        duration: 4000\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!-- END JAVASCRIPTS -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<!-- END BODY -->\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
