/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-19 11:47:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class goods_002dedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<!--[if IE 8]> <html lang=\"en\" class=\"ie8\"> <![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!--[if IE 9]> <html lang=\"en\" class=\"ie9\"> <![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!--[if !IE]><!--> <html lang=\"en\"> <!--<![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!-- BEGIN HEAD -->\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\t<meta charset=\"utf-8\" />\r\n");
      out.write("\r\n");
      out.write("\t<title>修改商品信息页面</title>\r\n");
      out.write("\r\n");
      out.write("\t<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\" />\r\n");
      out.write("\r\n");
      out.write("\t<meta content=\"\" name=\"description\" />\r\n");
      out.write("\r\n");
      out.write("\t<meta content=\"\" name=\"author\" />\r\n");
      out.write("\r\n");
      out.write("\t<!-- BEGIN GLOBAL MANDATORY STYLES -->\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "pageResources/css.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- END GLOBAL MANDATORY STYLES -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- BEGIN PAGE LEVEL STYLES -->\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"media/css/select2_metro.css\" />\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"media/css/DT_bootstrap.css\" />\r\n");
      out.write("\r\n");
      out.write("\t<!-- END PAGE LEVEL STYLES -->\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"media/image/favicon.ico\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<!-- END HEAD -->\r\n");
      out.write("\r\n");
      out.write("<!-- BEGIN BODY -->\r\n");
      out.write("\r\n");
      out.write("<body class=\"page-header-fixed\">\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "pageResources/head.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- BEGIN CONTAINER -->\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"page-container row-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- BEGIN SIDEBAR -->\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"page-sidebar nav-collapse collapse\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "pageResources/nav.jsp", out, false);
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- END SIDEBAR -->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- BEGIN PAGE -->\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"page-content\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"portlet-config\" class=\"modal hide\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<button data-dismiss=\"modal\" class=\"close\" type=\"button\"></button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<h3>portlet Settings</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<p>Here will be a configuration form</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- BEGIN PAGE CONTAINER-->        \r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- BEGIN PAGE HEADER-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "pageResources/pagehead.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- END PAGE HEADER-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"portlet-body form\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<form action=\"updateGoods.do\" method=\"post\" class=\"horizontal-form\">\r\n");
      out.write("                        <input type=\"hidden\" name=\"do\" value=\"edit\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"span12 \">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label\">商品名称</label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"  class=\"m-wrap span12\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"span12 \">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label\">类型</label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"type\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.type }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"m-wrap span12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"span12 \">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label\">单价</label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\"  name=\"price\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.price }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"m-wrap span12\">\r\n");
      out.write("                                        <input type=\"hidden\"  name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"span12 \">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label\">库存数量</label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"number\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.number }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"m-wrap span12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-actions\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn blue\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-ok\"></i> 提交\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn\" >取消</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- END PAGE CONTAINER-->\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- END PAGE -->\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- END CONTAINER -->\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "pageResources/foot.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- BEGIN CORE PLUGINS -->\r\n");
      out.write("\t\r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "pageResources/js.jsp", out, false);
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\t<script>\r\n");
      out.write("\r\n");
      out.write("\t\tjQuery(document).ready(function() {       \r\n");
      out.write("\r\n");
      out.write("\t\t   App.init();\r\n");
      out.write("\r\n");
      out.write("\t\t   TableEditable.init();\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
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