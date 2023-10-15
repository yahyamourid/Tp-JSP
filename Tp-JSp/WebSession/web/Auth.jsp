<%-- 
    Document   : Auth
    Created on : 10 oct. 2023, 11:34:08
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
        <title>Authentification</title>
    </head>
    <body>
        <% String err = request.getParameter("err");%>
        <div class="flex min-h-screen w-full items-center justify-center bg-gradient-to-r from-indigo-400 to-white font-[Poppins]">
            <div class="flex  w-8/12 m-10 shadow-xl ">
                <form action="AuthController" method="post" class="flex flex-col w-2/3 bg-white rounded-l-xl items-center justify-center p-4" >
                    <p class="text-indigo-400 text-3xl font-semibold py-8">Connecter à  votre compte</p>
                    <hr class="border-4 rounded border-indigo-400 w-1/2 inline-block mb-8  ">
                    <div class="flex w-3/5 items-center justify-cente bg-gray-100 p-1 my-2 rounded">
                        <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="pl-1 w-5 h-5 text-gray-500">
                        <path stroke-linecap="round" stroke-linejoin="round" d="M21.75 6.75v10.5a2.25 2.25 0 01-2.25 2.25h-15a2.25 2.25 0 01-2.25-2.25V6.75m19.5 0A2.25 2.25 0 0019.5 4.5h-15a2.25 2.25 0 00-2.25 2.25m19.5 0v.243a2.25 2.25 0 01-1.07 1.916l-7.5 4.615a2.25 2.25 0 01-2.36 0L3.32 8.91a2.25 2.25 0 01-1.07-1.916V6.75" />
                        </svg>
                        <input name="email" type="text" placeholder="email" class="ml-2 rounded outline-none bg-gray-100 w-full p-1" />

                    </div>
                    <div class="flex w-3/5 items-center justify-cente bg-gray-100 p-1 my-2 rounded">
                        <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="pl-1 w-5 h-5 text-gray-500">
                        <path stroke-linecap="round" stroke-linejoin="round" d="M15.75 5.25a3 3 0 013 3m3 0a6 6 0 01-7.029 5.912c-.563-.097-1.159.026-1.563.43L10.5 17.25H8.25v2.25H6v2.25H2.25v-2.818c0-.597.237-1.17.659-1.591l6.499-6.499c.404-.404.527-1 .43-1.563A6 6 0 1121.75 8.25z" />
                        </svg>

                        <input name="password" type="password" placeholder="mot de passe" class="ml-2 rounded outline-none bg-gray-100 p-1" />

                    </div>
                    <% if (err != null && err.equals("400")){ %>
                    <div class="my-2 text-red-600">
                        <p>email ou mot de passe incorrect(s)</p>
                    </div>
                    <%}%>
                    <button class="w-2/5 p-2 bg-indigo-400 mt-6 text-white text-lg rounded-xl hover:bg-indigo-700 ">
                        <input type="hidden" name="op" value="connecter"/>
                        <input name="connecter" value="connecter" type="submit" class="cursor-pointer"/>
                    </button>
                    <a href="EnvoyerCode.jsp" class="text-lg text-indigo-800 mt-3">mot de passe oublier?</a>
                </form>
                <div class="flex justify-center text-center items-center flex-col w-1/3 bg-indigo-400 text-white text-xl rounded-r-xl">
                    <p class="text-white text-3xl font-semibold py-4">Vous n'avez pas de compte?</p>
                    <hr class="border-4 rounded border-white w-1/2 inline-block mb-4  ">
                    <button class=" p-2 w-2/4 bg-white mt-6 text-indigo-400 text-lg rounded-xl hover:bg-indigo-100">
                        <a href="Inscription.jsp">S'inscrire</a>
                    </button>
                </div>
            </div>



        </div>

    </body>
</html>
