/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-19 06:53:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pageResources;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pagehead_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"row-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"span12\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- BEGIN STYLE CUSTOMIZER -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"color-panel hidden-phone\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"color-mode-icons icon-color\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"color-mode-icons icon-color-close\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"color-mode\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>主题色</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"inline\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"color-black current color-default\" data-style=\"default\"></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"color-blue\" data-style=\"blue\"></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"color-brown\" data-style=\"brown\"></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"color-purple\" data-style=\"purple\"></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"color-grey\" data-style=\"grey\"></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"color-white color-light\" data-style=\"light\"></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>布局</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"layout-option m-wrap small\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"fluid\" selected>Fluid</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"boxed\">Boxed</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>头部</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"header-option m-wrap small\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"fixed\" selected>Fixed</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"default\">Default</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>侧边栏</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"sidebar-option m-wrap small\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"fixed\">Fixed</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"default\" selected>Default</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>底部</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"footer-option m-wrap small\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"fixed\">Fixed</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"default\" selected>Default</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- END BEGIN STYLE CUSTOMIZER -->    \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- BEGIN PAGE TITLE & BREADCRUMB-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"page-title\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t后台首页\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"breadcrumb\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-home\"></i>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"index.jsp\">首页</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-angle-right\"></i>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">后台管理</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"pull-right no-text-shadow\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"dashboard-report-range\" class=\"dashboard-date-range tooltips no-tooltip-on-touch-device responsive\" data-tablet=\"\" data-desktop=\"tooltips\" data-placement=\"top\" data-original-title=\"Change dashboard date range\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"icon-calendar\"></i>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"icon-angle-down\"></i>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- END PAGE TITLE & BREADCRUMB-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- END PAGE HEADER-->");
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
