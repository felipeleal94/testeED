package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gerenciamentoAutomoveis_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script src=\"jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div style=\"border:solid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\"><h1>Dados Gerais</h1></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-2\"><span>Marca:</span></div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <select>\n");
      out.write("                        <option value=\"volvo\">Volvo</option>\n");
      out.write("                        <option value=\"saab\">Saab</option>\n");
      out.write("                        <option value=\"mercedes\">Mercedes</option>\n");
      out.write("                        <option value=\"audi\">Audi</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2\"><span>Modelo:</span></div>\n");
      out.write("                <div class=\"col-md-4\"><input type=\"text\" name=\"modelo\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-2\"><span>Ano:</span></div>\n");
      out.write("                <div class=\"col-md-4\"><input type=\"text\" name=\"ano\"></div>\n");
      out.write("                <div class=\"col-md-2\"><span>Ano Modelo:</span></div>\n");
      out.write("                <div class=\"col-md-4\"><input type=\"text\" name=\"anomodelo\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-2\"><span>KM:</span></div>\n");
      out.write("                <div class=\"col-md-4\"><input type=\"text\" name=\"km\"></div>\n");
      out.write("                <div class=\"col-md-2\"><span>Combustível:</span></div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <select>\n");
      out.write("                        <option value=\"Gasolina\">Gasolina</option>\n");
      out.write("                        <option value=\"Diesel\">Diesel</option>\n");
      out.write("                        <option value=\"Diesel\">Alcool</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-2\"><span>Cor:</span></div>\n");
      out.write("                <div class=\"col-md-4\"><input type=\"text\" name=\"cor\"></div>\n");
      out.write("                <div class=\"col-md-2\"><span>Portas:</span></div>\n");
      out.write("                <div class=\"col-md-4\"><input type=\"text\" name=\"portas\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-2\"><span>Cambio:</span></div>\n");
      out.write("                <div class=\"col-md-4\"><input type=\"text\" name=\"cambio\"></div>\n");
      out.write("                <div class=\"col-md-2\"><span>Carroceiria:</span></div>\n");
      out.write("                <div class=\"col-md-4\"><input type=\"text\" name=\"carroceiria\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-2\"><span>Final Placa:</span></div>\n");
      out.write("                <div class=\"col-md-4\"><input type=\"text\" name=\"finalplaca\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-2\"><span>Descrição:</span></div>\n");
      out.write("                <div class=\"col-md-10\"><textarea rows=\"4\" cols=\"50\"></textarea>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-2\"><span>Valor:</span></div>\n");
      out.write("                <div class=\"col-md-4\"><input type=\"text\" name=\"valor\"></div>\n");
      out.write("            </div>\n");
      out.write("            <br><br>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"border:solid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\"><h2>Acessórios</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container\" style=\"margin:45px auto;\">\n");
      out.write("                    <div class=\"checkbox\">\n");
      out.write("                        <label>\n");
      out.write("                            <input type=\"checkbox\" id=\"checkall\"/> Selecionar Todos/Apagar Todos\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("                    <hr/>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-2\">\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" class=\"checkitem\" name=\"arCondicionado\"> Ar Condicionado\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" class=\"checkitem\" name=\"direcaoEletrica\"> Direção Elétrica\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" class=\"checkitem\" name=\"centralMultimidia\"> Central Multimídia\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" class=\"checkitem\" name=\"cameraRe\"> Camera de Ré\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" class=\"checkitem\" name=\"\">\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" class=\"checkitem\" name=\"\">\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" class=\"checkitem\" name=\"\">\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" class=\"checkitem\" name=\"\">\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" class=\"checkitem\" name=\"\">\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" class=\"checkitem\" name=\"\">\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-10\">\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" class=\"checkitem\" name=\"sensorEstacionamento\"> Sensor de Estacionamento\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" class=\"checkitem\" name=\"repetidorSeta\"> Repetidor de Seta\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" class=\"checkitem\" name=\"modoEconomico\"> Modo Econômico\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" class=\"checkitem\" name=\"alarme\"> Alarme\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" class=\"checkitem\" name=\"\"> \n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" class=\"checkitem\" name=\"\"> \n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" class=\"checkitem\" name=\"\"> \n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" class=\"checkitem\" name=\"\"> \n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" class=\"checkitem\" name=\"\"> \n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" class=\"checkitem\" name=\"\"> \n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <script src=\"jquery.min.js\"></script>\n");
      out.write("                <script src=\"bootstrap.min.js\"></script>\n");
      out.write("                <script>\n");
      out.write("                    $(\"#checkall\").change(function () {\n");
      out.write("                        $(\".checkitem\").prop(\"checked\", $(this).prop(\"checked\"))\n");
      out.write("                    })\n");
      out.write("                    $(\".checkitem\").change(function () {\n");
      out.write("                        if ($(this).prop(\"checked\") == false) {\n");
      out.write("                            $(\"#checkall\").prop(\"checked\", false)\n");
      out.write("                        }\n");
      out.write("                        if ($(\".checkitem:checked\").length == $(\".checkitem\").length) {\n");
      out.write("                            $(\"#checkall\").prop(\"checked\", true)\n");
      out.write("                        }\n");
      out.write("                    })\n");
      out.write("                </script>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>  \n");
      out.write("</body>\n");
      out.write("</html>\n");
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
