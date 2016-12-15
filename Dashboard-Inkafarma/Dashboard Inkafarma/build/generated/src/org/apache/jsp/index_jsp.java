package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/jspf/userHeader.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximun-scale=1.0, minumum-scale=1.0\">\r\n");
      out.write("        <title>Inkafarma - Dashboard</title>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/> \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("    <link href=\"css/header.css\" rel=\"stylesheet\" type=\"text/css\"/> \r\n");
      out.write("    <div class=\"container-fluid\" id=\"encabezado\">\r\n");
      out.write("        <section class=\"main row\">\r\n");
      out.write("            <div class=\"col-md-4\"> \r\n");
      out.write("                <img src=\"img/inkafarmaheader.png\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <section class=\"main row\">\r\n");
      out.write("                </section>\r\n");
      out.write("            </div><!-- /.container-fluid -->\r\n");
      out.write("    </div>    \r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("        <div class=\"contenedor-menu\">\r\n");
      out.write("            <a href=\"#\" class=\"btn-menu\">Menú<i class=\"icono fa fa-bars\"></i></a>\r\n");
      out.write("            <ul class=\"menu\">\r\n");
      out.write("                <li><a href=\"#\"><i class=\"icono izquierda fa fa-home\"></i>Inicio</a></li>\r\n");
      out.write("                <li><a href=\"#\"><i class=\"icono izquierda fa fa-star\"></i>Productos<i class=\"icono derecha fa fa-chevron-down\"></i></a>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"#\">Item 1</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Item 2</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Item 3</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Item 4</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a href=\"#\"><i class=\"icono izquierda fa fa-share-alt\"></i>Redes Sociales<i class=\"icono derecha fa fa-chevron-down\"></i></a>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"#\">Item 1</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Item 2</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Item 3</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Item 4</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a href=\"#\"><i class=\"icono izquierda fa fa-envelope\"></i>Contáctanos</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-1.12.0.min.js\"></script>\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
}
