/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-19 12:05:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pageResources;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class head_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!-- BEGIN HEADER -->\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"header navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- BEGIN TOP NAVIGATION BAR -->\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"navbar-inner\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- BEGIN LOGO -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<a class=\"brand\" href=\"index.jsp\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<img src=\"media/image/logo.png\" alt=\"logo\"/>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- END LOGO -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- BEGIN RESPONSIVE MENU TOGGLER -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"javascript:;\" class=\"btn-navbar collapsed\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<img src=\"media/image/menu-toggler.png\" alt=\"\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</a>          \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- END RESPONSIVE MENU TOGGLER -->            \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- BEGIN TOP NAVIGATION MENU -->              \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<ul class=\"nav pull-right\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- BEGIN NOTIFICATION DROPDOWN -->   \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\" id=\"header_notification_bar\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-warning-sign\"></i>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<span class=\"badge\">6</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu extended notification\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>你有14个新通知</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"label label-success\"><i class=\"icon-plus\"></i></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t新用户注册.\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"time\">现在</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"label label-important\"><i class=\"icon-bolt\"></i></span>\r\n");
      out.write("\r\n");
      out.write("                                    服务器超载12.\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"time\">15 分钟</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"label label-warning\"><i class=\"icon-bell\"></i></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t服务器#2未响应.\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"time\">22 分钟</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"label label-info\"><i class=\"icon-bullhorn\"></i></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t应用程序错误.\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"time\">40 分钟</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"label label-important\"><i class=\"icon-bolt\"></i></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t数据库 超载 68%.\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"time\">2 小时</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"label label-important\"><i class=\"icon-bolt\"></i></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t2 个用户ip锁定.\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"time\">5 小时</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"external\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">想看更多信息... <i class=\"m-icon-swapright\"></i></a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- END NOTIFICATION DROPDOWN -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- BEGIN INBOX DROPDOWN -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\" id=\"header_inbox_bar\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-envelope\"></i>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<span class=\"badge\">5</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu extended inbox\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<ip>你有12个新信息</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"inbox.html?a=view\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"photo\"><img src=\"media/image/avatar2.jpg\" alt=\"\" /></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"subject\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"from\">高圆圆</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"time\">现在</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"message\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t你好！今天是七夕，一起个饭，晚上看个电影可好！\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>  \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"inbox.html?a=view\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"photo\"><img src=\"./media/image/avatar3.jpg\" alt=\"\" /></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"subject\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"from\">赵又廷</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"time\">16 分钟</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"message\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t你好！今天是七夕，一起个饭，晚上看个电影可好！\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>  \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"inbox.html?a=view\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"photo\"><img src=\"./media/image/avatar1.jpg\" alt=\"\" /></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"subject\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"from\">隔壁老王</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"time\">2 小时</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"message\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t你好！今天是七夕，一起个饭，晚上看个电影可好！\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>  \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"external\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"inbox.html\">查看所有信息 <i class=\"m-icon-swapright\"></i></a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- END INBOX DROPDOWN -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- BEGIN TODO DROPDOWN -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\" id=\"header_task_bar\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-tasks\"></i>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<span class=\"badge\">5</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu extended tasks\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>你的12个没有解决的任务</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"task\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"desc\">新版本V1.2</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"percent\">30%</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"progress progress-success \">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\"width: 30%;\" class=\"bar\"></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"task\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"desc\">应用部署</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"percent\">65%</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"progress progress-danger progress-striped active\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\"width: 65%;\" class=\"bar\"></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"task\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"desc\">手机应用程序发布</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"percent\">98%</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"progress progress-success\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\"width: 98%;\" class=\"bar\"></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"task\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"desc\">数据库迁移</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"percent\">10%</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"progress progress-warning progress-striped\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\"width: 10%;\" class=\"bar\"></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"task\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"desc\">Web服务器升级</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"percent\">58%</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"progress progress-info\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\"width: 58%;\" class=\"bar\"></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"task\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"desc\">移动开发</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"percent\">85%</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"progress progress-success\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\"width: 85%;\" class=\"bar\"></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"external\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">查看更多的任务 <i class=\"m-icon-swapright\"></i></a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- END TODO DROPDOWN -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- BEGIN USER LOGIN DROPDOWN -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown user\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<img alt=\"\" src=\"media/image/avatar1_small.jpg\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<span class=\"username\">admin</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-angle-down\"></i>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"extra_profile.html\"><i class=\"icon-user\"></i> 我的简介</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"page_calendar.html\"><i class=\"icon-calendar\"></i>我的日历</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"inbox.html\"><i class=\"icon-envelope\"></i> 我的收件箱(3)</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon-tasks\"></i> 我的任务</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"extra_lock.html\"><i class=\"icon-lock\"></i> 锁定屏幕</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"login.jsp\"><i class=\"icon-key\"></i> 退出系统</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- END USER LOGIN DROPDOWN -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- END TOP NAVIGATION MENU --> \r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- END TOP NAVIGATION BAR -->\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- END HEADER -->");
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
