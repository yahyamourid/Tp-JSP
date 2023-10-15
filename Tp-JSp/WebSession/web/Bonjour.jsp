<%-- 
    Document   : Bonjour
    Created on : 10 oct. 2023, 12:28:43
    Author     : YahyaMrd
--%>

<%@page import="ma.projet.entities.Client"%>
<%@page import="ma.projet.service.ClientService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://cdn.tailwindcss.com"></script>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;800&display=swap"
              rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body class="font-[Poppins]">
        <%
            String login = (String) session.getAttribute("login");
            String email = (String) session.getAttribute("email");
            ClientService cs = new ClientService();

            if (login != null && login.equals("loginTrue")) {
                Client client = cs.getByEmail(email);
                char c1 = client.getNom().charAt(0);
                char c2 = client.getPrenom().charAt(0);
        %>
        <div class="justify-between  flex pt-4 mx-10 ">

            <p class="text-2xl font-semibold  ">Bonjour <span class="text-indigo-400"><%=client.getNom()%></span> <p>
            <div class="px-3 py-6 rounded-full items-center flex  bg-indigo-400 text-white">
                
                <p class="m-2 text-xl font-semibold "><%=c1 + "" + c2%></p>
                <a href="AuthController?op=deconnecter">
                    <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="hover:scale-105 w-6 h-6">
                    <path stroke-linecap="round" stroke-linejoin="round" d="M15.75 9V5.25A2.25 2.25 0 0013.5 3h-6a2.25 2.25 0 00-2.25 2.25v13.5A2.25 2.25 0 007.5 21h6a2.25 2.25 0 002.25-2.25V15m3 0l3-3m0 0l-3-3m3 3H9" />
                    </svg>

                </a>
                
            </div>

        </div>

        <%} else {%>


        <p>Acces non autoriser </p>
        <a href="Auth.jsp">connexion</a>
        <%}%>

    </body>
</html>
