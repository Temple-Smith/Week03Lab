<%-- 
    Document   : agecalculator
    Created on : 13-Sep-2022, 9:03:20 AM
    Author     : Drew-
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Week 3 Lab - Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="AgeCalculator">
            Enter your age: <input type="text" name="Age" value=""><br>
            <input type="submit" value="Age next birthday">    
        </form>
           <p>${age}</p>
           <a href="ArithmeticCalculator">Arithmetic Calculator</a>
    </body>
</html>
