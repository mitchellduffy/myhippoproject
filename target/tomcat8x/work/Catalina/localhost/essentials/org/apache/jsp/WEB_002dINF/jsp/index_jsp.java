/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.15
 * Generated at: 2017-11-25 18:08:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <title>Hippo setup</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/components/hippo-theme/dist/css/main.css?v=4.0.2\"/>\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/components/angular-ui-tree/dist/angular-ui-tree.css?v=4.0.2\"/>\n");
      out.write("  <script type=\"application/javascript\">\n");
      out.write("    window.SERVER_URL = '");
      out.print(request.getServerName()+':'+request.getServerPort());
      out.write("';\n");
      out.write("  </script>\n");
      out.write("\n");
      out.write("  ");
      out.write("\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/components/jquery/dist/jquery.js?v=4.0.2\"></script>\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/components/chosen-js/chosen.jquery.js?v=4.0.2\"></script>\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/components/angular/angular.js?v=4.0.2\"></script>\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/components/angular-animate/angular-animate.js?v=4.0.2\"></script>\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/components/angular-aria/angular-aria.js?v=4.0.2\"></script>\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/components/angular-chosen-localytics/dist/angular-chosen.js?v=4.0.2\"></script>\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/components/angular-ui-bootstrap/dist/ui-bootstrap-tpls.js?v=4.0.2\"></script>\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/lib/angular-ui-tree.js?v=4.0.2\"></script>\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/components/hippo-theme/dist/js/main.js?v=4.0.2\"></script>\n");
      out.write("\n");
      out.write("  ");
      out.write("\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/components/angular-ui-router/release/angular-ui-router.js?v=4.0.2\"></script>\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/components/angular-sanitize/angular-sanitize.js?v=4.0.2\"></script>\n");
      out.write("\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/Essentials.js?v=4.0.2\"></script>\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/app.js?v=4.0.2\"></script>\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/routes.js?v=4.0.2\"></script>\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/directives.js?v=4.0.2\"></script>\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/controllers.js?v=4.0.2\"></script>\n");
      out.write("\n");
      out.write("  <link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/favicon.ico\" type=\"image/x-icon\"/>\n");
      out.write("  <link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/favicon.ico\" type=\"image/x-icon\"/>\n");
      out.write("</head>\n");
      out.write("<body id=\"container\"  ng-cloak>\n");
      out.write("<div class=\"hidden\" ng-include=\"'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/components/hippo-theme/dist/images/hippo-icon-sprite.svg?v=4.0.2'\"></div>\n");
      out.write("<essentials-notifier ng-show=\"feedbackMessages.length\" messages=\"feedbackMessages\" ng-class=\"{'log-visible':feedbackMessages.length && addLogClass}\"></essentials-notifier>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"hippo-navbar hippo-navbar-with-sidenav navbar navbar-default navbar-fixed-top\" ng-controller=\"navbarCtrl\" ng-hide=\"INTRODUCTION_DISPLAYED\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" ng-click=\"toggleCollapsed()\">\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("      <span ng-show=\"TOTAL_NEEDS_ATTENTION > 0\" class=\"badge badge-primary notification-badge\">{{TOTAL_NEEDS_ATTENTION}}</span>\n");
      out.write("      <a class=\"navbar-brand\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("         title=\"version: 4.0.2\">Hippo setup</a>\n");
      out.write("      <p class=\"navbar-text navbar-title\">\n");
      out.write("        {{getPageTitle()}}\n");
      out.write("      </p>\n");
      out.write("      <div class=\"navbar-text hippo-navbar-icons\">\n");
      out.write("        <a href=\"#/build\" class=\"navbar-link\">\n");
      out.write("          <hippo-icon name=\"refresh\"></hippo-icon>\n");
      out.write("          <span class=\"hidden-xs\">Rebuild</span>\n");
      out.write("          <hippo-icon name=\"bell\" class=\"hi-color-danger\" ng-show=\"NEEDS_REBUILD\"></hippo-icon>\n");
      out.write("        </a>\n");
      out.write("        <a href=\"#\" ng-click=\"showMessages($event)\" ng-show=\"feedbackMessages.length && showMessagesNavbarLink\"\n");
      out.write("           class=\"navbar-link\" title=\"{{feedbackMessages.length}} notification message(s)\">\n");
      out.write("          <hippo-icon name=\"info-circle\" size=\"m\"></hippo-icon><span class=\"badge badge-info\">{{feedbackMessages.length}}</span>\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"navbar-collapse collapse hippo-sidenav ng-scope\" ng-controller=\"mainMenuCtrl\" uib-collapse=\"isCollapsed\" ng-hide=\"INTRODUCTION_DISPLAYED\">\n");
      out.write("      <ul class=\"nav navbar-nav\" ng-hide=\"INTRODUCTION_DISPLAYED\">\n");
      out.write("        <li ng-class=\"{true:'active', false:''}[isPageSelected('#/library')]\">\n");
      out.write("          <a href=\"#/library\">\n");
      out.write("            <hippo-icon name=\"shopping-cart\" size=\"m\"></hippo-icon>\n");
      out.write("           Library\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li ng-show=\"INSTALLED_FEATURES > 0\" ng-class=\"{true:'active', false:''}[isPageSelected('#/installed-features')]\">\n");
      out.write("          <a href=\"#/installed-features\">\n");
      out.write("            <hippo-icon name=\"arrow-fat-down-circle\" size=\"m\" class=\"hi-fill-white\"></hippo-icon>\n");
      out.write("            Installed features&nbsp;&nbsp;\n");
      out.write("            <span ng-show=\"TOTAL_NEEDS_ATTENTION > 0\" class=\"badge badge-danger\" style=\"position:fixed\">{{TOTAL_NEEDS_ATTENTION}}</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li ng-class=\"{true:'active', false:''}[isPageSelected('#/tools')]\">\n");
      out.write("          <a href=\"#/tools\">\n");
      out.write("            <hippo-icon name=\"wrench\" size=\"m\"></hippo-icon>\n");
      out.write("              Tools\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <a target=\"_blank\" href=\"https://issues.onehippo.com/rest/collectors/1.0/template/form/e07a17b7?os_authType=none\">\n");
      out.write("            <hippo-icon name=\"comment\" size=\"m\"></hippo-icon>\n");
      out.write("            Feedback</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"main-content\">\n");
      out.write("  <div class=\"container-fluid flex-column\" ui-view>\n");
      out.write("    <h2>initializing...</h2>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- Include the loader.js script -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/loader.js\" data-modules=\"http://");
      out.print(request.getServerName()+':'+request.getServerPort());
      out.write("/essentials/rest/plugins/modules\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("  input.ng-invalid,\n");
      out.write("  input.ng-invalid-minlength {\n");
      out.write("    background-color: #e7484c;\n");
      out.write("    color: #fff;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  select.ng-invalid + div.chosen-container {\n");
      out.write("    box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);\n");
      out.write("    border: 2px solid #e7484c;\n");
      out.write("    -webkit-border-radius: 3px;\n");
      out.write("    -moz-border-radius: 3px;\n");
      out.write("    border-radius: 3px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  input:focus.ng-invalid,\n");
      out.write("  input:focus.ng-invalid-minlength {\n");
      out.write("    -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);\n");
      out.write("    box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);\n");
      out.write("    border: 3px solid #e7484c;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  input.ng-valid,\n");
      out.write("  input:focus.ng-valid {\n");
      out.write("    background-color: #fff;\n");
      out.write("    color: #000;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  [ng\\:cloak],\n");
      out.write("  [ng-cloak],\n");
      out.write("  [data-ng-cloak],\n");
      out.write("  [x-ng-cloak],\n");
      out.write("  .ng-cloak,\n");
      out.write("  .x-ng-cloak,\n");
      out.write("  .ng-hide {\n");
      out.write("    display: none !important;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  ng\\:form {\n");
      out.write("    display: block;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  div.chosen-container[style] {\n");
      out.write("    min-width: 100px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  @-webkit-keyframes feedback_sequence {\n");
      out.write("    from {\n");
      out.write("      opacity: 0;\n");
      out.write("    }\n");
      out.write("    to {\n");
      out.write("      opacity: 1;\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  @keyframes feedback_sequence {\n");
      out.write("    from {\n");
      out.write("      opacity: 0;\n");
      out.write("    }\n");
      out.write("    to {\n");
      out.write("      opacity: 1;\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
