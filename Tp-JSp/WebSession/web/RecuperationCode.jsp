<%-- 
    Document   : RecuperationCode
    Created on : 10 oct. 2023, 21:50:31
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
        <title>Recuperation code</title>
    </head>
    <body>
        
        
       
        <div class="flex min-h-screen  w-full items-center justify-center bg-gradient-to-r from-indigo-400 to-white font-[Poppins]">
            <form action="AuthController" class="flex flex-col w-1/3 bg-white rounded-xl shadow-xl p-4">
                <div class="flex flex-col mx-auto w-4/5 justify-center items-center p-1 my-2 rounded">
                    <input type="hidden" name="op" value="recupererCode"/>
                    <p class="3/4 text-xl text-indigo-400 font-semibold mb-4">code d'activation<p>
                    <div class="flex w-3/4 items-center text-center justify-center bg-gray-100 p-2 my-2 rounded border border-gray-300">
                        
                        <input name="code" type="number" placeholder="xxxx"  class="text-center text-2xl font-bold ml-2 rounded outline-none bg-gray-100 w-full p-1" />

                    </div>
                    <button class="w-1/2 p-1.5 mt-3 bg-indigo-400 text-white text-lg rounded-xl hover:bg-indigo-700 ">
                        <input type="submit" value="Envoyer" class="cursor-pointer"/>
                    </button>

            </form>
        </div>
            
    </body>
</html>
