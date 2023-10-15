<%-- 
    Document   : ChangementMDP
    Created on : 10 oct. 2023, 21:50:53
    Author     : YahyaMrd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://cdn.tailwindcss.com"></script>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;800&display=swap"
              rel="stylesheet">
        <title>Changement MPD</title>
    </head>
    <body>
        <%
            String login = (String) session.getAttribute("ChangerMPD");

            if (login != null && login.equals("yes")) {
        %>
        
        <div class="flex min-h-screen  w-full items-center justify-center bg-gradient-to-r from-indigo-400 to-white font-[Poppins]">
            <form  action="AuthController" method="post" onsubmit="return validateForm()" class="flex flex-col w-1/3 bg-white rounded-xl shadow-xl p-4">
                <div class="flex flex-col mx-auto w-4/5 justify-center items-center p-1 my-2 rounded text-start">
                    <input type="hidden" name="op" value="changerMDP"/>
                    <p class="3/4 text-xl text-indigo-400 font-medium mb-2 text-start">Nouveau password :<p>
                    <div class="flex w-3/4 items-center text-center justify-center bg-gray-100 p-2 mb-6 rounded border border-gray-300">
                        
                        <input id="password" name="password" type="password" placeholder="**************"  class="text-center text-2xl font-bold ml-2 rounded outline-none bg-gray-100 w-full p-1" />

                    </div>
                    <p class="3/4 text-xl text-indigo-400 font-medium mb-2">Confirmer password :<p>
                         <div class="flex w-3/4 items-center text-center justify-center bg-gray-100 p-2 mb-4 rounded border border-gray-300">
                        
                        <input id="confPassword" name="confPassword" type="password" placeholder="**************"  class="text-center text-2xl font-bold ml-2 rounded outline-none bg-gray-100 w-full p-1" />

                    </div>
                    <button class="w-1/2 p-1.5 mt-3 bg-indigo-400 text-white text-lg rounded-xl hover:bg-indigo-700 ">
                        <input type="submit" value="Modifier" class="cursor-pointer"/>
                    </button>

            </form>
        </div>
        <%
        } else {
        %>
        <%response.sendRedirect("Auth.jsp");%>
        
        <%
            }
        %>

        <script>
            function validateForm() {
                var password = document.getElementById("password").value;
                var confPassword = document.getElementById("confPassword").value;

                if (password !== confPassword) {
                    alert("Les mots de passe ne correspondent pas !");
                    return false;
                }
                return true;
            }
        </script>


    </body>
</html>
