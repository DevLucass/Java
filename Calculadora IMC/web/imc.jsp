<%-- 
    Document   : imc
    Created on : 11/03/2020, 21:18:59
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean scope="page" id="imc" class="br.uninove.matematica.imc"/>
        <jsp:setProperty name="imc" property="peso" value="<%=Float.parseFloat(request.getParameter("peso"))%>"/>
        <jsp:setProperty name="imc" property="altura" value="<%=Float.parseFloat(request.getParameter("altura"))%>"/>
        
        <h2>Cálculo do IMC</h2>
        <br/>
        <hr/>
        <h3>IMC:<%=String.format("%.2f", imc.calculaIMC())%></h3><br/>
        <h3>IMC:<%=String.format(imc.montaClassificacao())%></h3><br/>
    
    </body>
</html>
