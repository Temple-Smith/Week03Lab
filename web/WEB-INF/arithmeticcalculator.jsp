<%-- 
    Document   : arithmeticcalculator
    Created on : 13-Sep-2022, 11:53:29 PM
    Author     : Drew-
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Week 3 Lab - Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="ArithmeticCalculator">
            First: <input type="text" name="First" value="${First}"><br>
            Second: <input type="text" name="Second" value="${Second}"><br>
            <input type="submit" name="action" value="+"/>
            <input type="submit" name="action" value="-"/>  
            <input type="submit" name="action" value="*"/>  
            <input type="submit" name="action" value="%"/>  
        </form>
        <p>${result}<p>
        <a href="AgeCalculator">Age Calculator</a>
    </body>
</html>
