<%-- 
    Document   : EnvoyerCode
    Created on : 10 oct. 2023, 21:49:55
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
        <title>Code D'activation</title>
    </head>
    <body>
        <div class="flex min-h-screen  w-full items-center justify-center bg-gradient-to-r from-indigo-400 to-white font-[Poppins]">
            <form action="AuthController" class="flex flex-col w-2/3 bg-white rounded-xl shadow-xl items-center justify-center p-4">
                <div class="flex w-4/5  items-center justify-between  p-1 my-2 rounded">
                    <input type="hidden" name="op" value="envoyerCode"/>
                    <p class="1/6 text-lg text-indigo-400 font-semibold">email<p>
                    <div class="flex w-3/6 items-center justify-cente bg-gray-100 p-1 my-2 rounded border border-gray-300">
                        <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="pl-1 w-5 h-5 text-gray-500">
                        <path stroke-linecap="round" stroke-linejoin="round" d="M21.75 6.75v10.5a2.25 2.25 0 01-2.25 2.25h-15a2.25 2.25 0 01-2.25-2.25V6.75m19.5 0A2.25 2.25 0 0019.5 4.5h-15a2.25 2.25 0 00-2.25 2.25m19.5 0v.243a2.25 2.25 0 01-1.07 1.916l-7.5 4.615a2.25 2.25 0 01-2.36 0L3.32 8.91a2.25 2.25 0 01-1.07-1.916V6.75" />
                        </svg>
                        <input name="email" type="text" placeholder="email" class="ml-2 rounded outline-none bg-gray-100 w-full p-1 focus:ring " />

                    </div>
                    <button class="w-1/6 p-1.5  bg-indigo-400 text-white text-lg rounded-xl hover:bg-indigo-700 ">
                        <input type="submit" value="Envoyer" class="cursor-pointer"/>
                    </button>

            </form>
        </div>

    </body>
</html>
