package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.GraficaDAO;
import java.util.Arrays;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/jspf/jscss.jspf");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Fuente Open Sans -->\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Open+Sans\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Roboto -->\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Roboto:500\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- FontAwesome-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- JQuery -->\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.12.0.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap 3 -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap Select -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.11.2/css/bootstrap-select.min.css\">\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.11.2/js/bootstrap-select.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.11.2/js/i18n/defaults-*.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- ChartJS -->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.bundle.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\"/>\r\n");
      out.write("        <title>Inkafarma - Dashboard</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-2 sidebar\">\r\n");
      out.write("                        <img src=\"img/perfil.png\" class=\"img-circle\" alt=\"Responsive image\" id=\"imagen\">\r\n");
      out.write("                        <h3 class=\"text-center nombre\">Wilfredo Roel</h3>\r\n");
      out.write("                        <h4 class=\"text-center apellidos\">Pedroso Melgarejo</h4>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <ul class=\"botones\">\r\n");
      out.write("                            <a href=\"#\"><li class=\"activado\"><i class=\"icono izquierda fa fa-home\"></i>Inicio</li></a>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <a><li><i class=\"icono izquierda fa fa-arrow-up\"></i>Records<i class=\"icono derecha fa fa-chevron-down\"></i></li></a>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <a href=\"#\"><li>Record Semanal</li></a>\r\n");
      out.write("                                <a href=\"#\"><li>Record Mensual</li></a>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <a><li><i class=\"icono izquierda fa fa-bar-chart\"></i>Balances<i class=\"icono derecha fa fa-chevron-down\"></i></li></a>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <a href=\"#\"><li>Tickets Top</li></a>\r\n");
      out.write("                                <a href=\"#\"><li>Tickets Reportados</li></a>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <a><li><i class=\"icono izquierda fa fa-crosshairs\"></i>Dirección<i class=\"icono derecha fa fa-chevron-down\"></i></li></a>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <a href=\"#\"><li>Incidentes Top</li></a>\r\n");
      out.write("                                <a href=\"#\"><li>Requerimientos Top</li></a>\r\n");
      out.write("                                <a href=\"#\"><li>Inc. Top fuera del SLA</li></a>\r\n");
      out.write("                                <a href=\"#\"><li>Req. Top fuera del SLA</li></a>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <br>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-10 col-md-offset-2 main\">\r\n");
      out.write("                        <div class=\"row encabezado\">\r\n");
      out.write("                            <img src=\"img/inkafarmaheader.png\">   \r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-8 col-md-offset-3\">\r\n");
      out.write("                                <canvas id=\"myChart\" width=\"400\" height=\"200\"></canvas>\r\n");
      out.write("                                <script language=\"Javascript\" type=\"text/javascript\" src=\"js/linechart.js\"></script>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <br><br>\r\n");
      out.write("                        <script src=\"js/main.js\"></script>                   \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
