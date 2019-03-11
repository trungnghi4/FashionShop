package org.apache.jsp.WEB_002dINF.view.client.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_var_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Login</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Favicon -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Web Fonts -->\r\n");
      out.write("    <link rel='stylesheet' type='text/css' href='//fonts.googleapis.com/css?family=Open+Sans:400,300,600&amp;subset=cyrillic,latin'>\r\n");
      out.write("\r\n");
      out.write("    <!-- CSS Global Compulsory -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/shop.style.css\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- CSS Header and Footer -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/headers/header-v5.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/footers/footer-v4.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- CSS Implementing Plugins -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/animate.css\">    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/line-icons/line-icons.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/scrollbar/css/jquery.mCustomScrollbar.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- CSS Page Style -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/pages/log-reg-v3.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Style Switcher -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/plugins/style-switcher.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- CSS Theme -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/theme-colors/default.css\" id=\"style_color\">\r\n");
      out.write("\r\n");
      out.write("    <!-- CSS Customization -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/custom.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<body class=\"header-fixed\">\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("    <!--=== Header v5 ===-->   \r\n");
      out.write("    <div class=\"header-v5 header-");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("        <!-- Topbar v3 -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "topbar.jsp", out, false);
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <!-- End Topbar v3 -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Navbar -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\r\n");
      out.write("        <!-- End Navbar -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--=== End Header v5 ===-->\r\n");
      out.write("\r\n");
      out.write("    <!--=== Breadcrumbs v4 ===-->\r\n");
      out.write("    <div class=\"breadcrumbs-v4\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <span class=\"page-name\">Log In</span>\r\n");
      out.write("            <h1>Maecenas <span class=\"shop-green\">enim</span> sapien</h1>\r\n");
      out.write("            <ul class=\"breadcrumb-v4-in\">\r\n");
      out.write("                <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("                <li><a href=\"\">Product</a></li>\r\n");
      out.write("                <li class=\"active\">Log In</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div><!--/end container-->\r\n");
      out.write("    </div> \r\n");
      out.write("    <!--=== End Breadcrumbs v4 ===-->\r\n");
      out.write("\r\n");
      out.write("    <!--=== Login ===-->\r\n");
      out.write("    <div class=\"log-reg-v3 content-md\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-7 md-margin-bottom-50\">\r\n");
      out.write("                    <h2 class=\"welcome-title\">Welcome to Unify</h2>\r\n");
      out.write("                    <p>Suspendisse et tincidunt ipsum, et dignissim urna. Vestibulum nisl tortor, gravida at magna et, suscipit vehicula massa.</p><br>\r\n");
      out.write("                    <div class=\"info-block-v2\">\r\n");
      out.write("                        <i class=\"icon icon-layers\"></i>\r\n");
      out.write("                        <div class=\"info-block-in\">\r\n");
      out.write("                            <h3>Pellentesque vulputate</h3>\r\n");
      out.write("                            <p>Vestibulum non ex volutpat, sodales diam sit amet, semper nunc. Integer sed nibh commodo, tincidunt nisi.</p>\r\n");
      out.write("                        </div>    \r\n");
      out.write("                    </div>    \r\n");
      out.write("                    <div class=\"info-block-v2\">\r\n");
      out.write("                        <i class=\"icon icon-settings\"></i>\r\n");
      out.write("                        <div class=\"info-block-in\">\r\n");
      out.write("                            <h3>Curabitur tincidunt</h3>\r\n");
      out.write("                            <p>Vestibulum non ex volutpat, sodales diam sit amet, semper nunc. Integer sed nibh commodo, tincidunt nisi.</p>\r\n");
      out.write("                        </div>    \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"info-block-v2\">\r\n");
      out.write("                        <i class=\"icon icon-paper-plane\"></i>\r\n");
      out.write("                        <div class=\"info-block-in\">\r\n");
      out.write("                            <h3>Aenean condimentum</h3>\r\n");
      out.write("                            <p>Vestibulum non ex volutpat, sodales diam sit amet, semper nunc. Integer sed nibh commodo, tincidunt nisi.</p>\r\n");
      out.write("                        </div>    \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-5\">\r\n");
      out.write("                    <form id=\"sky-form1\" class=\"log-reg-block sky-form\" action=\"login\" method=\"post\">\r\n");
      out.write("                        <h2>Log in to your account</h2>\r\n");
      out.write("\r\n");
      out.write("                        <section>\r\n");
      out.write("                            <label class=\"input login-input\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"fa fa-user\"></i></span>\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"User name\" name=\"username\" class=\"form-control\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </section>        \r\n");
      out.write("                        <section>\r\n");
      out.write("                            <label class=\"input login-input no-border-top\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"fa fa-lock\"></i></span>\r\n");
      out.write("                                    <input type=\"password\" placeholder=\"Password\" name=\"password\" class=\"form-control\">\r\n");
      out.write("                                </div>    \r\n");
      out.write("                            </label>\r\n");
      out.write("                        </section>\r\n");
      out.write("                        <div class=\"row margin-bottom-5\">\r\n");
      out.write("                            <div class=\"col-xs-6\">\r\n");
      out.write("                                <label class=\"checkbox\">\r\n");
      out.write("                                    <input type=\"checkbox\" name=\"checkbox\"/>\r\n");
      out.write("                                    <i></i>\r\n");
      out.write("                                    Remember me\r\n");
      out.write("                                </label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-xs-6 text-right\">\r\n");
      out.write("                                <a href=\"#\">Forget your Password?</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <button class=\"btn-u btn-u-sea-shop btn-block margin-bottom-20\" type=\"submit\">Log in</button>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"border-wings\">\r\n");
      out.write("                            <span>or</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                            \r\n");
      out.write("                        <div class=\"row columns-space-removes\">\r\n");
      out.write("                            <div class=\"col-lg-6 margin-bottom-10\">\r\n");
      out.write("                                <button type=\"button\" class=\"btn-u btn-u-md btn-u-fb btn-block\"><i class=\"fa fa-facebook\"></i> Facebook Log In</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-lg-6\">\r\n");
      out.write("                                <button type=\"button\" class=\"btn-u btn-u-md btn-u-tw btn-block\"><i class=\"fa fa-twitter\"></i> Twitter Log In</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"margin-bottom-20\"></div>\r\n");
      out.write("                    <p class=\"text-center\">Don't have account yet? Learn more and <a href=\"shop-ui-register.html\">Sign Up</a></p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!--/end row-->\r\n");
      out.write("        </div><!--/end container-->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--=== End Login ===-->     \r\n");
      out.write("\r\n");
      out.write("    <!--=== Shop Suvbscribe ===-->\r\n");
      out.write("    <div class=\"shop-subscribe\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-8 md-margin-bottom-20\">\r\n");
      out.write("                    <h2>subscribe to our weekly <strong>newsletter</strong></h2>\r\n");
      out.write("                </div>  \r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Email your email...\">\r\n");
      out.write("                        <span class=\"input-group-btn\">\r\n");
      out.write("                            <button class=\"btn\" type=\"button\"><i class=\"fa fa-envelope-o\"></i></button>\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </div>    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div><!--/end container-->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--=== End Shop Suvbscribe ===-->\r\n");
      out.write("\r\n");
      out.write("    <!--=== Footer v4 ===-->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("    <!--=== End Footer v4 ===-->\r\n");
      out.write("</div><!--/wrapper-->\r\n");
      out.write("\r\n");
      out.write("<!-- JS Global Compulsory -->           \r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/jquery/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/jquery/jquery-migrate.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- JS Implementing Plugins -->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/back-to-top.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/smoothScroll.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/scrollbar/js/jquery.mCustomScrollbar.concat.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/sky-forms-pro/skyforms/js/jquery.form.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/sky-forms-pro/skyforms/js/jquery.validate.min.js\"></script>\r\n");
      out.write("<!-- JS Customization -->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/custom.js\"></script>\r\n");
      out.write("<!-- JS Page Level -->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/shop.app.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/forms/page_login.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/forms/page_contact_form.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    jQuery(document).ready(function() {\r\n");
      out.write("        App.init();\r\n");
      out.write("        Login.initLogin();\r\n");
      out.write("        App.initScrollBar();             \r\n");
      out.write("        PageContactForm.initPageContactForm();\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/respond.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/html5shiv.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/plugins/placeholder-IE-fixes.js\"></script>    \r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/sky-forms-pro/skyforms/js/sky-forms-ie8.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<!--[if lt IE 10]>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/sky-forms-pro/skyforms/js/jquery.placeholder.min.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/WEB-INF/view/client/static");
    _jspx_th_c_url_0.setVar("url");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }
}
