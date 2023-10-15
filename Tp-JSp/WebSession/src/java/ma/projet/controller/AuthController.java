/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ma.projet.entities.Client;
import ma.projet.service.ClientService;
import ma.projet.util.EmailSender;
import ma.projet.util.Utils;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author YahyaMrd
 */
@WebServlet(name = "AuthController", urlPatterns = {"/AuthController"})
public class AuthController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ClientService cs = new ClientService();

        RequestDispatcher dispatcher = null;
        
        String op = request.getParameter("op");
        if (op != null && op.equals("connecter")) {
            String email = request.getParameter("email");
            String password = Utils.MD5(request.getParameter("password"));

            Client client = cs.getByEmail(email);

            if (client != null && password.equals(client.getPassword())) {
                HttpSession session = request.getSession();
            session.setAttribute("login", "loginTrue");
            session.setAttribute("email", email);
            session.getAttribute("login");
                response.sendRedirect("Bonjour.jsp");
//                dispatcher = request.getRequestDispatcher("Bonjour.jsp");
//                dispatcher.forward(request, response);
//            }
            } else {
            response.sendRedirect("Auth.jsp?err=400");
//                response.sendRedirect("Auth.jsp?err=not_found");
//                dispatcher = request.getRequestDispatcher("Auth.jsp");
//                request.setAttribute("erreur", "not found");
//                dispatcher.forward(request, response);
            }
            
        } else if (op != null && op.equals("deconnecter")) {
            HttpSession session = request.getSession();
            session.invalidate();
            response.sendRedirect("Auth.jsp");
        } else if (op != null && op.equals("envoyerCode")) {
            String email = request.getParameter("email");
            if (cs.getByEmail(email) != null) {
                Random random = new Random();
                int code = 1000 + random.nextInt(9000);
                EmailSender.sendEmail(email, "Code d'activation", "Votre code d'activation est : " + code);
                HttpSession session = request.getSession();
                session.setAttribute("email", email);
                session.setAttribute("codeActiv", Utils.MD5(Integer.toString(code)));
                response.sendRedirect("RecuperationCode.jsp");

            }

        } else if (op != null && op.equals("recupererCode")) {
            HttpSession session = request.getSession();
            String email = (String) session.getAttribute("email");
            String codeActiv = (String) session.getAttribute("codeActiv");
            String code = request.getParameter("code");

            if (email != null && codeActiv != null && codeActiv.equals(Utils.MD5(code))) {
                session.setAttribute("ChangerMPD", "yes");
                response.sendRedirect("ChangementMDP.jsp");
            } else {
                
                response.sendRedirect("RecuperationCode.jsp");
            }
            
        } else if (op != null && op.equals("changerMDP")) {
            String password = request.getParameter("password");
            String email = (String) request.getSession().getAttribute("email");
            Client client = cs.getByEmail(email);
            client.setPassword(password);
            cs.update(client);
            HttpSession session = request.getSession();
            session.invalidate();
            response.sendRedirect("Auth.jsp");

        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
