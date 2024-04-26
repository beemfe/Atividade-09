<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <title>Dados da Conta</title>
</head>
<body>
    <h1>Dados das Conta</h1>
    <table border="1">
        <tr>
            <th>Cliente</th>
            <th>Número da Conta</th>
            <th>Saldo</th>
        </tr>
        <c:forEach var="contas" items="${contas}">
            <tr>
                <td>${contas.cliente}</td>
                <td>${contas.num_conta}</td>
                <td>${contas.saldo}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>