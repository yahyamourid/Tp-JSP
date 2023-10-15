package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Inscription_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"https://cdn.tailwindcss.com\"></script>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;800&display=swap\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("        <title>Inscription</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"flex min-h-screen w-full items-center justify-center bg-gradient-to-r from-indigo-400 to-white font-[Poppins]\">\n");
      out.write("            <div class=\"flex  w-8/12 m-10 shadow-xl \">\n");
      out.write("                <form action=\"InscriptionController\" method=\"post\" class=\"flex flex-col w-2/3 bg-white rounded-l-xl items-center justify-center p-4\">\n");
      out.write("                    <p class=\"text-indigo-400 text-3xl font-semibold py-4\">Creer votre compte</p>\n");
      out.write("                    <hr class=\"border-4 rounded border-indigo-400 w-1/2 inline-block mb-4  \">\n");
      out.write("                    <input type=\"hidden\" name=\"op\" value=\"ajout\"/>\n");
      out.write("                     <div class=\"flex w-3/5 items-center justify-cente bg-gray-100 p-1 my-2 rounded\">\n");
      out.write("                        <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 24 24\" stroke-width=\"1.5\" stroke=\"currentColor\" class=\"pl-1 w-5 h-5 text-gray-500\">\n");
      out.write("                        <path stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M15.75 6a3.75 3.75 0 11-7.5 0 3.75 3.75 0 017.5 0zM4.501 20.118a7.5 7.5 0 0114.998 0A17.933 17.933 0 0112 21.75c-2.676 0-5.216-.584-7.499-1.632z\" />\n");
      out.write("                        </svg>\n");
      out.write("\n");
      out.write("                        <input name=\"nom\" type=\"text\" placeholder=\"nom\" class=\"ml-2 rounded outline-none bg-gray-100 p-1\" />\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flex w-3/5 items-center  bg-gray-100 p-1 my-2 rounded\">\n");
      out.write("                        <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 24 24\" stroke-width=\"1.5\" stroke=\"currentColor\" class=\"pl-1 w-5 h-5 text-gray-500\">\n");
      out.write("                        <path stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M15.75 6a3.75 3.75 0 11-7.5 0 3.75 3.75 0 017.5 0zM4.501 20.118a7.5 7.5 0 0114.998 0A17.933 17.933 0 0112 21.75c-2.676 0-5.216-.584-7.499-1.632z\" />\n");
      out.write("                        </svg>\n");
      out.write("\n");
      out.write("                        <input name=\"prenom\" type=\"text\" placeholder=\"prenom\" class=\"ml-2 rounded outline-none bg-gray-100 p-1\" />\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flex w-3/5 items-center justify-cente bg-gray-100 p-1 my-2 rounded\">\n");
      out.write("                        <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 24 24\" stroke-width=\"1.5\" stroke=\"currentColor\" class=\"pl-1 w-5 h-5 text-gray-500\">\n");
      out.write("                        <path stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M21.75 6.75v10.5a2.25 2.25 0 01-2.25 2.25h-15a2.25 2.25 0 01-2.25-2.25V6.75m19.5 0A2.25 2.25 0 0019.5 4.5h-15a2.25 2.25 0 00-2.25 2.25m19.5 0v.243a2.25 2.25 0 01-1.07 1.916l-7.5 4.615a2.25 2.25 0 01-2.36 0L3.32 8.91a2.25 2.25 0 01-1.07-1.916V6.75\" />\n");
      out.write("                        </svg>\n");
      out.write("                        <input name=\"email\" type=\"text\" placeholder=\"email\" class=\"ml-2 rounded outline-none bg-gray-100 w-full p-1\" />\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flex w-3/5 items-center justify-cente bg-gray-100 p-1 my-2 rounded\">\n");
      out.write("                        <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 24 24\" stroke-width=\"1.5\" stroke=\"currentColor\" class=\"pl-1 w-5 h-5 text-gray-500\">\n");
      out.write("                        <path stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M15.75 5.25a3 3 0 013 3m3 0a6 6 0 01-7.029 5.912c-.563-.097-1.159.026-1.563.43L10.5 17.25H8.25v2.25H6v2.25H2.25v-2.818c0-.597.237-1.17.659-1.591l6.499-6.499c.404-.404.527-1 .43-1.563A6 6 0 1121.75 8.25z\" />\n");
      out.write("                        </svg>\n");
      out.write("\n");
      out.write("                        <input name=\"password\" type=\"password\" placeholder=\"mot de passe\" class=\"ml-2 rounded outline-none bg-gray-100 p-1\" />\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                    <div class=\"flex flex-col items-center w-3/5\">\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"flex w-3/5 items-center  bg-gray-100 p-1 my-2 rounded\">\n");
      out.write("                        <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 24 24\" stroke-width=\"1.5\" stroke=\"currentColor\" class=\"pl-1 w-5 h-5 text-gray-500\">\n");
      out.write("                        <path stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M6.75 3v2.25M17.25 3v2.25M3 18.75V7.5a2.25 2.25 0 012.25-2.25h13.5A2.25 2.25 0 0121 7.5v11.25m-18 0A2.25 2.25 0 005.25 21h13.5A2.25 2.25 0 0021 18.75m-18 0v-7.5A2.25 2.25 0 015.25 9h13.5A2.25 2.25 0 0121 11.25v7.5m-9-6h.008v.008H12v-.008zM12 15h.008v.008H12V15zm0 2.25h.008v.008H12v-.008zM9.75 15h.008v.008H9.75V15zm0 2.25h.008v.008H9.75v-.008zM7.5 15h.008v.008H7.5V15zm0 2.25h.008v.008H7.5v-.008zm6.75-4.5h.008v.008h-.008v-.008zm0 2.25h.008v.008h-.008V15zm0 2.25h.008v.008h-.008v-.008zm2.25-4.5h.008v.008H16.5v-.008zm0 2.25h.008v.008H16.5V15z\" />\n");
      out.write("                        </svg>\n");
      out.write("\n");
      out.write("                        <input name=\"date\" type=\"date\"  class=\"ml-2 rounded outline-none bg-gray-100 p-1 \" />\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <button class=\"w-2/5 p-2 bg-indigo-400 mt-6 text-white text-lg rounded-xl hover:bg-indigo-700 \">\n");
      out.write("                        <input type=\"submit\" name=\"inscrire\" class=\"cursor-pointer\" value=\"S'inscrire\"/>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("                <div class=\"flex justify-center text-center items-center flex-col w-1/3 bg-indigo-400 text-white text-xl rounded-r-xl\">\n");
      out.write("                    <p class=\"text-white text-3xl font-semibold py-4\">Vous avez un compte?</p>\n");
      out.write("                    <hr class=\"border-4 rounded border-white w-1/2 inline-block mb-4  \">\n");
      out.write("                    <button class=\" p-2 w-2/4 bg-white mt-6 text-indigo-400 text-lg rounded-xl hover:bg-indigo-100\">\n");
      out.write("                        <a href=\"Auth.jsp\">Connection</a>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
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
