package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ma.projet.entities.Client;
import ma.projet.service.ClientService;

public final class Bonjour_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"https://cdn.tailwindcss.com\"></script>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;800&display=swap\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"font-[Poppins]\">\n");
      out.write("        ");

            String login = (String) session.getAttribute("login");
            String email = (String) session.getAttribute("email");
            ClientService cs = new ClientService();

            if (login != null && login.equals("loginTrue")) {
                Client client = cs.getByEmail(email);
                char c1 = client.getNom().charAt(0);
                char c2 = client.getPrenom().charAt(0);
        
      out.write("\n");
      out.write("        <div class=\"justify-between  flex pt-4 mx-10 \">\n");
      out.write("\n");
      out.write("            <p class=\"text-2xl font-semibold  \">Bonjour <span class=\"text-indigo-400\">");
      out.print(client.getNom());
      out.write("</span> <p>\n");
      out.write("            <div class=\"px-3 py-6 rounded-full items-center flex  bg-indigo-400 text-white\">\n");
      out.write("                \n");
      out.write("                <p class=\"m-2 text-xl font-semibold \">");
      out.print(c1 + "" + c2);
      out.write("</p>\n");
      out.write("                <a href=\"AuthController?op=deconnecter\">\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 24 24\" stroke-width=\"1.5\" stroke=\"currentColor\" class=\"hover:scale-105 w-6 h-6\">\n");
      out.write("                    <path stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M15.75 9V5.25A2.25 2.25 0 0013.5 3h-6a2.25 2.25 0 00-2.25 2.25v13.5A2.25 2.25 0 007.5 21h6a2.25 2.25 0 002.25-2.25V15m3 0l3-3m0 0l-3-3m3 3H9\" />\n");
      out.write("                    </svg>\n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
} else {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <p>Acces non autoriser </p>\n");
      out.write("        <a href=\"Auth.jsp\">connexion</a>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
