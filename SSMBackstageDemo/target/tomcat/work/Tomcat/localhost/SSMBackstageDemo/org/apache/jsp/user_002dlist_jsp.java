/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-19 12:05:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<!--[if IE 8]> <html lang=\"en\" class=\"ie8\"> <![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!--[if IE 9]> <html lang=\"en\" class=\"ie9\"> <![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!--[if !IE]><!-->\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<!--<![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!-- BEGIN HEAD -->\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("\r\n");
      out.write("<title>用户管理</title>\r\n");
      out.write("\r\n");
      out.write("<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\" />\r\n");
      out.write("\r\n");
      out.write("<meta content=\"\" name=\"description\" />\r\n");
      out.write("\r\n");
      out.write("<meta content=\"\" name=\"author\" />\r\n");
      out.write("\r\n");
      out.write("<!-- BEGIN GLOBAL MANDATORY STYLES -->\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "pageResources/css.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- END GLOBAL MANDATORY STYLES -->\r\n");
      out.write("\r\n");
      out.write("<!-- BEGIN PAGE LEVEL STYLES -->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"media/css/select2_metro.css\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"media/css/DT_bootstrap.css\" />\r\n");
      out.write("\r\n");
      out.write("<!-- END PAGE LEVEL STYLES -->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"media/image/favicon.ico\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<!-- END HEAD -->\r\n");
      out.write("\r\n");
      out.write("<!-- BEGIN BODY -->\r\n");
      out.write("\r\n");
      out.write("<body class=\"page-header-fixed\">\r\n");
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
      out.write("\r\n");
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
      out.write("\t\t\t<!-- BEGIN PAGE CONTAINER-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- BEGIN PAGE HEADER-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "pageResources/pagehead.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t<!-- END PAGE HEADER-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- BEGIN EXAMPLE TABLE PORTLET-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"portlet box blue\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"portlet-title\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"caption\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-edit\"></i>用户列表\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"tools\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"collapse\"></a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"#portlet-config\" data-toggle=\"modal\" class=\"config\"></a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"javascript:;\" class=\"reload\"></a> <a href=\"javascript:;\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"remove\"></a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"portlet-body\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"btn-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t <button id=\"sample_editable_1_new\" class=\"btn green\" onclick=\"window.location.href='user-add.jsp'\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t添加 <i class=\"icon-plus\"></i>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</button> \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"btn-group pull-right\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t工具 <i class=\"icon-angle-down\"></i>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu pull-right\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">打印</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">保存为PDF</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">导出到 Excel</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<table class=\"table table-striped table-hover table-bordered\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"sample_editable_1\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>编号</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>用户名</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>年龄</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>邮箱</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>操作</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\r\n");
      out.write("\t <!-- ulist是servlet放到serssion中的，这里循环把他们取出来 -->\r\n");
      out.write("     ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- END EXAMPLE TABLE PORTLET-->\r\n");
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
      out.write("\t<!-- BEGIN FOOTER -->\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "pageResources/foot.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- END FOOTER -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- BEGIN CORE PLUGINS -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "pageResources/js.jsp", out, false);
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /user-list.jsp(183,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/user-list.jsp(183,5) '${ulist}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${ulist}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /user-list.jsp(183,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("list");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("     <tr>\r\n");
          out.write("         <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("         <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("         <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.age }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("         <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("         <td>\r\n");
          out.write("         <a href=\"findUserById.do?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">修改</a>\r\n");
          out.write("         <a href=\"deleteUser.do?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" onclick=\"javascript:return confirm('确认删除吗？');\">删除</a>\r\n");
          out.write("         </td>\r\n");
          out.write("     </tr>\r\n");
          out.write("     ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
